
public class Base3 {
//자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =45;
		int cnt = 0;
		while(n > 0) {
			if(n%3 == 0) {
				cnt ++;
				n = n / 3;
				
			}
			if(n < 3) {
				break;
			}
		}
		
		System.out.println(cnt);
	}

}
