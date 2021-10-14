package application;

import java.util.*;

public class SubmitHandler {

	public SubmitHandler(String[] schedule) {
		int i = 1;
		String name = "";
		ArrayList<Class> classList = new ArrayList<Class>();

		for (String line : schedule) {
			if (i % 11 == 1) {
				name = schedule[i];
			}
			if (line.contains("M ") && !(line.contains("-")) || line.contains("Tu ") || line.contains("W ") || line.contains("Th ")
					|| line.contains("F ")) {
				String days = line;
				String[] times = schedule[i + 1].split(" ");
				String startTime = times[0];
				String endTime = times[2];
				classList.add(new Class(name, startTime, endTime, days));
			}
			i++;
		}

		System.out.println(classList.toString());

	}

}
