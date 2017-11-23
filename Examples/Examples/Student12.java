
public class Student12 
{
	String name;
	int regno;
	static String university,standard;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getRegno() 
	{
		return regno;
	}
	public void setRegno(int regno) 
	{
		this.regno = regno;
	}
	public String getUniversity() 
	{
		return university;
	}
	public void setUniversity(String university) 
	{
		this.university = university;
	}
	public String getStandard() 
	{
		return standard;
	}
	public void setStandard(String standard) 
	{
		this.standard = standard;
	}
	public static void main(String args[])
	{
		Student12 s1=new Student12();
		s1.setName("Rakesh");
		s1.setRegno(1002);
		s1.setStandard("MS");
		s1.setUniversity("NW");
		
		Student12 s2=new Student12();
		s2.setName("Ashok");
		s2.setRegno(1004);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRegno());
		System.out.println(s1.getUniversity());
		System.out.println(s1.getStandard());
		
		System.out.println(s2.getName());
		System.out.println(s2.getRegno());
		System.out.println(s2.getUniversity());
		System.out.println(s2.getStandard());
		
		
	}
	
	

}
