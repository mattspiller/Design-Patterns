// Written by Matt Spiller

package compositedesignpackage;

import java.util.ArrayList;

public class Person 
{
	private String name;
	private int age;
	private ArrayList<Person> children = new ArrayList<Person>();
	private Person parent;
	
	public Person(String name, int age, Person parent)
	{
		this.name = name;
		this.age = age;
		this.parent = parent;
	}
	
	public void addChildren(Person child)
	{
		children.add(child);
	}
	
	public boolean hasChildren()
	{
		return !children.isEmpty();
	}
	
	public ArrayList<Person> getChildren()
	{
		return children;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return (name + " who is " + age + " years old.");
	}
}
