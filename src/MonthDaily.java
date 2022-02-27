
public class MonthDaily {
//	2016 년 1 월 1
//	일은 금요일입니다.2016
//	년 a월
//	b일은 무슨 요일일까요?
//	두 수 a,b를 입력받아 2016
//	년 a월
//	b일이 무슨
//	요일인지 리턴하는 함수,
//	solution을 완성하세요.
//	요일의 이름은
//	일요일부터 토요일까지
//	각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//	입니다.예를 들어 a=5,b=24 라면 5 월 24
//	일은 화요일이므로 문자열"TUE"
//	를 반환하세요.

	// 22년을 기준으로 함

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 25;
		int day = 0;
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] daily = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "TUR" };

		if (a == 1) {
			day = day + b;
		} else {
			for (int i = 0; i < a - 1; i++) {
				day += month[i];
			}
			day += b;
		}

		System.out.println(day);
		String answer = daily[day % 7];
		System.out.println(answer);
	}

}
