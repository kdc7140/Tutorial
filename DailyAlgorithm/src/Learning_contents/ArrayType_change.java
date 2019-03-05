package Learning_contents;

import java.util.Arrays;

public class ArrayType_change {

	//String 타입의 배열은 int형으로 변환
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string 타입의 배열 선언
		String [] stringArr = {"1", "2", "5", "4", "9", "7"};
		
		//배열 타입을 string에서 int로 바꿔줌
		int[] intArr = Arrays.stream(stringArr).mapToInt(Integer::parseInt).toArray();
	}

}
