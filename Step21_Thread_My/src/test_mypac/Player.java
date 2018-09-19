package test_mypac;

public class Player extends Thread{
//필드
	private String name;
	///생성자
	public Player(String name) {
		this.name=name;
	}
	@Override
		public void run() {
			System.out.println(name+"(이)가 기다리고 있음");
			int count=0;
			while(true) {
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			System.out.println(name+":"+count+"번째 수행");
			}
		}
}
