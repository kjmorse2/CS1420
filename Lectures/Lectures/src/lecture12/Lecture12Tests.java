package lecture12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lecture12Tests {

	@Test
	void warmupBasicTest() {
		assertEquals(7, WarmupQ.arrayMax(new int [] {1,4,3,5,7,}));
	}
	
	@Test
	void warmupOneArray() {
		assertEquals(1, WarmupQ.arrayMax(new int [] {1}));
	}
	
	@Test
	void warmupRepetedNums() {
		assertEquals(789, WarmupQ.arrayMax(new int [] {7,7,7,7,7,7,7,7,9,7,7,7,7,7,789}));
	}
	
	@Test
	void warmupEmptyArray() {
		assertThrows(IllegalArgumentException.class, () -> { 
			WarmupQ.arrayMax(new int [] {});
			});
	}

}
