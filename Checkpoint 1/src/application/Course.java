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
		
		switch (startTime) {
		case "8:30":
			startCode = 8.3;
			break;
		}
	}

	public String toString() {
		return classCode + ", " + className + ", " + building + ", " + room + ", " + professor + ", " + startTime + ", " + endTime + ", " + days;
	}
}
