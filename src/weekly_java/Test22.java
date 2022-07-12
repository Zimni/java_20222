package weekly_java;
/*
 * 작성자:김지민
 * 작성일:2022.07.09
 * 내용: 접근 제한자 public private protected를 사용해보자
 * 클래스가 여러 개일 때 그 중 하나는 public 선언을 무조건 해주어야함.
 * 한 개만 있을 때는 하지 않아도 됨.
 *
 */
class Test22_1 {
	
	private	int a = 10;
	
	public void result() {
		System.out.println(a);
	}
}

public class Test22{
	public static void main(String[] args) {

		Test22_1 t = new Test22_1();
		
		//System.out.println(t.a);
		t.result();
		weekly_java2.Sample2 s2 = new weekly_java2.Sample2();
		System.out.println(s2.a);
	}

}
