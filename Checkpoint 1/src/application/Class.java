package application;

public class Class {
	private String className = new String();
	private String startTime = new String();
	private String endTime = new String();
	private String days = new String();

	public Class(String name, String startTime, String endTime, String days) {
		className = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.days = days;
	}
	
	public String toString() {
		return className + ", " + startTime + ", " + endTime + ", " + days;
	}
}
