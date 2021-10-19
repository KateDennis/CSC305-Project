package application;

import java.util.*;

public class SubmitHandler {
	
	/**
	 * 
	 * @param schedule
	 */
	public SubmitHandler(String[] schedule) {
		int i = 1;
		String name = "";
		ArrayList<Class> classList = new ArrayList<Class>();
		ArrayList<String> buildingList = createBuildingList();
		for (String line : schedule) {
			if (i == 1) {
				name = line;
			}
			if (buildingList.contains(line) && schedule.length > i + 2 && schedule[i + 2] != null) {
				name = schedule[i + 2];
			}
			if (line.contains("M ") && !(line.contains("-")) || line.contains("Tu ") || line.contains("W ") || line.contains("Th ")
					|| line.contains("F ")) {
				String days = line;
				String[] times = schedule[i].split(" ");
				String startTime = times[0];
				String endTime = times[2];
				classList.add(new Class(name, startTime, endTime, days));
			}
			i++;
		}

		System.out.println(classList.toString());

	}
	
	/**
	 * Creates an ArrayList<String> of the campus buildings
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
