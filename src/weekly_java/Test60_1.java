package weekly_java;

/*작성자:김지민
* 작성일:2022.07.10
* 내용: 비교문(2)
* switch문에 대해 배워보자
* */

public class Test60_1 {

	


		public static void main(String[]args) {
		
			String score = "70";
			//switch문
			
			switch(score) {
			//비교
			
					case "30":
						System.out.println("30점입니다.");
						break;
				
					case "40":
						System.out.println("40점입니다.");
						break;

					case "50":
						System.out.println("50점입니다.");
						break;
						
					case "60":
						System.out.println("60점입니다.");
						break;
						
					case "70":
						System.out.println("70점입니다.");
						break;
						
					case "80":
						System.out.println("80점입니다.");
						break;
						
					default : 
						System.out.println("모르겠습니다.");
						
			}

		}
	}



	