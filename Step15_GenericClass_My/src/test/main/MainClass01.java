package test.main;

import test.mypac.Apple;
import test.mypac.AppleBox;

import test.mypac.Banana;
import test.mypac.BananaBox;

import test.mypac.Orange;
import test.mypac.OrangeBox;

public class MainClass01 {
	public static void main(String[] args) {
		//Apple 객체를 담으려면
		AppleBox box1=new AppleBox();
		box1.push(new Apple());
		
		//바나나 객체를 담으려면
		BananaBox box2=new BananaBox();
		box2.push(new Banana());
		
		//오렌지 객체를 담으려면
		OrangeBox box3=new OrangeBox();
		box3.push(new Orange());
	}

}
