package application;

import java.util.*;

public class SubmitHandler {

	ArrayList<Course> courseList = new ArrayList<Course>();

	/**
	 * Creates a Submit Handler which parses the data inputed into main text box
	 * 
	 * @param schedule - the list of the input from main
	 */
	public SubmitHandler(String[] schedule) {
		int i = 1;
		String code = "";
		String name = "";
		String professor = "";
		String building = "";
		String room = "";
		String days = "";
		String startTime = "";
		String endTime = "";

		ArrayList<String> buildingList = createBuildingList();
		ArrayList<String> courseCodeList = createCourseCodeList();

		// Going through the schedule to parse out required data
		for (String line : schedule) {

			// Checking for Course code in order to get course code and name
			if (line.length() >= 5 && courseCodeList.contains(line.substring(0, 4))) {
				code = line;
				name = schedule[i];
			}

			// Checking for days that the class runs in order to get which days it runs on
			// and the times that it runs
			if (line.contains("M ") && !(line.contains("-")) || line.contains("Tu ") || line.contains("W ")
					|| line.contains("Th ") || line.contains("F ")) {
				days = line;
				String[] times = schedule[i].split(" ");
				startTime = times[0];
				endTime = times[2];
				// Checking for a second weekday category and then adding course to course list
				if (schedule[i + 1].contains("M ") && !(schedule[i + 1].contains("-"))
						|| schedule[i + 1].contains("Tu ") || schedule[i + 1].contains("W ")
						|| schedule[i + 1].contains("Th ") || schedule[i + 1].contains("F ")) {
					building = schedule[i + 3];
					room = schedule[i + 4];
					professor = schedule[i + 5];
					String[] professorList = professor.split(",");
					professor = professorList[1] + " " + professorList[0];
					courseList.add(new Course(code, name, professor, building, room, startTime, endTime, days));
					days = schedule[i + 1];
					times = schedule[i + 2].split(" ");
					startTime = times[0];
					endTime = times[2];
				}
			}

			// Checking for building list in order to get building, room, and professor
			// Adds course to course List
			if (buildingList.contains(line) && !(code.contains("MULS"))) {
				building = line;
				room = schedule[i];
				professor = schedule[i + 1];
				String[] professorList = professor.split(",");
				professor = professorList[1] + " " + professorList[0];
				courseList.add(new Course(code, name, professor, building, room, startTime, endTime, days));
			}
			i++;
		}
		// FOR TESTING PURPOSES ONLY
		// System.out.println(courseList.toString());

	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	@Override
	public String toString() {
		return courseList.toString();
	}

	/**
	 * Creates an ArrayList<String> of all the course codes
	 * 
	 * @return an ArrayList<String> of course codes
	 */
	public ArrayList<String> createCourseCodeList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ACCT");
		list.add("AFSP");
		list.add("APMA");
		list.add("ARHI");
		list.add("ART-");
		list.add("ASIA");
		list.add("ASTR");
		list.add("BIOL");
		list.add("BUSN");
		list.add("CHEM");
		list.add("CHNS");
		list.add("CHST");
		list.add("CLAS");
		list.add("COMM");
		list.add("CSC-");
		list.add("CSD-");
		list.add("DATA");
		list.add("ECON");
		list.add("EDMU");
		list.add("EDUC");
		list.add("ENCW");
		list.add("ENGL");
		list.add("ENGR");
		list.add("ENTM");
		list.add("ENVR");
		list.add("FOOD");
		list.add("FREN");
		list.add("FRST");
		list.add("FYH-");
		list.add("FYI-");
		list.add("GEOG");
		list.add("GEOL");
		list.add("GIST");
		list.add("GRD-");
		list.add("GREK");
		list.add("GRMN");
		list.add("GRST");
		list.add("HEPE");
		list.add("HIST");
		list.add("HONR");
		list.add("ISS-");
		list.add("JPN-");
		list.add("JPST");
		list.add("KINS");
		list.add("LATN");
		list.add("LING");
		list.add("LSC-");
		list.add("LTAM");
		list.add("MATH");
		list.add("MJMC");
		list.add("MUCH");
		list.add("MUEN");
		list.add("MULS");
		list.add("MUSC");
		list.add("MSCI");
		list.add("NTGR");
		list.add("PHIL");
		list.add("PHYS");
		list.add("POLS");
		list.add("PSYC");
		list.add("PUBH");
		list.add("RELG");
		list.add("SCAN");
		list.add("SLP-");
		list.add("SOAN");
		list.add("SPAN");
		list.add("SPRI");
		list.add("SPST");
		list.add("SWED");
		list.add("THEA");
		list.add("WGSS");
		list.add("WLIT");
		list.add("WLCC");
		return list;
	}

	/**
	 * Creates an ArrayList<String> of the campus buildings
	 * 
	 * @return ArrayList<String> of Augustana College Buildings
	 */
	public ArrayList<String> createBuildingList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("EVLD");
		list.add("SORN");
		list.add("OLIN");
		list.add("LIND");
		list.add("BERG");
		list.add("ARTS");
		list.add("ABST");
		list.add("ARPO");
		list.add("SCIE");
		list.add("OLDM");
		list.add("JDPL");
		list.add("DENK");
		list.add("BROD");
		list.add("LIBR");
		list.add("SWEN");
		list.add("AND");
		list.add("CARV");
		list.add("CARH");
		list.add("BRUN");
		list.add("ANNX");
		return list;
	}

}
