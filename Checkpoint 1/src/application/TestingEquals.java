package application;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// In this file, I am testing the equals
// method of our Course object class.

class TestingEquals {

	@Test
	void goodTest() {
		
		// This course data is actually coming from
		// schedule five in the example schedule
		// info file.
		
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
		// but testing can be useful, even if
		// might think otherwise at first.
		
		assertEquals(false,result);
	}
	
	@Test
	void betterTest() {
		
		// This is another course from schedule five
		// having been converted by our program into
		// a course object already.
		
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
		
		// This is logically true, but more it's important
		// to know that this case works, when it isn't
		// manually written in this way.
		
		assertEquals(true,result);
	}
	
	@Test
	void bestTest() {
		
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
	void anotherGoodTest() {
		
		// Here is another course object generated
		// using the info from schedule five.
		
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
	
	// And truly, I could have made more specific cases,
	// but since the fields are ALL strings, this is relatively
	// uncomplicated, and again, certain test cases are more
	// like to really occur than others.
}