public class App {
	public static void main(String[] args) throws Exception {
//        System.out.println("Hello, World!");
		String new_id = "...!@BaT#*..y.abcdefghijklm.";
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
		if (level4.charAt(0) == '.') {
			level4 = level4.substring(1);
		}
		if (level4.charAt(level4.length() - 1) == '.') {
			level4 = level4.substring(0, level4.length() - 1);
		}
		
		String level5 = level4;
		if (level5 == null) {
			level5 = "a";
		}
		
		String level6 = level5;
		if (level6.length() > 16) {
			level6 = level6.substring(0, 15);
		}
		System.out.println(level1);
		System.out.println(level2);
		System.out.println(level3);
		System.out.println(level4);
		System.out.println(level5);
		System.out.println(level6);
	}
}