import java.util.ArrayList;

public class NumBaseball {

	//임의의 숫자가 들어있는 배열의 인덱스를 5로 나누었을 때
	//나머지가 1이면 1루, 2면 2루, 3이면 3루타, 4면 홈런이고 0이면 아웃이 되는 코드 작성
	public static void main(String[] args) {
		int [] swing = {3, 63, 22, 22, 61};
		int score = 0;
		int outCnt = 0;
		ArrayList<Integer> base = new ArrayList<>();
		for(int i = 0; i < swing.length; i++) {
			if(swing[i] % 5 == 0) {
				outCnt++;
				System.out.println(outCnt + "아웃!");
				if(outCnt == 3) {
					System.out.println("공수교대");
					break;
				}
			}
			else if(swing[i] % 5 == 1) {
				base.add(1);
			}
			else if(swing[i] % 5 == 2) {
				base.add(2);
			}
			else if(swing[i] % 5 == 3) {
				base.add(3);
			}
			else {
				System.out.println("홈런!");
				score = score + base.size() + 1;
				base.removeAll(base);
			}
			System.out.println(base);
			System.out.println(score);
		}

	}

}
