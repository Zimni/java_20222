package weekly_java;
/*작성자:김지민
 *작성일:2022.07.10
 *학점 출력 프로그램
 *90이상 100이하:A출력
 *80이상 89이하:B출력
 *70이상 79이하:C출력
 *60이상 69이하:D출력
 *나머지 : F출력 */
public class Work01 {

	public static void main(String[] args) {

		int score=37;
		
/*		if (score>=90) {
			System.out.println("학점:A");
		}
		else if (score>=80) {
			System.out.println("학점:B");
		}
		else if (score>=70) {
			System.out.println("학점:C");
		}
		else if (score>=60)
			System.out.println("학점:D");
		else
			System.out.println("학점:F");
	

		if (score>=90 && score <=100) {
			System.out.println("학점:A");
		}
		else if (score>=80 && score <=89) {
			System.out.println("학점:B");
		}
		else if (score>=70 && score <=79) {
			System.out.println("학점:C");
		}
		else if (score>=60 && score <=69) {
			System.out.println("학점:D");
			}
		else
			System.out.println("학점:F");
*/
		if( score >= 90) {
			System.out.println("학점:A");
		}
		if ( score <= 89 ) {
			if ( score >= 80) {
				System.out.println("학점:B");
			}
		}
		if ( score <= 79 ) {
			if ( score >= 70) {
				System.out.println("학점:C");
			}
		}
		if  ( score <= 69 ) {
			if ( score >= 60) {
				System.out.println("학점:D");
			}
		}
		else 
			System.out.println("학점:F");
}
}
