
public class Exam02while문if문사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while 를 활용하여 1부터100까지 숫자중 3의배수만 출력
		int num = 1;
		while (num <=100) {
			num++;
			if(num % 3 == 0) {
				System.out.println(num);
			}
		}
		
		
		
		
	}

}
