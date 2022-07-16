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
		for (int i = 1; i<=5; i++) {
			
			System.out.println(2*i);
			
		}
			for(int i = 1; i <= 10; i++) {
				
				if( i%2 == 0 ) {
					
					System.out.println(i);
					
				}
				}
	
			for (int i = 0; i < 11; i = i + 2) {
				
				if ( i == 0) {
					continue;
				}
				System.out.println(i);
				
		}
			//1~10까지 짝수의 합
			 sum = 0;
			for (int i = 0; i < 11; i++) {
				if ( i % 2 != 0) {
					continue;
				}
				sum+=i;
				
			}
			System.out.println(sum);
			
			//1~10까지 3의 배수 출력
			for (int i = 0; i <= 10; i ++) {
				if ( i % 3 == 0) {
					
				System.out.println(i);
				
				}		
			  }
			
			
		
		//1~100 사이의 숫자에서 3의 배수가 몇 개인지 출력
			int count=0;
			for (int i = 1; i <=100; i++) {
				if (i % 3 != 0) {
					continue;
				}
				count++;
				
			}
			System.out.println("3의 배수는" + count + "개 입니다.");
			
		//1~10 사이 숫자에서 4의 배수 숫자와 5의 배수 숫자의 합계
			int a = 0;
			for (int i = 1; i <= 10; i++) {
				
				if (i % 4 == 0 || i % 5 == 0 ) {
					
					a += i;
					
				}
				
			}
			System.out.println(a);
			
		}
	
	
	
		}
	

