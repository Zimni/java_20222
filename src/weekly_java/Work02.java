package weekly_java;
/*
 * 작성자:김지민
 * 작성일:2022.07.16
 * 내용:BMI 계산 : 키랑 몸무게, 비만, 과체중, 정상
 * bmi = 체중 ( kg ) / 키 ( m ) * 키 ( m )
 *
 * bmi 20미만: 저체중
 * 	   20이상-24이하: 정상
 *     25이상-29이하: 과체중
 *     30이상 : 비만
 */
public class Work02 {

	public static void main(String[] args) {
		
		int weight = 80;
		int height = 175;
		
		int bmi=(int) (weight / (((double)height/100)*((double)height/100)));
		
		System.out.println(bmi);
		if (bmi>=30) {
			System.out.println("비만입니다.");
		}
		else if (bmi>=25) {
			System.out.println("과체중입니다.");
		}
		else if (bmi>=20) {
			System.out.println("정상입니다.");
		}
		else
			System.out.println("저체중입니다.");
		
	}

}
