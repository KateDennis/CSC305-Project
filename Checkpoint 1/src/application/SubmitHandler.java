package application;

import java.util.*;

public class SubmitHandler {

	/**
	 * Creates a Submit Handler which parses the data inputed into main text box
	 * 
	 * @param schedule is the list of the input from main
	 */
	public SubmitHandler(String[] schedule) {
		int i = 1;
		String code = "";
		String name = "";
		String professor = "";
		String building = "";
		String room = "";
		ArrayList<Class> classList = new ArrayList<Class>();
		ArrayList<String> buildingList = createBuildingList();

		// Going through the schedule to parse out required data
		for (String line : schedule) {
			// Exception to get the first name and code of the first class
			if (i == 1) {
				code = line;
				name = schedule[i];
			}
			// Checking for building list in order to get building, room, and professor
			if (buildingList.contains(line) && schedule.length > i + 2 && schedule[i + 2] != null
					&& !(schedule[i + 2].contains("MULS"))) {
				building = line;
				room = schedule[i];
				professor = schedule[i + 1];
			}
			// Checking for days that the class runs in order to get which days it runs on
			// and the times that it runs
			if (line.contains("M ") && !(line.contains("-")) || line.contains("Tu ") || line.contains("W ")
					|| line.contains("Th ") || line.contains("F ")) {
				String days = line;
				String[] times = schedule[i].split(" ");
				String startTime = times[0];
				String endTime = times[2];
				classList.add(new Class(code, name, professor, building, room, startTime, endTime, days));
			}
			i++;
		}

		System.out.println(classList.toString());

	}
	
	/**
	 * 
	 */
	public ArrayList<String> createCourseCodeList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ACCT");
		list.add("AFSP");
		list.add("APMA");
		list.add("ARHI");
		list.add("ART");
		list.add("ASIA");
		list.add("ASTR");
		list.add("BIOL");
		list.add("BUSM");
		list.add("CHEM");
		list.add("CHNS");
		list.add("CHST");
		list.add("CLASS");
		list.add("COMM");
		list.add("CSC");
		list.add("CSD");
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
		list.add("FYH");
		list.add("FYI");
		list.add("GEOG");
		list.add("GEOL");
		list.add("GIST");
		list.add("GRD");
		list.add("GREK");
		list.add("GRMN");
		list.add("GRST");
		list.add("HEPE");
		list.add("HIST");
		list.add("HONR");
		list.add("ISS");
		list.add("JPN");
		list.add("JPST");
		list.add("KINS");
		list.add("LATN");
		list.add("LING");
		list.add("LSC");
		list.add("LTAM");
		list.add("MATH");
		list.add("MJMC");
		list.add("MUCH");
		list.add("MUEN");
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
		list.add("SLP");
		list.add("SOAN");
		list.add("SPAN");
		list.add("SPRING");
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
