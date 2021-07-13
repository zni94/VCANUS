/*3번, 4번 문제 */
public class Factorial {
	public static int factorial(int num) {
		int answer = 1;
		
		for(int i = 1; i <= num; i++) {
			answer *= i;
		}
		
		return answer;
	}
	public static void main(String[] args) throws StackOverflowError{
		int result = factorial(4);
		System.out.println(result);
	}

}
