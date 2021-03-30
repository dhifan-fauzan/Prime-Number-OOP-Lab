import java.lang.Math;

public class primeNumber {
	public static void main(String[] args) {
		
		int[] numberArr = new int[500];
				
		for(int i = 1; i <= 500; i++) {
			
			numberArr[i-1] = i;
			
			
		}
		
		for(int k = 0; k < 500; k++) {
			
			System.out.println(numberArr[k] + " " + isPrime(numberArr[k]));
			
		}
		
		
	}
	
	public static boolean isPrime(int number) {
		
		int limit = (int) Math.sqrt(number) + 1;
		
		for(int j = 2; j < limit; j++) {
			
			if(number % j == 0) {
				
				return false;
				
			}
			
	
		}
		
		return true;
	}
}
