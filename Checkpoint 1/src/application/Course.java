package application;

public class Course {
	private String classCode = new String();
	private String className = new String();
	private String startTime = new String();
	private String endTime = new String();
	private String days = new String();
	private String professor = new String();
	private String building = new String();
	private String room = new String();
	private double dayCode = 0;
	private double startCode = 0;
	private double endCode = 0;

	public Course(String code, String name, String professor, String building, String room, String startTime,
			String endTime, String days) {
		classCode = code;
		className = name;
		this.professor = professor;
		this.building = building;
		this.room = room;
		this.startTime = startTime;
		this.endTime = endTime;
		this.days = days;
		createStartCode(startTime);
	}
	
	private double createStartCode(String startTime) {
		switch (startTime) {
		case "8:00AM":
			startCode = 8;
			break;
		case "8:20AM":
			startCode = 8.2;
			break;
		case "8:30AM":
			startCode = 8.3;
			break;
		case "9:00AM":
			startCode = 9;
			break;
		case "9:20AM":
			startCode = 9.2;
			break;
		case "10:00AM":
			startCode = 10;
			break;
		case "10:15AM":
			startCode = 10.15;
			break;
		case "10:20AM":
			startCode = 10.2;
			break;
		case "10:25AM":
			startCode = 10.25;
			break;
		case "10:30AM":
			startCode = 10.3;
			break;
		case "12:30PM":
			startCode = 12.3;
			break;
		case "1:00PM":
			startCode = 1;
			break;
		case "1:15PM":
			startCode = 1.15;
			break;
		case "2:15PM":
			startCode = 2.15;
			break;
		}
		return startCode;
	}
	
	public String getName() {
		return className;
	}
	
	public String getDays() {
		return days;
	}

	public String toString() {
		return classCode + ", " + className + ", " + building + ", " + room + ", " + professor + ", " + startTime + ", " + endTime + ", " + days;
	}
}
