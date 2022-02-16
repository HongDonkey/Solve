import java.util.Arrays;

public class AddNumDontExist {
// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		int numbers[] = {5,8,4,0,6,7,9};
		
//		0부터 9까지의 합 = 45
		int answer = 45;
		
//		numbers 배열의 값 합산
		for(int i = 0; i<numbers.length; i++) {
			answer -= numbers[i];
		}
//		결과 구하기
		System.out.println(answer);
	}

}
