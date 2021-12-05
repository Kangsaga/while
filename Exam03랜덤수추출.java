import java.util.Random;
import java.util.Scanner;

public class Exam03랜덤수추출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 랜덤숫자 추출하기

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("PLUS GAME!!");

		int num1 = random.nextInt(5) + 1;
		int num2 = random.nextInt(5) + 1;
		int life = 3;

		// 반복문은 어디서부터 어디까지 반복할껀지
		// 언제 빠져나갈껀지를 신경써야한다.
		while (life != 0) {

			// int num1 = random.nextInt(5) + 1;
			// int num2 = random.nextInt(5) + 1;
			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();

			// answer 값이 num1 + num2 값과 동일하면
			// 정답입니다 출력
			// 아니라면 오답입니다 출력
			// System.out.println(num1 + num2 == answer ? "정답입니다" : "오답입니다");
			// 상민이 형님이 해준거
			// while (num1 + num2 != answer) {

			// System.out.println("오답입니다");
			// System.out.print(num1 + " + " + num2 + " = ");
			// answer = sc.nextInt();

			if (num1 + num2 == answer && life != 0) {
				System.out.println("정답입니다");
				System.out.println("목숨 : " + life);
				// int가 앞에 붙어 있으면 없는 공간에 새로 만드는것
				// 앞에 int를 안쓰는 경우는 있던 것을 사용한다라는 말이다.
				num1 = random.nextInt(5) + 1;
				num2 = random.nextInt(5) + 1;

			} else if (num1 + num2 != answer && life != 0) {// {내가 한거
				// while (num1 + num2 != answer) {
				System.out.println("오답입니다");
				System.out.println("목숨 : " + --life);

			}
			// System.out.print(num1 + " + " + num2 + " = ");
			// answer = sc.nextInt();

			// if (num1 + num2 == answer) {
			// System.out.println("정답입니다");
			// }
		}
		System.out.println("게입종료");
		// }
	}
	// System.out.println("정답입니다");
	// }

}

//}
