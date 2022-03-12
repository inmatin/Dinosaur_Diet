/*
 * Student Name: Leanne Seaward
 * Lab Professor: Leanne Seaward
 * Due Date: September 24, 2021
 * Modified: September 24, 2021
 * Description: This class is creating a DinosaurDiet object and then using it to display the diet needs of 
 * of a dinosaur
*/
import java.util.Scanner;

public class TestDinosaurDiet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DinosaurDiet d1 = new DinosaurDiet();
		double weight;
		
		//prompt user to enter the weight
		System.out.print("Please enter the weight of the dinosaur: ");
		weight = input.nextDouble();
		
		//set the weight
		d1.setWeight(weight);
		//compute and print the diet needs
		d1.displayDietNeeds();
		
		//System.out.println(d1.toString());
		
		input.close();
		
		

	}

}
