import java.util.ArrayList;
import java.util.Collections;

public class MakeTheRestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		int answer = 0;
        ArrayList<Integer> quo = new ArrayList<>();
        int a = n - 1;
        for(int i = 2; i <= a; i++){
            if(a % i == 0){
                quo.add(i);
            }
        }
        System.out.println(quo);
//        quo.remove(0);
        Collections.sort(quo);
        answer = quo.get(0);
        System.out.println(answer);
	}

}
