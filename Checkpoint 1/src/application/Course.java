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
		createEndCode(endTime);
	}
	
	private double createStartCode(String startTime) {
		int startInt = 0;
		double startDouble = 0;
		if (startTime.substring(0, 2).contains("10") || startTime.substring(0, 2).contains("11") || startTime.substring(0, 2).contains("12")) {
			startInt = Integer.parseInt(startTime.substring(0, 2));
			startDouble = Double.parseDouble(startTime.substring(3, 5));
		} else {
			startInt = Integer.parseInt(startTime.substring(0, 1));
			startDouble = Double.parseDouble(startTime.substring(2, 4));
		}
		startDouble = startDouble / 100;
		startCode = startInt + startDouble;
		return startCode;
	}
	
	private double createEndCode(String endTime) {
		int endInt = 0;
		double endDouble = 0;
		if (endTime.substring(0, 2).contains("10") || endTime.substring(0, 2).contains("11") || endTime.substring(0, 2).contains("12")) {
			endInt = Integer.parseInt(endTime.substring(0, 2));
			endDouble = Double.parseDouble(endTime.substring(3, 5));
		} else {
			endInt = Integer.parseInt(endTime.substring(0, 1));
			endDouble = Double.parseDouble(endTime.substring(2, 4));
		}
		endDouble = endDouble / 100;
		endCode = endInt + endDouble;
		return endCode;
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
