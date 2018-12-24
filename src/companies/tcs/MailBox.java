package companies.tcs;



public class MailBox {
	private int id;
	private String name;
	private String creationDate;
	
	public MailBox(int id, String name, String creationDate) {
		this.id = id;
		this.name = name;
		this.creationDate = creationDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MailBox [id=" + id + ", name=" + name + ", creationDate=" + creationDate + "]";
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
}
