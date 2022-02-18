import java.util.Arrays;
import java.util.Random;

public class MakePrimeNum {
	// 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질
	// 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를
	// 완성해주세요.
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int answer = 0;
		int r = 0;

		for (int i = 0; i < nums.length; i++) {
			System.out.println("---");
			System.out.println(nums[i]);
			for (int j = i + 1; j < nums.length; j++) {
				System.out.println("===");
				System.out.println(nums[j]);
				for (int k = j + 1; k < nums.length; k++) {
					System.out.println("....");
					System.out.println(nums[k]);
					r = nums[i] + nums[j] + nums[k];
					int cnt = 0;
					for (int h = 1; h <= r; h++) {
						if (r % h == 0) {
							cnt++;
						}
					}
					if (cnt == 2) {
						answer++;
					}
				}
			}
		}

		System.out.println(answer);
	}
}