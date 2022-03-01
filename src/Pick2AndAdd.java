import java.util.ArrayList;
import java.util.Arrays;

public class Pick2AndAdd {
//	정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int numbers [] = {5,0,2,7};
		int [] answer = {};
        Arrays.sort(numbers);
        ArrayList<Integer> abc = new ArrayList<>();
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                a = numbers[i] + numbers[j];
                if(abc.indexOf(a) < 0){
                    abc.add(a);
                }
            }
        }
        answer = new int[abc.size()];
        
        for(int i = 0; i < answer.length; i++){
            
            answer[i] = abc.get(i);
        }
        System.out.println(Arrays.toString(answer));
        Arrays.sort(answer);
	}

}
