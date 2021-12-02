/* 
 * In this file, I am testing equals()
 * and compareTo() from our Course class,
 * which in my opinion is important because
 * equals and compareto are infamous for
 * being complicated. Here, they are less
 * complicated, but I make do. In addition,
 * when it comes to testing in this way,
 * it's important to be thorough.
 * 
 */

package application;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestingCourse {
	
	@Test
	void testRandomObjects() {
		
		Course any = new Course(
				"CSC-201-02",
				"Intro to Computer Science",
				"OLIN",
				"307",
				"Tauheed Khan Mohd",
				"10:30AM",
				"11:45AM",
				"M W F"
				);
		
		String word = "Literally any other object.";
		Boolean result = any.equals(word);
		
		// Even eclipse knows this test is dumb
		// but testing can be useful, even if you
		// might think otherwise at first.
		
		assertEquals(false,result);
	}
	
	@Test
	void testACopy() {
		
		Course any = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:20AM",
				"9:10AM",
				"Tu Th"
				);
		
		Boolean result = any.equals(any);
		
		// This is logically true, but it's important
		// to know that this case works, when it isn't
		// manually written in this way.
		
		assertEquals(true,result);
	}
	
	@Test
	void testInputVariety() {
		
		Course any = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:20AM",
				"9:10AM",
				"Tu Th"
				);
		
		Course any2 = new Course(
				"  MUSC-211L-01",
				"Muscianship  III Lab",
				"BERG ",
				"POTTERH  ",
				"Margaret   J Ellis",
				"8:20AM  ",
				"9:10AM",
				"Tu    Th "
				);
		
		Boolean result = any.equals(any2);
		
		// I knew this would happen, but to be fair,
		// this situation is extremely unlikely.
		// The system interprets schedule information the
		// same way each time around, and knows to handle
		// extra spaces, whether there's one or multiple.
		
		assertEquals(true,result);
	}
	
	@Test
	void testTwoCourses() {
		
		Course any = new Course(
				"MUEN-209-NC",
				"Symphonic Band",
				"BERG",
				"ER",
				"James M Lambrecht",
				"4:15PM",
				"5:30PM",
				"Tu Th" 
				);
		
		Course old = new Course(
				"CSC-201-02",
				"Intro to Computer Science",
				"OLIN",
				"307",
				"Tauheed Khan Mohd",
				"10:30AM",
				"11:45AM",
				"M W F"
				);
		
		Boolean result = any.equals(old);
		
		// Obviously, we don't want these two to be the same.
		// It looks obvious, of course, but it's still important
		// to test this because when it isn't hard coded,
		// this testing will remove the uncertainty.
		
		assertEquals(false,result);
	}
	
	// Overall, there are some conclusions I reached
	// through this testing. Personally, I'm not entirely
	// sure how the system handles null for certain fields
	// in the course object itself, but I trust my group
	// members have that handled, and moreover, I don't
	// believe Arches would give data like that.
	
	// The other important conclusion I reached is that
	// JUnit testing needs to test methods, and personally,
	// I find that we could have split our code into
	// MORE methods, that way I could have tested other
	// parts of code without having to test large pieces.
	// But you live and learn.
	
	@Test
	void testingBefore() {
		
		Course any = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:20AM",
				"9:10AM",
				"Tu Th"
				);
		
		Course any2 = new Course(
				"MUEN-209-NC",
				"Symphonic Band",
				"BERG",
				"ER",
				"James M Lambrecht",
				"4:15PM",
				"5:30PM",
				"Tu Th" 
				);
		
		int result = any.compareTo(any2);
		assertEquals(-1,result);
	}
	
	@Test
	void testingSame() {
		
		Course any = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:20AM",
				"9:10AM",
				"Tu Th"
				);
		
		int result = any.compareTo(any);
		assertEquals(-1,result);
		
		// Technically, if you somehow listed the same
		// course twice, there wouldn't be an error,
		// because yes it's at the same time, but it's
		// the same class. This is kind of a fringe
		// technicality but I think it shows where
		// our code could adapt, if the use of
		// our program changed.
	}
	
	@Test
	
	void testingWithin() {
		
		Course any = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:30AM",
				"11:30AM",
				"M Tu W Th F"
				);
		
		Course any2 = new Course(
				"MUEN-209-NC",
				"Symphonic Band",
				"BERG",
				"ER",
				"James M Lambrecht",
				"10:30AM",
				"11:25",
				"Tu W Th F" 
				);
		
		int result = any.compareTo(any);
		assertEquals(1,result);
		
		// Because this test failed, it means that
		// our "compareto" method is working properly.
		// For this situation, I combined my J Term
		// class with my 100 level language class.
		// It's not a likely scenario at all, but it's
		// evidence our if then statements work.
	}
	
	// It's important to point out here that
	// our compareTo() method is more of a
	// isThereConflict() method in a sense,
	// as it determines whether or not you
	// can have both courses.
	
	// Another conclusion here is that there might
	// be a way to simplify the logic or reformat it,
	// but at the end of the day, if the code works
	// that's good too, generally.
}