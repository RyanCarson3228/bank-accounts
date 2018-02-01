package bank;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

	@Test
	public void shouldInstantiateABankAccount() {
		BankAccount underTest = new BankAccount();
		
		
		Assert.assertNotNull(underTest);
	}
	
	@Test
	public void shouldInstantiateBankAccountAccountNumTypeBalance() {
		BankAccount underTest = new BankAccount("", "", 0);
		Assert.assertNotNull(underTest);
	}
	
	@Test
	public void shouldReturnAccountNumAsFourOnes() {
		BankAccount underTest = new BankAccount ("1111", "", 0);
		String check = underTest.getAccountNum();
		
		Assert.assertEquals("1111", check);	
	}
	
	@Test
	public void shouldReturnTypeAsChecking() {
		BankAccount underTest = new BankAccount ("", "Checking", 0);
		String check = underTest.getType();
		
		Assert.assertEquals("Checking", check);
	}
	
	@Test
	public void shouldReturnBalanceAsFiveHundred() {
		BankAccount underTest = new BankAccount ("", "", 500.00);
		double check = underTest.getBalance();
		
		Assert.assertEquals(500.00, check, .001);
	}
	
}
