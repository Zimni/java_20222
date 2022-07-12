package weekly_java;

/*작성자:김지민
* 작성일:2022.07.10
* 내용: 형변환에 대해 알아보자.
*/


public class Test30 {

	public static void main(String[] args) {
		
	 int a = 10;
	 int b = 3;
	 //double c = a/b;
	 double c = (double) a / b;
	 
	 float d = (float)1.1;
	 
	 double e = 1.1231231242325;
	 
	 System.out.println(d);
	 System.out.println(c);
	 System.out.println(e);
	}

}
