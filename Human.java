package paraBozma;

public class Human {
	private String name ;
	private String surname;
	
	public  Human(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
	public String getFullName() {
		return name + " " + surname;
	}
	
}