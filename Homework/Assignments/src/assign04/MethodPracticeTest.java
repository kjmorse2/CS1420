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
		assertEquals(MethodPractice.litersToGallons(3.7), 0, "Should Round Down to 0");
		assertEquals(MethodPractice.litersToGallons(20.65), 5, "Should Round Down to 5");
	}
	
	@Test
	@DisplayName("Testing Sum In Range")
	void testsumInRange(){
		assertEquals(MethodPractice.sumInRange(-4, 10), 45, "Summing numbers between given indices inclusive");
		assertEquals(MethodPractice.sumInRange(0, 10), 55, "Summing numbers between given indices inclusive");
		
	}
	
	@Test
	@DisplayName("Testing shiftCipher")
	void testshiftCipher() {
		assertTrue(MethodPractice.shiftCipher("abcdefghijklmnopqrstuvwxyz", 11).equals("lmnopqrstuvwxyz{|}~ !\\\"#$%&"));
		assertEquals(MethodPractice.shiftCipher("The quick brown fox jumped over the lazy dog!~~~}}}", 1), "Uzqf!Qmbjo!Ufyu!Ifsf;!!Uif!rvjdl!cspxo!gpy!kvnqfe!pwfs!uif!mb{z!eph\"   ~~~");
	}

}
