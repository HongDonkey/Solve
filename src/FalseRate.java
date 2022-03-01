import java.util.ArrayList;
import java.util.Arrays;

public class FalseRate {
//	 실패율을 구하는 코드를 완성하라.

//	 실패율은 다음과 같이 정의한다.
//	 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
//	 전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] stages = { 2, 1, 2, 5, 2, 4, 3, 3 };
		double[] result = new double[N];
		int cnt = 1;
		int devide = stages.length;

		Arrays.sort(stages);
//		{1,2,2,2,3,3,4,5}
		System.out.println(Arrays.toString(stages));
		for (int i = 0; i < stages.length - 1; i++) {
			if (stages[i] == stages[i + 1]) {
				cnt ++;
				System.out.println(i + "cnt는" + cnt);
				result[i] = cnt / devide;
				devide --;
			}
//			else {
//				result[i] = cnt / devide;
//				devide --;
//			}
		}
		System.out.println(Arrays.toString(result));

	}

}
