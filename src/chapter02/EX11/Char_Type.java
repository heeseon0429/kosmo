package chapter02.EX11;

public class Char_Type {

	public static void main(String[] args) {
		// char 데이터 타입 : 하나의 문자만 저장, 
		//      - 문자, 숫자, 유니코드로 저장할 수 있다.
		//      -  ' '를 사용해서 저장
		//      - 2문자 이상 넣을 수 없다. String으로 여러 문자를 저장할 수 있다.
		
		// 유니코드 : 전 세계의 모든 문자를 16진수로 표기
		
		//1. 문자로 저장하는 방법 : ' '
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';    // 숫자 3이 아니고 3의 문자
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("============");
		
		//2. 정수로 저장하는 방법 
		char value4 = 65;       //A <==  65
		char value5 = 0xac00 ;  //0x는 16진수를 표현, 가 <= 0xac00
		char value6 = 51;       // 3 <== 51
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("============");
		
		//3. 유니코드로 저장하는 방법 (\\u유니코드) ; ''를 사용해서 넣는다.
		
		char value7 = '\u0041';   //A
		char value8 = '\uac00';   //가
		char value9 = '\u0033';   //3
		
		
		char value100 = 35;        // # <== 35
		System.out.println(value100);
		char value101 = '\uac11';   // 값 <== ac11
		System.out.println(value101);
		System.out.println("===================");
		
		//구글 검색을 사용해서 자신의 이름의 유니코드를 찾아서 char에 저장해서 출력
		
		char value10 = '\uc724';   //윤	
        char value11 = '\ud76c';   //희	
        char value12 = '\uc120';   //선
        
      
        
        
        
        
        //문자 A를 저장하는 다양한 방법
        char a = 'A';   //A <== 65
        char b = 65;    //정수로 저장 (10진수)
        char c = 0b1000001;   //0b 뒤에 오는 값이 2진수 이다.
        char d = 00101;       //0 뒤에 오는 값이 8진수
        char e = 0x0041;      //0x 뒤에 오는 값은 16진수
        char f = '\u0041';     //유니코드로 값 할당
        
       
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
	}

}
