public class App {
	public static void main(String[] args) throws Exception {
//      프로그래머스 신규 아이디 추천
		String new_id = "...!@BaT#*..y.abcdefghijklm.";
//		String new_id = "sa";
//      소문자로 바꿈
		String level1 = new_id.toLowerCase();
//         소문자, 숫자, ., -, _ 만 허용
		char[] level1_arr = level1.toCharArray();
		StringBuilder level2 = new StringBuilder();
		for (char c : level1_arr) {
			if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
				level2.append(c);
			}
		}
//		연속된 마침표 제거
		String level3 = level2.toString().replace("..", ".");
		while (level3.contains("..")) {
			level3 = level3.replace("..", ".");
		}
//		시작과 끝 마침표 제거
		String level4 = level3;
		if (level4.length() > 0) { // 0보다 커야하는 이유 : "=!=" 등의 문자가 들어오면 앞에서 모두 잘려 공백이 되기 때문에 
			if (level4.charAt(0) == '.') {
				level4 = level4.substring(1);
			}
		}
		if (level4.length() > 0) {
			if (level4.charAt(level4.length() - 1) == '.') {
				level4 = level4.substring(0, level4.length() - 1);
			}
		}
//		빈 문자열이면 "a"
		String level5 = level4;
		if (level5.equals("")) {
			level5 = "a";
		}
//		16자보다 많으면 15자로 줄여줌
		String level6 = level5;
		if (level6.length() >= 16) {
			level6 = level6.substring(0, 15);
		}
		if (level6.charAt(level6.length() - 1) == '.') {
			level6 = level6.substring(0, level6.length() - 1);
		}

//		2자 이하면 3자리가 될 때까지 끝 문자 반복
		StringBuilder level7 = new StringBuilder(level6);
		if (level7.length() <= 2) {
			while (level7.length() < 3) {
				level7.append(level7.charAt(level7.length() - 1));
			}

		}
		System.out.println(level1);
		System.out.println(level2);
		System.out.println(level3);
		System.out.println(level4);
		System.out.println(level5);
		System.out.println(level6);
		System.out.println(level7);
	}
}