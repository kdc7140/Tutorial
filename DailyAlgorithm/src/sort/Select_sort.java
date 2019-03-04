package sort;

import java.util.Arrays;
import java.util.Scanner;

//선택정렬
public class Select_sort {
	
	public static int [] sort(int [] ar){
		for(int i=0; i<ar.length-1; i++){
			for(int j=i+1; j<ar.length; j++){
				if(ar[i] > ar[j]){
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정렬할 숫자 입력 : ");
		String inputData = sc.next();
		
		//입력된 숫자를 한글자씩 잘라서 배열로 변환
		//이 경우 일의단위 이상의 숫자는 구분 불가
		//십의자리 이상숫자도 구분하도록 수정요망
		String [] stringArr = inputData.split("");
		
		//배열 타입을 string에서 int로 바꿔줌
		int[] sortArr = Arrays.stream(stringArr).mapToInt(Integer::parseInt).toArray();
		
		sort(sortArr);
		
		for(int k : sortArr){
			System.out.println(k);
		}
		
	}

}
