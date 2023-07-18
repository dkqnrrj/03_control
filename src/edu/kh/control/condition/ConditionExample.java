package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		
		//if문
		//조건식이 true 인 경우에만 내부 코드 수행 한다.
		
		
		/*
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true 일때 수행 할 코드
		 *  }
		 * 
		 * 
		 * 
		 */
		
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("정수 입력 : ");
	 int input = sc.nextInt();
	 
	 // 입력된 정수가 양수 인지 검사
	 
	 
	 if (input > 0) {
		 
		 System.out.println("양수입니다.");
		 
	 }
		
	 if (input <= 0) {
		 
		 System.out.println("양수가 아니다.");
	}
	
	 
	 
	
	}
	
	
	
	public void ex2() {
	
	
	// if-else 문
	// 조건식 결과가 true면 if문, false면 else 문이 수행된다.
	
		
		/*
		 * if(조건식) {
		 * 		조건식이 true 일때 수행될 코드	
		 * } else {
		 * 		조건식이 false 일때 수행될 코드
		 * }
		 * 
		 * 
		 * 
		 */
	
		Scanner sc = new Scanner(System.in);
		
		
		
	//홀짝 검사
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if( input % 2 != 0 ) {
				System.out.println("홀수 입니다.");
			
		} else {	// 짝수 또는 0 입력 시 수행
			//중첩 IF문
			if (input == 0) {
				System.out.println("o 입니다.");
			} else {
				
				System.out.println("짝수 입니다.");
				
				
			}
			
			
		}
	
	}
	
	public void ex3() {
		
		//양수 , 음수, 0 판별
		
		// if - else if - else
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수 입니다.");
			
		} else if (input < 0){
			System.out.println("음수 입니다.");
			
		} else {
			System.out.println("0 입니다.");
			
		}
		
		
	}
	
	public void ex4() {
		
		//달(Month)을 입력 받아 해당 달에 맞는 계절 출력
		//단, 겨울 일때 온도가 -15도 이하 "한파 경보", -12이하 "한파 주의보"
		// 여름일때 온도가 35도 이상 "폭염 경보", 33도 이상 "폭염 주의보"
		// 1~12 사이가 아닐땐 "해당하는 계절이 없습니다." 출력.
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("달 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.println("온도 입력 : ");
		int input2 = sc.nextInt();
		
		
		
		
		if(input1 == 1 || input1 == 2 || input1 == 12) {
			
			System.out.print("겨울 입니다.");
			
			if (input2 <= -15) {
				
				System.out.println("한파 경보");
				
			}else if (input2 <= -12) {
				
				System.out.println("한파 주의보");
			}
			
			
		
		} 
		
		else if (3 <= input1 && input1 <= 5 ) { 
			
			System.out.println("봄 입니다.");
		}
		
		else if (6 <= input1 && input1 <= 8 ) { 
			
			System.out.println("여름 입니다.");
			
			if (input2 >= 35) {
				
				System.out.println("폭염 경보");
				
			}else if (input2 >= 33) {
				
				System.out.println("폭염 주의보");
			}
			
		}
		
		else if (9 <= input1 && input1 <= 11 ) { 
			
			System.out.println("가을 입니다.");
		
		
		}
		
		else {
			
			System.out.println("해당 하는 계절이 없습니다.");
		}
		
	}
	
	
	
	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("나이 : ");
		int input1 = sc.nextInt();
		
		if (input1 <= 13) {
			
			System.out.println("어린이 입니다.");
		} else if(input1 <= 19){
			
			System.out.println("청소년 입니다.");
		} else {
			
			System.out.println("성인 입니다.");
		}
		
		
		
	}
	
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("점수 : ");
		int input1 = sc.nextInt();
		
		if (input1 < 0 ) {
			
			System.out.println("잘못 입력 하셨습니다.");
			
		} 
		
		
		else if (input1 > 100 ) {
			
			System.out.println("잘못 입력 하셨습니다.");
		}
		
			
		
		else if (input1 >= 90) {
			
			System.out.println("A");
			
		} else if(input1 >= 80){
			
			System.out.println("B");
			
		} else if(input1 >= 70){
			
			System.out.println("C");
			
		} else if(input1 >= 60){
	
			System.out.println("D");
	
		} else {
	
			System.out.println("F");
		}
		
	}
	
	
public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int input1 = sc.nextInt();
		
		
		
		
		
		
		if(0 > input1 || input1 >100) {
			
			System.out.print("잘못 입력 하셨습니다.");
			
		} else {
			
			System.out.println("키 입력 : ");
			double input2 = sc.nextDouble();
			
		
			
			
		
			
		if (input1 < 12)
			
			{System.out.println("적정 연령이 아닙니다.");
		}
		
		else if (input2 < 140.0)
			
			System.out.println("적정 키가 아닙니다.");
		
		 else {
			
			System.out.println("탑승 가능.");
		}
		}
}

		public void ex8() {


		Scanner sc = new Scanner(System.in);
		System.out.println("나이 : ");
		int input1 = sc.nextInt();

		System.out.println("키 입력 : ");
		double input2 = sc.nextDouble();




		if(0 > input1 || input1 >100) {
	
			System.out.print("나이를 잘못 입력 하셨습니다.");
		
		}
	
		else if(0 > input2 || input2 >250.0) {
	
			System.out.print("키를 잘못 입력 하셨습니다.");
	
		}
	
    
    
	
else if (input1 >= 12 && input2 < 140.0) {
		
		System.out.println("나이는 적절하나, 키가 적절치 않음");
	}	

else if (input1 < 12 && input2 >= 140.0) {
		
		System.out.println("키는 적절하나, 나이는 적절치 않음");
	}	
else if (input1 < 12 && input2 < 140.0) {
		
		System.out.println("나이와 키 모두 적절치 않음");
	}	

else  {
		
		System.out.println("탑승 가능");
	}	

}






	}
	
	

	
	

