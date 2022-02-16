import java.util.Arrays;
import java.util.Stack;

public class PuppetDraw {

	public static void main(String[] args) {
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		Stack<Integer> stack = new Stack<>();
		
		
//		System.out.println(Arrays.toString(moves));
//		System.out.println(Arrays.deepToString(board));
		
		for(int i = 0; i < moves.length; i++) {
			for(int j =0; j < board.length; j++) {
//				int doll = moves[j] - 1;
//				System.out.println(Arrays.toString(board[j]));
//				stack.push(doll);
//				stack.peek();
			}
		}
//		System.out.println(board.length);
		for(int i : stack) {
//			System.out.println(stack);
		}
	}

}
