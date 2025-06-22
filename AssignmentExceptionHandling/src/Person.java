public class Person {
	
	private String expertise;
	private String education;
	private int year;
	private String language;
	private int age;
	private String experience;
	
	public Person() {
		
	}
	
	public Person(String expertise, String education, int year, String language, int age, String experience) {
		this.expertise = expertise;
		this.education = education;
		this.year = year;
		this.language = language;
		this.age = age;
		this.experience = experience;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	public void chechEligiblity(String c)
	{
		
		if( c == "Java Full Stack")
		{
			System.out.println("Ok");
		}
		else
		{
			throw ExpertiseException e;
		}
		
	}
	

}
