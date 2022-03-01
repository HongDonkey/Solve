public class DivisorPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 13;
		int right = 17;
		int result = 0;
		for (int i = left; i <= right; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {

				int a = i % j;
				if (a == 0) {

					cnt++;

				}

			}
			if (cnt % 2 == 0) {
				result += i;

			} else {
				result -= i;

			}
		}
		System.out.println(result);

	}

}
