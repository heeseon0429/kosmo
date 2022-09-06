package Chapter04.EX03;

public class Using_Switch {

	public static void main(String[] args) {
		//Switch 문 - 반드시 break;를 사용해서 해당 case를 탈출
		
		//Switch 구문에서 break;를 사용하지 않는 경우
		// 해당 case로 점프후에 하위의 모든 case를 실행
		//  break; 헤딩 실행문을 빠져 나온다.
		int a = 3;
		
		switch (a) {   //(위치변수) : 정수, 문자, 문자열
		case 1:
			System.out.println("변수 값을 출력" + a);
		case 2:
			System.out.println("변수 값을 출력" + a);
			break;
		case 3:
			System.out.println("변수 값을 출력" + a);
		case 4:
			System.out.println("변수 값을 출력" + a);
		default:     //if 문의 else와 같이 case의 값이 없는 모든 경우
			System.out.println("변수 값을 출력" + a);
		}
		System.out.println("=====================================");
		
		//2. Switch 문에서 break; 사용    <==일반적으로 사용
		
        a = 2;
		
		switch (a) {   //(위치변수) : 정수, 문자, 문자열
		case 1:
			System.out.println("case 1을 출력" + a);
			break;
		case 2:
			System.out.println("case 2을 출력" + a);
			break;
		case 3:
			System.out.println("case 3을 출력" + a);
			break;	
	    case 4:
			System.out.println("case 4을 출력" + a);
		default:     //if 문의 else와 같이 case의 값이 없는 모든 경우
			System.out.println("default을 출력" + a);
			break;           //default에서 break는 일반적으로 생략
		}
		
		//7점 이상인 경우 pass, 그렇지 않는 경우 fail
		System.out.println("===================================");
		int b = 8;
		
		switch (b) {
		case 10: 
			System.out.println("Pass");
			break;
		case 9: 
			System.out.println("Pass");
			break;
		case 8:
			System.out.println("Pass");
			break;
		case 7:
			System.out.println("Pass");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		
		System.out.println("============축약 표현===========");
		//축약 표현
		b = 8;
		switch ( b ) {
		case 10: case 9: case 8: case 7:
			System.out.println("Pass");
			break;
		default :
			System.out.println("Fail");
			break;
		}
		
		//switch 문 <==========> if ~ else if 문과 상호 변화됨
		System.out.println("==================================");
		
		int c = 8;
		
		switch (c) {
		case 10: case 9: 
			System.out.println("A 학점");
		    break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		}
		
		// 위 구문을 if else if 문으로 변환, break 없이도 자동으로 구문을 빠져나옴
		c = 7;
		if (c > 9) {
			System.out.println("A 학점");
		} else if (c == 8) {
			System.out.println("B 학점");
		} else if (c == 7) {
			System.out.println("C 학점");   //실행후 if문을 빠져나온다 (break 사용없이)
		} else {
			System.out.println("D 학점");
		}
		
		
		
		
		
		
		
		
	}

}
