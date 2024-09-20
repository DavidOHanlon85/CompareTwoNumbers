/**
 * 
 */
package slideDeckTasks;

/**
 * 
 */
public class Exercise2_IfElseIf_CompareTwoNumbers {
	
	public static void main(String[] args) {
		
		// Declare in initiate variables
		
		int num1 = 20;
		int num2 = 15;
		
		if (num1 > num2) {
			System.out.println("The biggest number is: " + num1);
		} else if (num2 > num1) {
			System.out.println("The biggest number is: " + num2);
		} else {
			System.out.println("Both numbers are the same");
		}
	}

}
