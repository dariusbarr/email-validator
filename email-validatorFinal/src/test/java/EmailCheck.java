import static org.junit.Assert.*;
import org.junit.*;



import org.junit.Test;


import org.junit.Test;



public class EmailCheck {

Email email= new Email("dariusbarr@gmail.com");
int passCnt=0;
	
	@Test
	public void testAtSign() {
		System.out.println("Testing for @ Sign:");
		assertEquals(true,email.atSign());
		
	
		
	}
	@Test
	public void testPeriod() {
		System.out.println("Testing for '.' Sign:");
		assertEquals(true,email.period());
	}
	
	@Test
	public void testSpace() {
		System.out.println("Testing for no spaces :");
		assertEquals(false,email.spaceCheck());
		 
			
		
	}
		
			
		
	@Test
	public void testLength() {
		System.out.println("Testing for 320 characters or less :");
		assertEquals(true,email.lengthCheck());
		 
			
		

		
	}


}
