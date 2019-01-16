package models;

public class User 
{
	private String name;
	private long phn;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(long phn) {
		this.phn = phn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
