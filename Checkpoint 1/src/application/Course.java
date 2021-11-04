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
	private double startCode = 0;
	private double endCode = 0;

	/**
	 * Creates a course object
	 * 
	 * @param code      - the course code
	 * @param name      - the course name
	 * @param professor - the course professor
	 * @param building  - the course building
	 * @param room      - the course room
	 * @param startTime - the time the course starts
	 * @param endTime   - the time the course ends
	 * @param days      - the days the course occurs
	 */
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

	/**
	 * Creates the start code for the course in order to judge conflicts better
	 * 
	 * @param startTime - the time the course starts
	 * @return the time the class starts in the form of a double
	 */
	private double createStartCode(String startTime) {
		int startInt = 0;
		double startDouble = 0;
		if (startTime.substring(0, 2).contains("10") || startTime.substring(0, 2).contains("11")
				|| startTime.substring(0, 2).contains("12")) {
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

	/**
	 * Creates the end code for the course in order to judge conflicts better
	 * 
	 * @param endTime - the time the class ends
	 * @return the time the class ends in the form of a double
	 */
	private double createEndCode(String endTime) {
		int endInt = 0;
		double endDouble = 0;
		if (endTime.substring(0, 2).contains("10") || endTime.substring(0, 2).contains("11")
				|| endTime.substring(0, 2).contains("12")) {
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

	/**
	 * Gives the course name
	 * 
	 * @return the course name
	 */
	public String getName() {
		return className;
	}

	/**
	 * Gives the course days
	 * 
	 * @return the course days
	 */
	public String getDays() {
		return days;
	}

	/**
	 * Gives the course start code
	 * 
	 * @return the course start code
	 */
	public double getStartCode() {
		return startCode;
	}

	/**
	 * Gives the course end code
	 * 
	 * @return the course end code
	 */
	public double getEndCode() {
		return endCode;
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}

		if (!(object instanceof Course)) {
			return false;
		}

		Course other = (Course) object;

		if (this.classCode.equals(other.classCode) && this.className.equals(other.className)
				&& this.startTime.equals(other.startTime) && this.endTime.equals(other.endTime)
				&& this.days.equals(other.days) && this.professor.equals(other.professor)
				&& this.building.equals(other.building) && this.room.equals(other.room)
				&& this.startCode == other.startCode && this.endCode == other.endCode) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Course other) {
		return 0;
	}

	@Override
	public String toString() {
		return classCode + ", " + className + ", " + building + ", " + room + ", " + professor + ", " + startTime + ", "
				+ endTime + ", " + days;
	}
}
