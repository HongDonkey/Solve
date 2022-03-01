import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int budget = 9;
		int [] d = {1,3,2,5,4};
		int answer = 0;
        int a = 0;
        

        Arrays.sort(d);
//        1,2,3,4,5
        for(int i = 0; i < d.length; i++){
            a += d[i];
            if(a <= budget){
                answer = d.length;
            }
            // if(a > budget){
            //     answer = i - 1; 
            // }
            if(a > budget){
                answer = i;
                break;
                
            }

        }
        System.out.println(answer);
	}

}
