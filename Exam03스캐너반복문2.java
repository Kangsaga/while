package �ݺ���;

import java.util.Scanner;

public class Exam03��ĳ�ʹݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=1;
		int num2=1;
		
		
		Scanner sc = new Scanner(System.in);
		while (num1 !=0 || num2 != 0) {
			System.out.print("A �Է� >>");
			num1 = sc.nextInt();
			System.out.print("B �Է� >>");
			num2 = sc.nextInt();
			System.out.println("��� :" + (num1 - num2));
		}

	}

}
