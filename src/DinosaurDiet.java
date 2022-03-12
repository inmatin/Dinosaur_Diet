/*
 * Student Name: Leanne Seaward
 * Lab Professor: Leanne Seaward
 * Due Date: September 24, 2021
 * Modified: September 24, 2021
 * Description: This class describes a DinosaurDiet object which is used to compute the total number of 
 * calories required for a dinosaur based on weight as well as the equivalent in cows, chickens or humans
 */

public class DinosaurDiet {

	// weight of dinosaur
	private double weight;
	// number of calories in a whole cow
	private double caloriesCow;
	// number of calories in a whole human
	private double caloriesHuman;
	// number of calories in a whole chicken
	private double caloriesChicken;
	// calories required per tonne of body weight for a dinosaur
	private double caloriesPerTonne;

	// constructor which sets the defaults
	public DinosaurDiet() {
		weight = 0;
		caloriesCow = 1100000;
		caloriesHuman = 110000;
		caloriesChicken = 1037;
		caloriesPerTonne = 20000;
	}

	// getter for dinosaur weight
	public double getWeight() {
		return this.weight;
	}

	// getter for the number of calories in a human
	public double getCaloriesHuman() {
		return this.caloriesHuman;
	}

	// getter for the number of calories in a cow
	public double getCaloriesCow() {
		return this.caloriesCow;
	}

	// getter for the number of calories in a chicken
	public double getCaloriesChicken() {
		return this.caloriesChicken;
	}

	// getter for the calories required per tonne of bodyweight for a dinosaur
	public double getCaloriesPerTonne() {
		return this.caloriesPerTonne;
	}

	// set the weight of the dinosaur
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// set the calories per human
	public void setCaloriesHuman(double caloriesHuman) {
		this.caloriesHuman = caloriesHuman;
	}

	// set the calories per cow
	public void setCaloriesCow(double caloriesCow) {
		this.caloriesCow = caloriesCow;
	}

	// set the calories per chicken
	public void setCaloriesChicken(double caloriesChicken) {
		this.caloriesChicken = caloriesChicken;
	}

	// set the calories per tonne of bodyweight for a dinosaur
	public void setCaloriesPerTonne(double caloriesPerTonne) {
		this.caloriesPerTonne = caloriesPerTonne;
	}

	// computes the required number of chickens cows or humans based on the weight
	// of the dinosaur
	// and the calories of each
	//worker/helper method
	public void displayDietNeeds() {
		double numChickens;
		double numCows;
		double numHumans;

		numChickens = Math.ceil((this.weight * this.caloriesPerTonne) / this.caloriesChicken);
		numCows = Math.ceil((this.weight * this.caloriesPerTonne) / this.caloriesCow);
		numHumans = Math.ceil((this.weight * this.caloriesPerTonne) / this.caloriesHuman);

		System.out.println("For a dinosaur that weighs " + this.weight + " tonne(s) you will require:");
		System.out.println(numChickens + " chicken(s) or");
		System.out.println(numCows + " cows(s) or ");
		System.out.println(numHumans + " humans(s)");

	}

	// generate a String which dhows contents of the DinosaurDiet object
	@Override
	public String toString() {
		return "DinosaurDiet [weight=" + weight + ", caloriesCow=" + caloriesCow + ", caloriesHuman=" + caloriesHuman
				+ ", caloriesChicken=" + caloriesChicken + ", caloriesPerTonne=" + caloriesPerTonne + "]";
	}




}
