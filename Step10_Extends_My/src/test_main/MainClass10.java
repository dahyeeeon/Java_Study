package test_main;

import test_mypac.Bullet;
import test_mypac.Gun;

public class MainClass10 {
	public static void main(String[] args) {
		
		Gun gun1=new Gun(new Bullet());
		gun1.fire();
		
		Gun gun2=new Gun(null);
		gun2.fire();
	}

}
