package assign05Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


class RectangleClassTest {
		
	Rectangle r1 = new Rectangle();
	Rectangle r2 = new Rectangle(5, 7, 10, 20);
	Rectangle r3 = new Rectangle(-10, 8, 5, 15);
	Rectangle r4 = new Rectangle(1, 1, 2, 2);
	
	@Test
	@DisplayName("Get X")
	void testGetX() {
		assertEquals(0, r1.getX());
		assertEquals(-10, r3.getX());
	}
	
	@Test
	@DisplayName("Get Y")
	void testGetY() {
		assertEquals(7, r2.getY());
		assertEquals(8, r3.getY());
	}
	
	@Test
	@DisplayName("Get Width")
	void testGetWidth() {
		assertEquals(10, r2.getWidth());
		assertEquals(2, r4.getWidth());
	}
	
	@Test
	@DisplayName("Get Height")
	void testGetHeight() {
		assertEquals(20, r2.getHeight());
		assertEquals(2, r4.getHeight());
	}
	
	@Test
	@DisplayName("Move")
	void testMove() {
//		Rectangle r1Test = r1;
//		r1Test.move(4, 12);
		r1.move(4, 12);
		assertEquals(4, r1.getX());
		assertEquals(12, r1.getY());
		
//		Rectangle r3Test = r3;
//		r3Test.move(2, 7);
		r3.move(2, 7);
		assertEquals(2, r3.getX());
		assertEquals(7, r3.getY());
	}
	
	@Test
	@DisplayName("Scale")
	void testScale() {
//		Rectangle r1Test = r1;
//		r1Test.scale(11, 2);
		r1.scale(11, 2);
		assertEquals(11, r1.getWidth());
		assertEquals(2, r1.getHeight());
		
//		Rectangle r4Test = r1;
//		r4Test.scale(20, 1);
		r4.scale(20, 1);
		assertEquals(40, r4.getWidth());
		assertEquals(2, r4.getHeight());
	}
	
	@Test
	@DisplayName("Larger Than")
	void testLargerThan() {
		assertTrue(r1.largerThan(r2));
		assertTrue(r4.largerThan(r3));
	}
	
	@Test
	@DisplayName("To String")
	void testToString() {
		assertTrue("10 x 20 rectangle at (5, 7)".equals(r2.toString()));
		assertTrue("5 x 15 rectangle at (2, 7)".equals(r3.toString()));
	}
	
	@Test
	@DisplayName("To Bound Rectangle")
	void testBoundRectangle() {
		Rectangle boundR1R2 = r1.boundingRectangle(r2);
		assertTrue("11 x 20 rectangle at (4, 7)".equals(boundR1R2.toString()));
		Rectangle boundR3R4 = r3.boundingRectangle(r4);
		assertTrue("40 x 21 rectangle at (1, 1)".equals(boundR3R4.toString()));

	}
	
	
}