package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
		//지역변수는 선언할때 데이터가 들어가야함
		ServerSocket serverSocket=null;
		Socket socket=null;
		
		try {
			//5000번 port에서 클라이언트 접속을 기다릴 수 있는
			//serversocket 객체 생성해서 참조값을 변수에 담기
			serverSocket=new ServerSocket(5000); //생성자 호출
			
			//무한 루프돌면서
			while(true) {
				//클라이언트의 접속을 기다린다.
			socket=serverSocket.accept(); //연결요청을 하면 accept가 리턴해주는건 socket의 참조값
			System.out.println("클라이언트가 접속함~");
			//socket 변수안에는 방금 연결 요청을 한
			//클라이언트와 연결된 Socket 객체의 참조값이 들어있음
			String ip=socket.getInetAddress().getHostAddress(); //ip주소얻어오기
			InputStream is=socket.getInputStream(); //클라이언트가 보낸 데이터를 읽어들일 수 있는 객체
			
			InputStreamReader isr=new InputStreamReader(is); //is 참조값
			BufferedReader br=new BufferedReader(isr); //isr 참조값
			String msg=br.readLine(); //클라이언트가 전송한 문자열 읽기
			//콘솔에 출력하고 skcket 객체 닫기
			System.out.println(ip+":"+msg);
			socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket!=null)serverSocket.close();
			}catch(Exception e) {}
			
		}
		System.out.println("메인 메소드 종료됩니다.");
	}
}
