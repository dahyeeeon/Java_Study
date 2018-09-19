package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			
			@Override
			public void up() {
				System.out.println("체널 업업~~");
			}
			
			@Override
			public void down() {
				System.out.println("체널 다운다운~");
			}
		};
		//useRemocon()메소드에 remocon type 참조값 전달
			useRemocon(r1);
		
			//바로 전달
			useRemocon(new Remocon() {
				
				@Override
				public void up() {
					System.out.println("볼륨채널 업");
				}
				
				@Override
				public void down() {
					System.out.println("볼륨채널 다운");
				}
			});
		
		};
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
