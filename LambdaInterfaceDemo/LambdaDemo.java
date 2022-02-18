package LambdaInterfaceDemo;

public class LambdaDemo {

	public static void main(String[] args) {
		
		LambdaInterface li = (a,b) -> a+b;
		int m = li.m1(1,2);
		System.out.println(m);
		li = (a,b)-> {return a*b ;};
		int t = li.m1(2, 3);
		System.out.println(t);
	}

}
