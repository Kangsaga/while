package �ݺ���;

import java.util.Scanner;

public class Exam04��ĳ��Ȧ¦�ݺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		
				
		Scanner sc = new Scanner(System.in);
		while(num != -1) {
			System.out.print("�����Է� :");
			num =sc.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("¦������ : " + ++num1);
				System.out.println("Ȧ������ : " + num2);
			}else if(num != -1){
				System.out.println("¦������ : " + num1);
				System.out.println("Ȧ������ : " + ++num2);
			}
			else {
				System.out.println("����Ǿ����ϴ�.");
			}
		}
		
		//System.out.println("����Ǿ����ϴ�.");
		
		
		
		
	}

}
