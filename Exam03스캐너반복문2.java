package 반복문;

import java.util.Scanner;

public class Exam03스캐너반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=1;
		int num2=1;
		
		
		Scanner sc = new Scanner(System.in);
		while (num1 !=0 || num2 != 0) {
			System.out.print("A 입력 >>");
			num1 = sc.nextInt();
			System.out.print("B 입력 >>");
			num2 = sc.nextInt();
			System.out.println("결과 :" + (num1 - num2));
		}

	}

}
