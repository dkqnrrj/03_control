package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();

		String result = null;

		if (input <= 0) {

			result = "양수만 입력 하세요.";

		} else if (input > 0 && input % 2 == 0) {

			result = "짝수입니다.";

		} else if (input > 0 && input % 2 != 0) {

			result = "홀수입니다.";
		}

		System.out.print(result);

	}

	public void practice2() {

		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();

		System.out.print("영어 점수 : ");
		int English = sc.nextInt();

		System.out.print("수학 점수 : ");
		int Math = sc.nextInt();

		int Sum = korean + English + Math;

		Double Aver = Sum / 3.0;

		String result;

		if ((korean >= 40 && English >= 40 && Math >= 40) && Aver >= 60) {

			System.out.println("국어 : " + korean);
			System.out.println("영어 : " + English);
			System.out.println("수학 : " + Math);

			result = "축하합니다, 합격입니다!";

		} else {

			result = "불합격입니다.";

		}

		System.out.println(result);

	}

	public void practice3() {

		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		String result;

		switch (month) {

		case 2:
			result = month + "월은 28일까지 있습니다.";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			result = month + "월은 30일까지 있습니다.";
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			result = month + "월은 31일까지 있습니다.";
			break;

		default:
			result = month + "월은 잘못 입력된 달입니다.";

		}

		System.out.println(result);

	}

	public void practice4() {

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		String result = null;

		double bmi = weight / (height * height);

		if (bmi < 18.5) {

			result = "저체중";

		} else if (bmi < 23) {

			result = "정상체중";

		} else if (bmi < 25) {

			result = "과체중";

		} else if (bmi < 30) {

			result = "비만";

		} else if (bmi > 30) {

			result = "고도 비만";

		} else {
			
			
		}

		System.out.println("BMI 지수 : " + bmi);

		System.out.println(result);

	}

	public void practice5() {

		System.out.print("중간 고사 점수 : ");
		double semiExam = sc.nextDouble();

		System.out.print("기말 고사 점수 : ");
		double fanalExam = sc.nextDouble();

		System.out.print("과제 점수 : ");
		double homeWork = sc.nextDouble();

		System.out.print("출석 횟수 : ");
		double attendance = sc.nextDouble();

		double semiResult = (semiExam / 100) * 0.2 * 100;
		double fanalResult = (fanalExam / 100) * 0.3 * 100;
		double homeWorkResult = (homeWork / 100) * 0.3 * 100;
		double attendanceResult = (attendance / 20) * 0.2 * 100;

		int intAttendance = (int) attendance;

		double sum = semiResult + fanalResult + homeWorkResult + attendanceResult;

		if (sum >= 70 && attendance >= 14) {

			System.out.println("=======================결과====================");

			System.out.printf("중간 고사 점수(20) :  %.1f\n", semiResult);
			System.out.printf("기말 고사 점수(30) :  %.1f\n", fanalResult);
			System.out.printf("과제 점수 (30) :  %.1f\n", homeWorkResult);
			System.out.printf("출석 점수 (20) :  %.1f\n", attendanceResult);

			System.out.println("총점 : " + sum);

			System.out.println("PASS");

		} else if (attendance < 14) {

			System.out.println(" FAIL [출석 횟수 부족 ( " + intAttendance + " /20)] ");

		} else if (sum < 70) {

			System.out.println("=======================결과====================");

			System.out.printf("중간 고사 점수(20) :  %.1f\n", semiResult);
			System.out.printf("기말 고사 점수(30) :  %.1f\n", fanalResult);
			System.out.printf("과제 점수 (30) :  %.1f\n", homeWorkResult);
			System.out.printf("출석 점수 (20) :  %.1f\n", attendanceResult);

			System.out.println("총점 : " + sum);

			System.out.println("FAIL [점수 미달]");

		} else {

		}

	}

}
