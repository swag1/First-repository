import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	GradeBook gradeBookNum1;
	GradeBook gradeBookNum2;
    
	@BeforeEach
	void setUp() throws Exception {
		 gradeBookNum1 = new GradeBook(5);
		 gradeBookNum2 = new GradeBook(5);
		
		gradeBookNum1.addScore(3.0);
		gradeBookNum1.addScore(10.0);
		gradeBookNum1.addScore(14.0);
		gradeBookNum1.addScore(23.0);
		gradeBookNum1.addScore(27.0);
		
		gradeBookNum2.addScore(9.0);
		gradeBookNum2.addScore(12.0);
		gradeBookNum2.addScore(18.0);
		gradeBookNum2.addScore(20.0);
		gradeBookNum2.addScore(42.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBookNum1 = null;
		gradeBookNum2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gradeBookNum1.toString().equals("3.0 , 10.0 , 14.0 , 23.0 , 27.0"));
		assertEquals(5,gradeBookNum1.getScoreSize(), .001);
		assertTrue(gradeBookNum2.toString().equals("9.0 12.0 18.0 20.0 42.0 "));
		assertEquals(5,gradeBookNum2.getScoreSize(), .001);
	}

	@Test
	void testSum() {
		assertEquals(77, gradeBookNum1.sum(), .0001);
		assertEquals(101, gradeBookNum2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(3, gradeBookNum1.minimum(), .001);
		assertEquals(9, gradeBookNum2.minimum(), .001);
	}
 
	@Test
	void testFinalScore() {
		assertEquals(74, gradeBookNum1.finalScore(), .001);
		assertEquals(92, gradeBookNum2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(gradeBookNum1.getScoreSize(), 5, 001); 
	}

	//@Test
	//void testToString() {
		//fail("Not yet implemented");
	//}
	
	

}
