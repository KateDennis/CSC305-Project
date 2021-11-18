package application;

import java.util.*;

public class ConflictChecker {
	
	private boolean hasConflicts = false;
	private ArrayList<String> conflictList = new ArrayList<String>(); 
	
	public ConflictChecker(ArrayList<Course> courseList) {
		int courseIndex = 0;
		for(Course course : courseList) {
			for(int i = courseIndex + 1; i < courseList.size(); i++) {
				if(course.equals(courseList.get(i))) {
					courseList.remove(i);
				} else if (course.compareTo(courseList.get(i)) > 0) {
					conflictList.add("Course " + course.getName() + " and Course " + courseList.get(i) + " have conflicting times");
					hasConflicts = true;
				}
			}
			courseIndex++;
		}
	}
	
	public boolean getHasConflicts() {
		return hasConflicts;
	}
	
	public ArrayList<String> getConflictList() {
		return conflictList;
	}

}
