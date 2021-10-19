package application;

public class Class {
	private String classCode = new String();
	private String className = new String();
	private String startDate = new String();
	private String endDate = new String();
	private String startTime = new String();
	private String endTime = new String();
	private String days = new String();

	public Class(String code, String name, String startDate, String endDate, String startTime, String endTime, String days) {
		classCode = code;
		className = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.days = days;
	}
	
	public String toString() {
		return classCode + ", " + className + ", " + startDate + ", " + endDate + ", " + startTime + ", " + endTime + ", " + days;
	}
}
