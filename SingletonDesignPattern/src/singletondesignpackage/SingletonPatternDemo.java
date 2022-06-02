// Written by Matt Spiller

package singletondesignpackage;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		// The below constructor is not allowed because the Earth's constructor is private
		// Earth newEarth = new Earth();
		
		// Obtain the one and only Earth object and have the Earth say hello
		Earth theEarth = Earth.getTheEarth();
		theEarth.sayHello();
	}
}
