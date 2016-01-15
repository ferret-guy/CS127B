import static org.junit.Assert.*;

import org.junit.Test;

//Tests PiggyBank Bank class
public class PiggyBankTest {
	
	//Tests creation and retrieval 
	@Test 
	public void testGetters() {
		PiggyBank oinky = new PiggyBank();  
		assertEquals(0, oinky.getTotalNumberOfCoins());
		assertEquals(0, oinky.getTotalCashInBank(), 0.00001);
	} 
	//Tests adding coins
	@Test
	public void testPutters() {
		PiggyBank oinky = new PiggyBank();
		oinky.addPennies(1);
		assertEquals(1, oinky.getTotalNumberOfCoins());
		assertEquals(0.01, oinky.getTotalCashInBank(), 1e-13);
		
		oinky.addNickels(1);
		assertEquals(2, oinky.getTotalNumberOfCoins());
		assertEquals(0.06, oinky.getTotalCashInBank(), 1e-13);
		
		oinky.addDimes(1);
		assertEquals(3, oinky.getTotalNumberOfCoins());
		assertEquals(0.16, oinky.getTotalCashInBank(), 1e-13);
		
		oinky.addQuarters(1);
		assertEquals(4, oinky.getTotalNumberOfCoins());
		assertEquals(0.41, oinky.getTotalCashInBank(), 1e-13);
		
		oinky.addHalfDollar(1);
		assertEquals(5, oinky.getTotalNumberOfCoins());
		assertEquals(0.91, oinky.getTotalCashInBank(), 1e-13);
		
		oinky.addDollar(1);
		assertEquals(6, oinky.getTotalNumberOfCoins());
		assertEquals(1.91, oinky.getTotalCashInBank(), 1e-13);
	}
	//Tests utility functions
	@Test
	public void testUtility() {
		PiggyBank oinky = new PiggyBank();
		oinky.addPennies(1);
		oinky.addNickels(1);
		oinky.addDimes(1);
		oinky.addQuarters(1);
		oinky.addHalfDollar(1);
		oinky.addDollar(1);
		assertEquals(6, oinky.getTotalNumberOfCoins());
		oinky.drainTheBank();
		assertEquals(0, oinky.getTotalNumberOfCoins());
	}
}
