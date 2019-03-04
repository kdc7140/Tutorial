package sort;

//버블정렬
public class Bubble_sort {
	
	public static int [] bubble(int [] ar){
		//최대 n-1회전
		for(int i=0; i<ar.length-1; i++){
			//1회전 동안 데이터의 이동이 있는지 확인하기 위한 변수
			int flag = 0;
			//첫번째 부터 마지막 -1번째 데이터까지 자신의 뒤의 데이터와 비교
			for(int j=0; j<ar.length-1-i; j++){
				//앞의 데이터가 뒤의 데이터보다 크다면 위치를 변경하고 이동이 있었다는 표시를 함
				if(ar[j] > ar[j+1]){
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sortArr = {2,5,1,24,4,9,8,11,7};
		bubble(sortArr);
		
		for(int k : sortArr){
			System.out.println(k);
		}

	}

}
