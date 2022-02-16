import java.util.Arrays;

public class NumEng {
//	s					result
//	"one4seveneight"	1478
//	"23four5six7"		234567
//	"2three45sixseven"	234567
//	"123"				123
	public static void main(String[] args) {
		String s = "one4seveneight";

		String eng[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String num[] = new String[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + "";
		}

//		System.out.println(Arrays.toString(num));
		
		for (int i = 0; i < eng.length; i++) {
			s = s.replace(eng[i], num[i]);
		}
		
		System.out.println(s);
	}

}
