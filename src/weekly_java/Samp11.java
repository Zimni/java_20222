package weekly_java;

/*작성자:김지민
* 작성일:2022.07.09
* 내용: 접근 제한자 public private protected를 사용해보자
* 클래스가 여러 개일 때 그 중 하나는 public 선언을 무조건 해주어야함.
* 한 개만 있을 때는 하지 않아도 됨.
*/

class Employee{
	
	String name = "";
	int age= 0;
	String addr = "";
	int salary = 0;
	public Employee(String name, int age, String addr, int salary) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		
	}

}
public class Samp11 {

	public static void main(String[] args) {
		
		Employee 철수 = new Employee("김철수", 20, "서울시 노원구", 1000000);
		Employee 영희 = new Employee("이영희", 23, "서울시 강남구", 1500000);
		
		System.out.println(철수.name);
		System.out.println(철수.age);
		//System.out.println(철수.salary);
		

	}

}
