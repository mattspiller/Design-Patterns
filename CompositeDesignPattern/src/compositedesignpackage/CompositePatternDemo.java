// Written by Matt Spiller

package compositedesignpackage;

public class CompositePatternDemo {

	public static void main(String[] args) 
	{
		Person grandMother = new Person("Yvette", 77, null);
		Person father = new Person("Keith", 55, grandMother);
		Person uncle = new Person("Jamie", 52, grandMother);
		Person cousin = new Person("Max", 17, uncle);
		Person brother = new Person("Michael", 19, father);
		Person sister = new Person("Megan", 17, father);
		Person me = new Person("Matthew", 22, father);
		
		grandMother.addChildren(father);
		grandMother.addChildren(uncle);
		father.addChildren(me);
		father.addChildren(brother);
		father.addChildren(sister);
		uncle.addChildren(cousin);
		
		printFamily(grandMother, 0);
	}
	
	public static void printFamily(Person head, int layer)
	{
		// create a tab space for every generation above this person
		for(int i = 0; i < layer; i++)
			System.out.print("\t"); 
		
		// print head.toString();
		System.out.print(head);
		
		// If the person has children
		if(head.hasChildren())
			System.out.println(" " + head.getName() + " has the following descendants:");
		
		// If the person doesn't have children
		else
		{
			System.out.println();
			return;
		}
		
		// for each child the person has recurse this function one layer deeper
		for(Person child : head.getChildren())
		{
			printFamily(child, layer + 1);
		}
	}
}
