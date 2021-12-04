package ¹Ýº¹¹®;

import java.util.Scanner;

public class Exam04½ºÄ³³ÊÈ¦Â¦¹Ýº¹ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		
				
		Scanner sc = new Scanner(System.in);
		while(num != -1) {
			System.out.print("¼ýÀÚÀÔ·Â :");
			num =sc.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("Â¦¼ö°¹¼ö : " + ++num1);
				System.out.println("È¦¼ö°¹¼ö : " + num2);
			}else if(num != -1){
				System.out.println("Â¦¼ö°¹¼ö : " + num1);
				System.out.println("È¦¼ö°¹¼ö : " + ++num2);
			}
			else {
				System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
			}
		}
		
		//System.out.println("Á¾·áµÇ¾ú½À´Ï´Ù.");
		
		
		
		
	}

}
