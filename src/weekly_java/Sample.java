package weekly_java;
/*
 * 작성자:김지민
 * 작성일:2022.07.03
 * 내용:이클립스를 사용해보자
 * 클래스 변수 : 변수명 앞에 static 붙은 변수
 * 
 */
public class Sample {
	
	public static int a;
	static int b=10; //기울기를 보면 static 변수인 것을 알 수 있음.
	
	public static void result() {
		
		
			System.out.println(a);
	}

	public static void main(String[] args) {
		
		
		System.out.println(Sample.b);
		//System.out.println(a);
		//Sample sample = new Sample();
		Sample.result();
		
		
	}

}
