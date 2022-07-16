package weekly_java;
/*
 * 작성자:김지민
 * 작성일:2022.07.16
 * 내용:for문에 대해 배우자
 * 반복할 횟수를 지정하고자 할 때 사용함
 */
public class Test46 {

	public static void main(String[] args) {
		//안녕하세요를 7회 반복출력
		for (int i = 1; i < 7; i++) {
			
			System.out.println("안녕하세요");
		}
		
		//1부터 10까지의 합
		int sum=0;
		
		for (int i = 1; i <= 10; i++) {
			
		
			sum = sum+i;
			
		}
		System.out.println(sum);
		
		//1~10까지 짝수만 출력
		//2로 나누어 나머지가 0이면 짝수, 아니면 홀수
	/*	for (int i = 1; i<=5; i++) {
			
			System.out.println(2*i);
			
	
			for(int i = 1; i <= 10; i++) {
				
				if( i%2 == 0 ) {
					
					System.out.println(i);
					
				}
	*/	
			for ( int i = 0; i < 11; i = i + 2) {
				
				System.out.println(i);
				
		}
	}

}
