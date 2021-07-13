/*2¹ø*/
public class calculator {
	private int num;
	
	public calculator add(int num) {
		this.num += num;
		return this;
	}
	
	public calculator subtract(int num) {
		this.num -= num;
		return this;
	}
	
	public int out() {
		return num;
	}
	
	public static void main(String[] args) {
		calculator calculator = new calculator();
		
		int result = calculator.add(4).add(5).subtract(3).out();
		System.out.println(result);
	}
}

