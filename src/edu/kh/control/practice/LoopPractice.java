package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");

		int input = sc.nextInt();

		if (1 <= input) {

			for (int i = 1; i <= input; i++) {

				System.out.print(i);

			}

		} else {

			System.out.println("1 이상의 숫자를 입력해주세요");

		}

	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");

		int input = sc.nextInt();

		if (1 <= input) {

			for (int i = input; i >= 1; i -= 1) {

				System.out.print(i);

			}

		} else {

			System.out.println("1 이상의 숫자를 입력해주세요");

		}

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");

		int input = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= input; i++) {

			sum += i;

		}

		int result;

		// System.out.print(result + sum);

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");

		int input1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");

		int input2 = sc.nextInt();

		if (1 <= input1 && 1 <= input2 && input1 < input2) {

			for (int i = input1; i <= input2; i++) {

				System.out.print(i);

			}

		} else if (1 <= input1 && 1 <= input2 && input1 > input2) {

			for (int i = input2; i <= input1; i++) {

				System.out.print(i);

			}

		} else {

			System.out.println("1 이상의 숫자를 입력해주세요");

		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");

		int input = sc.nextInt();

		System.out.println("=====" + input + "단" + "=====");

		for (int i = 1; i <= 9; i++) {

			System.out.printf("%d x %d = %d\n", input, i, input * i);

		}

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");

		int num = sc.nextInt();

		if (num < 2 || num > 9) {

			System.out.println("2~9 사이 숫자만 입력해주세요.");

		} else

			for (int dan = num; dan <= 9; dan++) {

				System.out.println("=====" + dan + "단" + "=====");

				for (int i = 1; i <= 9; i++) {

					System.out.printf("%d x %d = %2d\n ", dan, i, dan * i);

				}

				System.out.println();

			}

	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {

			for (int num = 1; num <= i; num++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int input = sc.nextInt();

		for (int i = input; i >= 1; i--) {

			for (int num = 1; num <= i; num++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {

			for (int k = input; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {

			for (int num = 1; num <= i; num++) {

				System.out.print("*");

			}

			System.out.println();

		}

		for (int i = 1; i <= input; i++) {

			for (int k = input; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int input = sc.nextInt();

		for (int i = 0; i < input; i++) { // 삼각형의 높이 출력하는 코드
			
			for (int j = 0; j < (input - 1) - i; j++) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 0; j < (input - 2) * i + 1; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
		}

	}

	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int input = sc.nextInt();
		
		
		for (int i = 0; i < input; i++) { // 사각형의 높이 계산하는 코드
			
		
			for (int j = 1; j <= input; j++) {
				
				
				if(j == 1 || j == input) { // 윗변 아랫변 만들기
					
					System.out.print("*");
					
					
				} else { // 가운데 *   * 만들기
					
					System.out.print("*");
					
					
					for(int space = 1; space<= (input-2) ; space++) {
					
					
					System.out.print(" ");
					
					}
					
					
					
					System.out.print("*");
					
				}
				
				
				
			
				
			}
			
			System.out.println();
			
		}
			
			
			
			
		}
		
		
		
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		
		System.out.println();
		

		int input = sc.nextInt();
		
		
		int count = 0;
		
		for (int j = 1; j <= input; j++) {
			
			if (j % 6 == 0) {
					
				count++;
					
				}
		
		}
		
		for (int i = 1; i <= input; i++) {
			
			if (i % 2 == 0 || i % 3 == 0) {
				
				System.out.print(i + " ");
				
				
		
		
			}
		
		
	}
		
		System.out.println();
		System.out.println();
		
		System.out.println("count : " + count);
	}
	
}
