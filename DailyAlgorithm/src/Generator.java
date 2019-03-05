
public class Generator {

	//generator : 어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자
	//ex) d(91) = 9 + 1 + 91 = 101 -> 91은 101의 제네레이터이다.
	//self-number : 제네레이터가 없는 수 
	//ex) 1,3,5,7,9,20,31....
	
	//example) 1이상 5000보다 작은 셀프넘버들의 합을 구하여라
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,d,rst,sum = 0;
		
		boolean [] arr = new boolean[5000];
		
		for(int i=1; i<5000; i++) {
			a = i/1000;
			b = (i/10)%10;
			c = (i/100)%10;
			d = i%10;
			
			rst = a+b+c+d+i;
			
			if( 1 <= rst && rst <5000)
				arr[rst] = true;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == false)
				sum = sum+i;
		}
		
		System.out.println("self-number의 합 : "+ sum);
	}

}
