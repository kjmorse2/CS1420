package assign04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class MethodPracticeTest {
	
	MethodPractice subject;
	
	@BeforeEach
//	void setup() {
//		subject = new MethodPractice();
//	}
	
	
	@Test
	@DisplayName("Liters To Gallons")
	void testlitersToGallons() {
		assertEquals(0, MethodPractice.litersToGallons(3.7), "Should Round Down to 0");
		assertEquals(5, MethodPractice.litersToGallons(20.65), "Should Round Down to 5");
	}
	
	@Test
	@DisplayName("Testing Sum In Range")
	void testsumInRange(){
		assertEquals(45, MethodPractice.sumInRange(-4, 10), "Summing numbers between given indices inclusive");
		assertEquals(55, MethodPractice.sumInRange(0, 10), "Summing numbers between given indices inclusive");
		
	}
	
	@Test
	@DisplayName("Testing shiftCipher")
	void testshiftCipher() {
        assertEquals("lmnopqrstuvwxyz{|}~ !\\\"#$%&", MethodPractice.shiftCipher("abcdefghijklmnopqrstuvwxyz", 11));
		assertEquals("Uzqf!Qmbjo!Ufyu!Ifsf;!!Uif!rvjdl!cspxo!gpy!kvnqfe!pwfs!uif!mb{z!eph\"   ~~~", MethodPractice.shiftCipher("The quick brown fox jumped over the lazy dog!~~~}}}", 1));
	}

}
