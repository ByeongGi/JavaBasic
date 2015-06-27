package com.lec.java.inner03;

public class Inner03Main {

	public static void main(String[] args) {
		System.out.println("외부/내부 클래스의 this");
		
		TestOuter out = new TestOuter(100);
		TestOuter.TestInner in1 = out.new TestInner(111);
		in1.printValue();
		
		System.out.println();
		TestOuter.TestInner in2 = new TestOuter(200).new TestInner(222);
		in2.printValue();
		
		System.out.println();
		// in3 인스턴스는 in1과 외부 클래스의 인스턴스를 공유
		TestOuter.TestInner in3 = out.new TestInner(333);
		
		// in4 인스턴스는 in2와 별개의 외부 클래스 인스턴스를 통해서 생성된 것임.
		TestOuter.TestInner in4 = new TestOuter(200).new TestInner(444);

	} // end main()

} // end class Inner03Main

















