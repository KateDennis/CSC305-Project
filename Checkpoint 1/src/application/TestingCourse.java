/* 
 * In this file, we are testing equals()
 * and compareTo() from our Course class.
 * The equals() and compareTo() are infamous for
 * being complicated. In addition,
 * when it comes to testing in this way,
 * it's important to be thorough.
 * 
 * It's important to point out here that 
 * our compareTo() method is more of a 
 * isThereConflict() method in a sense, 
 * as it determines whether or not you can have both courses.
 */

package application;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestingCourse {
	
	@Test
	void testRandomObjects() {
		//Tests to make sure Course object is not recognized as
		//just a String object
		Course courseOne = new Course(
				"CSC-201-02",
				"Intro to Computer Science",
				"OLIN",
				"307",
				"Tauheed Khan Mohd",
				"10:30AM",
				"11:45AM",
				"M W F"
				);
		
		String string = "Literally any other object.";
		Boolean result = courseOne.equals(string);		
		assertEquals(false,result);
	}
	
	@Test
	void testACopy() {
		// This is logically true, but it's important
		// to know that this case works, when it isn't
		// manually written in this way.
		
		Course courseTwo = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:20AM",
				"9:10AM",
				"Tu Th"
				);
		
		Boolean result = courseTwo.equals(courseTwo);
		assertEquals(true,result);
	}
	
	@Test
	void testInputVariety() {
		//Tests to make sure two Course objects are not the same. This is represented
		//by the Arches data given. These courses must be in the same format
		//as per given by Arches.
		
		Course courseOne = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:20AM",
				"9:10AM",
				"Tu Th"
				);
		
		Course courseTwo = new Course(
				"  MUSC-211L-01",
				"Muscianship  III Lab",
				"BERG ",
				"POTTERH  ",
				"Margaret   J Ellis",
				"8:20AM  ",
				"9:10AM",
				"Tu    Th "
				);
		
		Boolean result = courseOne.equals(courseTwo);
		assertEquals(false,result);
	}
	
	@Test
	void testTwoCourses() {
		//Compares two course objects making sure that the attributes are not
		//the same
		
		Course courseOne = new Course(
				"MUEN-209-NC",
				"Symphonic Band",
				"BERG",
				"ER",
				"James M Lambrecht",
				"4:15PM",
				"5:30PM",
				"Tu Th" 
				);
		
		Course courseTwo = new Course(
				"CSC-201-02",
				"Intro to Computer Science",
				"OLIN",
				"307",
				"Tauheed Khan Mohd",
				"10:30AM",
				"11:45AM",
				"M W F"
				);
		
		Boolean result = courseOne.equals(courseTwo);
		assertEquals(false,result);
	}
	
	@Test
	void testingBefore() {
		//Compares the course attributes of each course
		
		Course courseOne = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:20AM",
				"9:10AM",
				"Tu Th"
				);
		
		Course courseTwo = new Course(
				"MUEN-209-NC",
				"Symphonic Band",
				"BERG",
				"ER",
				"James M Lambrecht",
				"4:15PM",
				"5:30PM",
				"Tu Th" 
				);
		
		int result = courseOne.compareTo(courseTwo);
		assertEquals(-1,result);
	}
	
	@Test
	void testingSame() {
		//Tests to make sure the course attributes are the same within itself
		
		Course courseOne = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:20AM",
				"9:10AM",
				"Tu Th"
				);
		
		int result = courseOne.compareTo(courseOne);
		assertEquals(1,result);
	}
	
	@Test
	
	void testingWithin() {
		//Tests to make sure properly compare one course to another
		Course courseOne = new Course(
				"MUSC-211L-01",
				"Muscianship III Lab",
				"BERG",
				"POTTERH",
				"Margaret J Ellis",
				"8:30AM",
				"11:30AM",
				"M Tu W Th F"
				);
		
		Course courseTwo = new Course(
				"MUEN-209-NC",
				"Symphonic Band",
				"BERG",
				"ER",
				"James M Lambrecht",
				"10:30AM",
				"11:25",
				"Tu W Th F" 
				);
		
		int result = courseOne.compareTo(courseTwo);
		assertEquals(1,result);
	}
	
}