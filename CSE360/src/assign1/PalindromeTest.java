package assign1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testNormal() {
		Palindrome pal = new Palindrome("racecar");
		assertTrue(pal.isPalindrome());
		
		//pal = new Palindrome("java");
		//assertFalse(pal.isPalindrome());
		
		//fail("Not yet implemented");
	}

	//@Test
	//public void testSpecialSymbol() {
	//	Palindrome pal = new Palindrome("n%@$%n)(/;");
	//	assertTrue(pal.isPalindrome());
		
		//fail("Not yet implemented");
	//}
	
	@Test
	public void testDigits() {
		Palindrome pal = new Palindrome("racecar11611racecar");
		assertTrue(pal.isPalindrome());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testEmpty() {
		Palindrome pal = new Palindrome(" ");
		assertTrue(pal.isPalindrome());
		
		//fail("Not yet implemented");
	}
	
	
	
	@Test
	public void testSentences() {
		Palindrome pal = new Palindrome("sit on a potato pan otis");
		assertTrue(pal.isPalindrome());
		
		//fail("Not yet implemented");
	}




}
