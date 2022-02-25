import java.util.ArrayList;

public class Ponketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 3 };

		int answer = 0;
		int length = nums.length / 2;
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(nums[0]);

		for (int i = 1; i < nums.length; i++) {
			if (!num.contains(nums[i])) {
				num.add(nums[i]);
			}
		}
		answer = (num.size() < length) ? num.size() : length;

	}

}
