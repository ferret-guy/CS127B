//Class that emulates a piggy bank
public class PiggyBank {
	//Name: Mark Omo
	
	//value of the coins {penny, nickel, dime quarter, half dollar, dollar}
	final double[] coinValue = {0.01, 0.05, 0.10, 0.25, 0.5, 1.0};
	//Number of the respective coins in the piggy bank
	int[] coinAmount = new int[6]; 

	//Initialize Object
	public PiggyBank() { 
		//Empty no actions required
	}
 
	//Get the total number of coins 
	public int getTotalNumberOfCoins() {
		//Count coins
		int total = 0;
		for (int i = 0; i < coinAmount.length; i++){
			 total += coinAmount[i]; 
		}
		return total;
	}
 
	//Get the total valu3 of the Piggy Bank
	public double getTotalCashInBank() {
		//Count coins then cash
		double total = 0;
		for (int i = 0; i < coinAmount.length; i++){
			 total += coinAmount[i]*coinValue[i]; 
		}
		return total;
	}
	
	//Add a Penny
	public void addPennies(int penniesEntered) {
		coinAmount[0] += penniesEntered;
	}

	//Add a Nickel
	public void addNickels(int numberOfNickels) {
		coinAmount[1] += numberOfNickels;
	}

	//Add a Dime
	public void addDimes(int numberOfDimes) {
		coinAmount[2] += numberOfDimes;
	}

	//Add a Quarter
	public void addQuarters(int numberOfQuarters) {
		coinAmount[3] += numberOfQuarters;
	}
	
	//Add a half dollar
	public void addHalfDollar(int numberOfHalfDollar) {
		coinAmount[4] += numberOfHalfDollar;
	}
	
	//Add a dollar
	public void addDollar(int numberOfDollar) {
		coinAmount[5] += numberOfDollar;
	}
	
	//Set all coin counts to zero
	public void drainTheBank() {
		coinAmount = new int[6];
	}
}