package 반복문;

import java.util.Scanner;

public class Exam01반복문while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문
		// 정확하게 몇번 반보하는지 모를 때 사용

		// 반복문으로 정답맞추기
		int answer = 30;
		int user = 0;
		int cnt = 0;
		// while
		while (user != answer) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정답을 입력해주세요 >>");
			user = sc.nextInt();
			cnt++;
			System.out.println("시도한 횟수 : " + cnt);
			
		}
		//System.out.println("시도한 횟수 : " + cnt);
		System.out.println("사용자가 입력한값" + user);
	}
	
}
