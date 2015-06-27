package com.lec.java.thread02;

// 자바는 다중 상속을 지원하지 않음
// -> 다른 클래스를 상속받고 있는 경우에는, 
// Thread 클래스를 상속받을 수 없는 문제가 발생
// -> 인터페이스를 구현해서 쓰레드를 생성할 수 있는 방법을 제공

// 쓰레드 사용 방법 2:
// 1. Runnable 인터페이스를 구현하는 클래스를 정의
// 2. 정의한 클래스에서 run() 메소드를 override
// 3. Runnable을 구현하는 클래스의 인스턴스를 생성
// 4. 만들어진 인스턴스를 Thread 생성자의 매개변수로 주면서, Thread 인스턴스를 생성
// 5. 생성된 Thread 인스턴스의 start() 메소드를 호출


public class Thread02Main {

	public static void main(String[] args) {
		System.out.println("쓰레드 생성 2");
		
		// 3. Runnable을 구현하는 클래스의 인스턴스를 생성
		Runnable runnable1 = new MyRunnable("안녕~, 아두이노!");
		Runnable runnable2 = new MyRunnable("Hello, Android!");
		Runnable runnable3 = new MyRunnable("멀티 쓰레드");

		// 4. Runnable을 이용해서 Thread 인스턴스를 생성
		Thread th1 = new Thread(runnable1);
		Thread th2 = new Thread(runnable2);
		
		// 5. Thread 인스턴스의 start() 메소드를 호출
		th1.start();
		th2.start();
		
		new Thread(runnable3).start();
		new Thread(new MyRunnable("Java Thread")).start();

	} // end main()

} // end class Thread02Main


// 1. Runnable 인터페이스를 구현하는 클래스를 정의
class MyRunnable implements Runnable {
	private String msg;
	private int count;
	
	public MyRunnable() {}
	public MyRunnable(String msg) {
		this.msg = msg;
		count = 0;
	}
	
	// 2. 정의한 클래스에서 run() 메소드를 override - 쓰레드 할 일
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(count++ + " : " + msg);
		} // end for
		
	} // end run()
	
} // end class MyRunnable





















