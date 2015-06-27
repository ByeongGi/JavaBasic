package com.lec.java.access01;

// 다른 패키지에 있는(다른 디렉토리에 있는) 클래스를 사용하려면
// import를 해 주어야 함
import com.lec.java.access02.Test02;

// 접근권한 수식어(Access Modifier)
// 1) 종류: private, (default), protected, public 
// 2) 기능 
//   - 멤버 변수에 대한 접근 권한을 제한
//   - 메소드에 대한 접근 권한을 제한
// 3) private: 자기 자신이 선언된 클래스에서만 직접 접근(사용) 가능
// 4) (default): 같은 패키지에 있는 클래스들에서는 직접 사용 가능
// 5) protected: 같은 패키지에 있거나, 
//    다른 패키지에 있는 클래스이더라도 상속이 되면 사용 가능
// 6) public: 어디서든 사용이 가능
// 사용범위: private < (default) < protected < public
// 클래스에서는 (default)와 public 두 개의 접근권한 수식어만 사용.


public class Access01Main {

	public static void main(String[] args) {
		System.out.println("접근권한 수식어(Access Modifier)");
		
		// Test01 클래스의 인스턴스를 생성
		Test01 t1 = new Test01();
		
		// 1) private: 자기 자신이 선언된 클래스에서만 직접 사용이 가능
		//t1.privateNum = 10; 
		// 다른 클래스에서 직접 사용하려고 하면 컴파일 에러
		
		// 2) (default): 같은 패키지에 있으면 직접 사용 가능
		t1.defaultNum = 20;
		
		// 3) protected: 같은 패키지에 있거나, 다른 패키지에 있더라도
		// 상속이 되는 경우에는 직접 사용 가능
		t1.protectedNum = 30;
		
		// 4) public: 어디서든 직접 사용 가능
		t1.publicNum = 40;

		
		
		// 다른 패키지(com.lec.java.access02)에 있는 클래스
		Test02 t2 = new Test02();
		// 1) private:
		//t2.num1 = 11;
		
		// 2) (default)
		//t2.num2 = 22;
		
		// 3) protected:
		//t2.num3 = 33;
		
		// 4) public
		t2.num4 = 1234;
		
	} // end main()

} // end class Access01Main










