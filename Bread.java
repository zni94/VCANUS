/*1¹ø*/
public class Bread{
	
	private String type;
	private int flour;
	private int water;
	private int cream;

	public Bread(String type, int flour, int water, int cream) {
		this.type = type;
		this.flour = flour;
		this.water = water;
		this.cream = cream;
	}
	
	public String toString() {
		return "breadType\" : \"" + type + "\"\nrecipe\" : {" + "\n¡¡\"flour\" : " + flour +",\n¡¡\"water\" : " + water + ",\n¡¡\"cream\" : " + cream + "\n}";
	}
	
	public static void main(String[] args) {
		Bread cream = new Bread("cream",100,100,200);
		Bread sugar = new Bread("sugar",100,50,200);
		Bread butter = new Bread("butter",100,100,50);
		
		String bread[] = {cream.toString(), sugar.toString(), butter.toString()};
		
		for(int i = 0; i<bread.length; i++) {
			System.out.println(bread[i] + "\n");
		}
	}	
}