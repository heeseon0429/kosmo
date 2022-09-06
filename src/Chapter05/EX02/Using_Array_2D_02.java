package Chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D_02 {

	public static void main(String[] args) {
		String[][] arr1 = new String[][] { { "홍길동", "이순신", "세종대왕" }, { "독수리", "부엉이", "닭", "오리" }, { "붕어", "가물치", "잉어" },
				{ "호랑이", "사자" } };

		/*
		 * 출력 : 사람이름 : 홍길동 이순신 세종대왕 새이름 : 독수리 부엉이 닭 오리 물고기이름 : 붕어 가물치 잉어 포유류이름 : 호랑이 사자
		 */

		// 1. for 문으로 출력
		System.out.println("===for 문으로 출력===");
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("사람 이름 : ");
			} else if (i == 1) {
				System.out.print("새이름 :");
			} else if (i == 2) {
				System.out.print("물고기이름 :");
			} else  {
				System.out.print("포유류이름 :");
			}
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
/*
 for(int i =0 ; i < arr1.length; i++);
 if(i==0) {system.out.print("사람이름 :");}
 .
 .
 for(int j =0; j < arr[i].length; j++);
 */
	

		// 2. Enhanced for
		System.out.println("=====Enhanced for 문으로 출력======");
		for(String [] a : arr1) {
			for(String b : a) {
				if ( b== "홍길동") {
					System.out.print("사람 이름 : " + b + " ");
				}else if (b =="독수리") {
					System.out.print("새 이름 :" + b + " ");
				}else if ( b=="붕어") {
					System.out.print("물고기 이름 : " + b + " ");
				}else if ( b=="호랑이") {
					System.out.print("포유류 이름 : " + b + " ");
				}else {
					System.out.print(b + " ");
				}

				}
			System.out.println();   //★괄호잘보고 찍기.....................
			
		}
			/*
			 for(String [] a : arr1) {
			for(String b : a) {
			if(b.equals("홍길동")) {system.out.print("사람이름 : ");}
			if(b.equals("독수리")) {system.out.print("새이름 : ");}
			if(b.equals("붕어")) {system.out.print("물고기이름 : ");}
			if(b.equals("호랑이")) {system.out.print("포유류이름 : ");}
			system.out.print(b + " ");
			
			 */
			// 3. Arrays.toString()
		System.out.println("==Arrays.toString(arr1[0])===");
		for (int i = 0; i < arr1.length; i++) {				
			if (i==0) {
				System.out.print("사람 이름 : ");
			}else if (i==1) {
				System.out.print("새이름 :" );
			}else if (i==2) {
				System.out.print("물고기 이름: ");
			}else 
				System.out.print("포유류 이름 : ");
			System.out.println(Arrays.toString(arr1[i]));
		}
		System.out.println();

	}}
