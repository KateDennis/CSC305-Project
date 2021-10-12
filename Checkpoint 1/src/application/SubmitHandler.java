package application;

import java.util.*;

public class SubmitHandler {
	
	public SubmitHandler(String[] schedule) {
		int i = 1;
		ArrayList<Class> classList = new ArrayList<Class>();
		
		for (String line : schedule) {
			if (i % 11 == 1) {
				String name = schedule[i];
				String[] times = schedule[i + 6].split(" ");
				String startTime = times[0];
				String endTime = times[2];
				classList.add(new Class(name, startTime, endTime));
			}
			i++;
		}
	}
	

}
