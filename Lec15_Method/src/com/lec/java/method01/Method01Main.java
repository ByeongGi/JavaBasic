package com.lec.java.method01;

public class Method01Main {
	
	public static void main(String[] args) {
		System.out.println("메소드(함수) Method(Function)");
		
		System.out.println("안녕하세요.");
		System.out.println("제 이름은 오쌤입니다.");
		
		System.out.println("안녕하세요.");
		System.out.println("제 이름은 조은이입니다.");

		System.out.println();
		// 메소드 sayHello() 호출
		sayHello("정예경");
		sayHello("김진후");
		
		System.out.println();
		// 메소드 sayAge() 호출
		sayAge(16);
		sayAge(20);
		
		System.out.println();
		// 메소드 sayHello2() 호출
		sayHello2("오쌤", 20);
		
		System.out.println();
		// 메소드 sayHello3() 호출
		sayHello3("성연철", 20);
		

	} // end main()
	
	// 메소드 정의:
	// 메소드는 main 메소드 바깥에서, class 안에서 정의
	// 수식어 리턴타입 메소드이름(매개변수, ...) { ... }
	//   수식어: public, static, private, ... (생략 가능)
	//   리턴타입: void, ...
	//   리턴타입 void의 의미는 되돌려주는 값(return 값)이 없다는 의미
	//   메소드이름: sayHello
	//   매개변수: name (매개변수가 필요없는 경우에는 생략 가능)
	public static void sayHello(String name) {
		System.out.println("안녕하세요.");
		System.out.println("제 이름은 " + name + "입니다.");
		
	} // end sayHello()
	
	// 리턴타입: void(리턴값이 없다)
	// 메소드 이름: sayAge
	// 매개변수: int 타입의 age
	public static void sayAge(int age) {
		System.out.println("Hi~");
		System.out.println("제 나이는 " + age + "입니다.");
		
	} // end sayAge()
	
	// 리턴타입: void
	// 메소드 이름: sayHello2
	// 매개변수:
	//   1) String name
	//   2) int age
	public static void sayHello2(String name, int age) {
		System.out.println("안녕!");
		System.out.println("내 이름은 " + name);
		System.out.println("내 나이는 " + age);
		System.out.println("넌 누구니?");
	} // end sayHello2()
	
	// 리턴타입: void
	// 메소드 이름: sayHello3
	// 매개변수:
	//   1) String name
	//   2) int age
	public static void sayHello3(String name, int age) {
		sayHello(name);
		sayAge(age);
	} // end sayHello3()

} // end class Method01Main










