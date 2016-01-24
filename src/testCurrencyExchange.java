import static org.junit.Assert.*;

import org.junit.Test;

public class testCurrencyExchange {

	class Dollar
	{
		private int amount;
		
		public Dollar(int amount){
			this.amount = amount;
		}
		
		Dollar times(int multiplier){			
			return new Dollar(amount * multiplier);
		}
		
		public boolean equals(Object object){
			Dollar dollar = (Dollar)object;
			return amount == dollar.amount;
		}
	}
		
	
	class Frank
	{
		private int amount;
		
		Frank(int amount){
			this.amount = amount;
		}
		
		public Frank times(int times){
			return new Frank(amount * times);
		}
		
		public boolean equals(Object object){
			Frank frank = (Frank)object;
			return this.amount == frank.amount;
		}
		
		
	}
	
	@Test
	public void testFrankMultiplication() {
		Frank frank = new Frank(5);
		assertEquals(new Frank(10), frank.times(2));
		assertEquals(new Frank(15), frank.times(3));
	}
	
		
	@Test
	public void testDollarEquality(){		
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(4).equals(new Dollar(5)));				
	}
	
	@Test
	public void testDollarMultiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));	
		assertEquals(new Dollar(15), five.times(3));	
	}

}
