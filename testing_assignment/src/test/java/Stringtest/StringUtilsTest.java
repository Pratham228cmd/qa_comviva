package Stringtest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import String.*;

public class StringUtilsTest {
	@Test
	public void stringreverse() {
		StringUtils Stringutils=new StringUtils();
		assertEquals("revir",Stringutils.reverse("river"));
		assertEquals("123",Stringutils.reverse("321"));
		assertEquals("",Stringutils.reverse(""));
	}
	@Test
	public void stringpalindrome() {
		StringUtils Stringutils=new StringUtils();
		assertFalse(Stringutils.isPalindrome("Hello"));
		assertTrue(Stringutils.isPalindrome("WOW"));
		assertTrue(Stringutils.isPalindrome("121"));
		assertTrue(Stringutils.isPalindrome(""));
	}
	@Test
	public void stringconcenate() {
		StringUtils Stringutils=new StringUtils();
		assertEquals("revir",Stringutils.concatenate("re","vir"));
		assertEquals("aditya",Stringutils.concatenate("adi","tya"));
		assertEquals("",Stringutils.concatenate("",""));
	} 
	@Test
	public void stringcountoccurance() {
		StringUtils Stringutils=new StringUtils();
		assertEquals(2,Stringutils.countOccurrences("aditya",'a'));
		assertEquals(2,Stringutils.countOccurrences("12121233",'3'));
		assertEquals(1,Stringutils.countOccurrences("aditya",'d'));
	}
}
