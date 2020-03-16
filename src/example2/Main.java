package example2;

public class Main {
	public static void main(String[] args) {
		
		Account account[] = new Account[2];
		
		account[0] = new Corporation("REENGEN");
		account[1] = new Individual("Dila Aslan");
		
		
		System.out.println(account[0].usage());
		System.out.println(account[1].usage());
		
	}
}
