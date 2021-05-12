package it.formarete.refactoring;

/**
 * This class describes a Person in our system.
 * 
 * @author antony
 */
public class Person {
	private String name;
	
	private int age;
	private boolean happy;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	/**
	 * Sets the new age of this person.
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Checks whether this person is happy.
	 * 
	 * @return True if the person is happy.
	 */
	public boolean isHappy() {
		return happy;
	}

	public void setHappy(boolean happy) {
		this.happy = happy;
	}
}
