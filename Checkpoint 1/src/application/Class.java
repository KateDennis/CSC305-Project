package application;

public class Class {
	private String classCode = new String();
	private String className = new String();
	private String startTime = new String();
	private String endTime = new String();
	private String days = new String();
	private String professor = new String();
	private String building = new String();
	private String room = new String();

	public Class(String code, String name, String professor, String building, String room, String startTime, String endTime, String days) {
		classCode = code;
		className = name;
		this.professor = professor;
		this.building = building;
		this.room = room;
		this.startTime = startTime;
		this.endTime = endTime;
		this.days = days;
	}
	
	public String toString() {
		return classCode + ", " + className + ", " + professor + ", " + startTime + ", " + endTime + ", " + days;
	}
}
