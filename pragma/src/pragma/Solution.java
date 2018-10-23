package pragma;

public class Solution {
	public void solution(int[] A, int K) {
		// write your code in Java SE 8		

		for (int index = 0; index < A.length; index++) {
			System.out.println("+-----");
			System.out.println("|  " + A[index] + " |");
			//System.out.print("+-----");
			if (index == (A.length) - 1 ){
				System.out.println("+-----");
				
			}
		}		
       System.out.print("\r");
	}

	public static void main(String[] args) {
		int[] intArray = new int[] { 4, 35, 80, 123, 12345, 44, 8, 5 };
		int k = 4;
		Solution solve = new Solution();
		solve.solution(intArray, k);
	}
}
