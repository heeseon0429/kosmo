package chapter09.EX04;

//static 접근 제어자 : 필드, 메소드 앞에 설정
//			- 객체 생성 없이 사용 가능
//			- 모든 객체에서 공유되는 필드



public class A {
	
	int m = 3;			//인스턴스 필드 : 객체를 생성해야지만 사용이 가능
	static int n = 5;	//정적(static) 필드 : 객체 생성 없이 사용 가능, 모든 객체가 공유하는 필드 
	
	void print() {
		System.out.println(m + " + " +  n + " = " + (m + n));
	}
}
