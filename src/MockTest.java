import java.util.ArrayList;
import java.util.Arrays;

public class MockTest {
//	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };
		int[] ans1 = { 1, 2, 3, 4, 5 };
		int[] ans2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] ans3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] result = new int[3];

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		for (int i = 0; i < answers.length; i++) {

			if (ans1[i % ans1.length] == answers[i]) {
				num1++;
				result[0] = num1;
			}
			if (ans2[i % ans2.length] == answers[i]) {
				num2++;
				result[1] = num2;
			}
			if (ans3[i % ans3.length] == answers[i]) {
				num3++;
				result[2] = num3;
			}

		}
		int[] arr = new int[result.length];
        for(int i = 0; i < result.length; i++){
            arr[i] = result[i];
        }

		Arrays.sort(result);

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == result[2]) {
				list.add(i + 1);
			}

		}

		int answer[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(result));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
