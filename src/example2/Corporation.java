package example2;

public class Corporation extends Account{
	public Corporation(String owner) {
		super(owner);
	}

	@Override
	public String usage() {
		return getOwner() + " Corporation: The corporation account is open";
	}
}
