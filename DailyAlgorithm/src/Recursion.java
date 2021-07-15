import java.util.Scanner;

//피보나치 수열
public class Recursion {
	
	private static int recursiveFibo(int x){
		if(x ==1 || x ==2)
			return 1;
		
		return recursiveFibo(x-1) + recursiveFibo(x-2);
	}
	
	private static int noRecursiveFibo(int x){
		int a=1, b=1;
		int c=0;
		
		for(int i=3; i<=x; i++){
			c = a + b;
			a = b;
			b = c;	
		}
		return c;
	}

    // TODO; this is main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알고싶은 피보나치 수열의 값은 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//재귀를 이용한 결과
		int result = recursiveFibo(x);
		System.out.println("재귀 이용 result:" + result);
		//재귀를 이용하지 않은 결과
		result = noRecursiveFibo(x);
		System.out.println("result:" + result);
	}

}
