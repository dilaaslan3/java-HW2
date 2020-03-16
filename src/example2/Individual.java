package example2;

public class Individual extends Account {

	public Individual(String owner) {
		super(owner);
	}

	@Override
	public String usage() {
		return getOwner() + "'s account: The individual account is open";
	}

}
