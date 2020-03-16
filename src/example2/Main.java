package example2;

public class Main {
	public static void main(String[] args) {
		
		Individual individual = new Individual("Dila Aslan");
		Corporation corporation = new Corporation("REENGEN");
		
		System.out.println(individual.usage());
		System.out.println(corporation.usage());
		
	}
}
