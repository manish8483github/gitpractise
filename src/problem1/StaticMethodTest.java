package problem1;

public class StaticMethodTest {
	public static void main(String[] args) {

		/*
		 * Parent1.staticMethod(); Child1.staticMethod(); Parent1 parent = new Child1();
		 * parent.staticMethod(); }
		 */
		
		 parent1.staticMethod(); // Output: Value of X in Parent : 11

	        // Call static method of Child1
	        Child1.staticMethod(); // Output: Value of X in Child : 12

	        // Using a reference of Parent1 pointing to a Child1 object
	        parent1 parent = new Child1();
	        parent.staticMethod(); // Output: Value of X in Parent : 13
	}
}
