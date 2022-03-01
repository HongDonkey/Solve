import java.util.ArrayList;

public class FindPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  int n = 10;
	        
	        for(int i = n; 1 >= i; i--){
	           for(int j = 1; j < n; j++){
	               if(n % j == 0){
	                   list.add(j);
	                   System.out.println(list);
	               }
	           }
	            
	            
	        }

	}

}
