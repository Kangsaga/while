import java.util.Random;
import java.util.Scanner;

public class Exam03���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �������� �����ϱ�

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("PLUS GAME!!");

		int num1 = random.nextInt(5) + 1;
		int num2 = random.nextInt(5) + 1;
		int life = 3;

		// �ݺ����� ��𼭺��� ������ �ݺ��Ҳ���
		// ���� �������������� �Ű����Ѵ�.
		while (life != 0) {

			// int num1 = random.nextInt(5) + 1;
			// int num2 = random.nextInt(5) + 1;
			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();

			// answer ���� num1 + num2 ���� �����ϸ�
			// �����Դϴ� ���
			// �ƴ϶�� �����Դϴ� ���
			// System.out.println(num1 + num2 == answer ? "�����Դϴ�" : "�����Դϴ�");
			// ����� ������ ���ذ�
			// while (num1 + num2 != answer) {

			// System.out.println("�����Դϴ�");
			// System.out.print(num1 + " + " + num2 + " = ");
			// answer = sc.nextInt();

			if (num1 + num2 == answer && life != 0) {
				System.out.println("�����Դϴ�");
				System.out.println("��� : " + life);
				// int�� �տ� �پ� ������ ���� ������ ���� ����°�
				// �տ� int�� �Ⱦ��� ���� �ִ� ���� ����Ѵٶ�� ���̴�.
				num1 = random.nextInt(5) + 1;
				num2 = random.nextInt(5) + 1;

			} else if (num1 + num2 != answer && life != 0) {// {���� �Ѱ�
				// while (num1 + num2 != answer) {
				System.out.println("�����Դϴ�");
				System.out.println("��� : " + --life);

			}
			// System.out.print(num1 + " + " + num2 + " = ");
			// answer = sc.nextInt();

			// if (num1 + num2 == answer) {
			// System.out.println("�����Դϴ�");
			// }
		}
		System.out.println("��������");
		// }
	}
	// System.out.println("�����Դϴ�");
	// }

}

//}
