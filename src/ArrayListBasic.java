
/** ARRAY IN JAVA
 * 
 *  @Author: Plipus Telaumbanua
 *  @LastModified: Nov 2023
 *  @Topic: ArrayList basic
 *  
 * */

import java.util.ArrayList;

class Person {
	
	String name;
	String ID;
	int age;
	
	public Person(String name, String id, int age) {
		this.name = name;
		this.ID = id;
		this.age = age;
	}
	
	public String getPerson() {
		return this.ID + ", " + this.name;
	}
}


public class ArrayListBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		
		if(arrayList.isEmpty()) {
			arrayList.add("Adam");
		}
		
		System.out.println(arrayList.get(0));
		
		Person person1 = new Person("Afrita", "01", 28);
		Person person2 = new Person("Phil", "02", 35);
		
				
		Person[] personList = {person1, person2};
		
		for (int i = 0; i < personList.length; i++) 
		{
			System.out.println(personList[i].getPerson());
		}
	}

}
