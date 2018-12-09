
public enum EnumExample {

	// Enumerarion are constants or Objects
	// Three objects
	// Constants
	// put comma upto compete entire enum list at last put semicolon
	saraesh("joe", "25"), anotherperson("cutie", "10"), neelesh("beauty", "19"), nayan("kerala", "13"),
	divya("tamil", "14"), dude("iwish", "16");
	
	

	private final String desc;
	private final String year;

	// Enumeration Constructor
	EnumExample(String description, String birthDay) {
		desc = description;
		year = birthDay;
	}

	public String getDesc() {
		return desc;
	}

	public String getYear() {
		return year;
	}

	

}