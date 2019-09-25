
public class Student extends Person1{

	private int idNum;
	private int yearsAtSchool;
	private int gradeAtSchool;
	private String advisorAtSchool;
	
	Student(int i, int y, int g, String a)
	{
		idNum = i;
		yearsAtSchool = y;
		gradeAtSchool = g;
		advisorAtSchool = a;
	}
	
	public Student()
	{
		idNum = 111222333;
		yearsAtSchool = 0;
		gradeAtSchool = 1;
		advisorAtSchool = "None";
	}

	public void toString(Student a)
	{
		System.out.println("ID Number: "+getIDNum());
		System.out.println("Years at school: "+this.getYearsAtSchool());
		System.out.println("Grade at school: "+this.getGradeAtSchool());
		System.out.println("Date of Birth: "+this.getAdvisorAtSchool());
	}
	
	public boolean equals(Student p)
	{
		if(idNum == p.getIDNum() && yearsAtSchool == p.getYearsAtSchool() && gradeAtSchool == p.getGradeAtSchool() && advisorAtSchool == p.getAdvisorAtSchool())
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	
	
	
	
	
	
	public int getYearsAtSchool()
	{
		return yearsAtSchool;
	}
	
	public void setYearsAtSchool(int y)
	{
		yearsAtSchool = y;
	}
	
	public int getGradeAtSchool()
	{
		return gradeAtSchool;
	}
	
	public void setGradeAtSchool(int g)
	{
		gradeAtSchool = g;
	}
	
	public String getAdvisorAtSchool()
	{
		return advisorAtSchool;
	}
	
	public void setAdvisorAtSchool(String a)
	{
		advisorAtSchool = a;
	}
	
	
	public int getIDNum()
	{
		return idNum;
	}
	
	public void setIDNum(int i)
	{
		idNum = i;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
