import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class FizzBuzzMainTest {

	@Test
	public void testIf0() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        //test if n = 0;
        FizzBuzz fbtest = new FizzBuzz();
        fbtest.printFizzBuzz(0);
        assertEquals("" + System.getProperty("line.separator"), outContent.toString());
        
		
	}
	
	@Test
	public void testIf1() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //test if n = 1;
        FizzBuzz fbtest = new FizzBuzz();
        fbtest.printFizzBuzz(1);
        assertEquals("1" + System.getProperty("line.separator"), outContent.toString());
	}
	
	@Test
	public void testIf2(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //test if n = 2;
        FizzBuzz fbtest = new FizzBuzz();
        fbtest.printFizzBuzz(2);
        assertEquals("1" + System.getProperty("line.separator")+"1" + System.getProperty("line.separator"), outContent.toString());
		
	}
	@Test
	public void testIf20(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        //test if n = 20;
        FizzBuzz fbtest = new FizzBuzz();
        fbtest.printFizzBuzz(20);
        assertEquals("1" + System.getProperty("line.separator")+"1" + System.getProperty("line.separator")
        +"Prime" + System.getProperty("line.separator") + "Prime" + System.getProperty("line.separator")
        +"Prime" + System.getProperty("line.separator") + "8" + System.getProperty("line.separator")
        +"Prime" + System.getProperty("line.separator") + "Buzz" + System.getProperty("line.separator")
        +"34" + System.getProperty("line.separator") + "Fizz" + System.getProperty("line.separator")
        +"Prime" + System.getProperty("line.separator") + "Buzz" + System.getProperty("line.separator")
        +"Prime" + System.getProperty("line.separator") + "377" + System.getProperty("line.separator")
        +"Fizz" + System.getProperty("line.separator") + "Buzz" + System.getProperty("line.separator")
        +"Prime" + System.getProperty("line.separator") + "2584" + System.getProperty("line.separator")
        +"4181" + System.getProperty("line.separator") + "FizzBuzz" + System.getProperty("line.separator")
        , outContent.toString());
	}
	
	@Test
	public void testPrime(){
		//test some corner cases if the isPrime() method works
		int test_num_1 = 2;
		assertEquals(true,FizzBuzz.isPrime(test_num_1));

		int test_num_2 = 109;
		assertEquals(true,FizzBuzz.isPrime(test_num_2));
		

		int test_num_3 = 947786798;
		assertEquals(false ,FizzBuzz.isPrime(test_num_3));
	}

}
