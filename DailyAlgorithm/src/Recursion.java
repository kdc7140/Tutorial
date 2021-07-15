import java.util.Scanner;

//�Ǻ���ġ ����
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�˰���� �Ǻ���ġ ������ ���� : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		//��͸� �̿��� ���
		int result = recursiveFibo(x);
		System.out.println("��� �̿� result:" + result);
		//��͸� �̿����� ���� ���
		result = noRecursiveFibo(x);
		System.out.println("result:" + result);
	}

}
