import java.util.ArrayList;

public class SecretMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		String str1 = "";
		String str2 = "";
		String zero = "0";

		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		ArrayList<String> al1 = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();
		ArrayList<String> al3 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			str1 = "";
			while (arr1[i] != 0) {
				str1 = arr1[i] % 2 + str1;
				arr1[i] /= 2;
			}
//			System.out.println(String.format("%0" + n +"d", str));

			System.out.println("arr1 =  " + str1);
			while (str1.length() <= 4) {

				str1 = zero + str1;

			}

			al1.add(str1);

			str2 = "";
			while (arr2[i] != 0) {
				str2 = arr2[i] % 2 + str2;
				arr2[i] /= 2;
			}

			while (str2.length() <= 4) {
				str2 = zero + str2;
			}

			al2.add(str2);

		}
		String str3 = "";
		for(int i = 0; i<n; i++) {
			for(int j =0; j < 4; j++) {
				if(al1.get(i).substring(j, j+1) == "1" || al2.get(i).substring(j, j+1) == "1") {
//두 문자열 포개는 방법 모르겠음 나중에 다시
				}
			}
		}
		System.out.println(al1);
		System.out.println(al2);

	}

}
