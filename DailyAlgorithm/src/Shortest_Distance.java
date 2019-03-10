
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shortest_Distance {
	
	//입력된 수의 사이 거리가 가장 짧은 거리쌍 출력

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int rst = 0;               //입력된 점들중 가장 가까운 거리
      int distance = 0;            //입력된 점들의 거리
      int [] disArr = new int [10];   //입력된 점들의 배열
      
      ArrayList <Integer> rstArr = new ArrayList <>();   //입력된 점들의 거리를 저장하는 배열
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("10개의 숫자를 입력하세요.");
      
      for(int i=0; i<10; i++){
         disArr[i] = sc.nextInt();
      }
      
      //점들은 정렬되어 있다고 가정
      Arrays.sort(disArr);
      
      for(int i=0; i<disArr.length-1; i++){
         distance= disArr[i+1] - disArr[i];
         rstArr.add(distance);
         
         //앞뒤 점들의 거리비교 후 짧은 거리 저장
         if (rst == 0){
            rst = distance;
         }
         else{
            if( distance <= rst){ 
               rst = distance;
            }
         }
      }

      System.out.println("가장 짧은 거리의 점은? ");
      
      //점들 사이의 가장 짧은 거리와 비교하여 같은 값의 거리들의 쌍 출력
      for (int i=0; i<rstArr.size(); i++){
         if( rstArr.get(i) == rst) {
            System.out.println("( "+disArr[i]+" , "+disArr[i+1]+" )");
         }
      }
   }
}