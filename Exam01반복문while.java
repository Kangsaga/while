package �ݺ���;

import java.util.Scanner;

public class Exam01�ݺ���while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while��
		// ��Ȯ�ϰ� ��� �ݺ��ϴ��� �� �� ���

		// �ݺ������� ������߱�
		int answer = 30;
		int user = 0;
		int cnt = 0;
		// while
		while (user != answer) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �Է����ּ��� >>");
			user = sc.nextInt();
			cnt++;
			System.out.println("�õ��� Ƚ�� : " + cnt);
			
		}
		//System.out.println("�õ��� Ƚ�� : " + cnt);
		System.out.println("����ڰ� �Է��Ѱ�" + user);
	}
	
}
