package sample;

public class Human {
	private String name;
	private String lastName;
	private Gender gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Human(String name, String lastName, Gender gender) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
	}
	public Human() {
		super();
	}
	
	@Override
	public String toString() {
		return "Numan [name=" + name + ", lastName=" + lastName + ", gender=" + gender + "]";
	}
	
	
}
