package example2;

public abstract class Account implements Cloneable {
	private String type;
	private String owner;
	
	protected Account(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public abstract String usage();
}
