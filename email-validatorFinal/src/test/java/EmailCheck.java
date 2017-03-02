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
	


}
