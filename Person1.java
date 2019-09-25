
public class Person1 extends Object {

	public String name;
	private int age;
	private int height;
	protected int dateOfBirth;
	
	
	Person1(String n, int a, int h, int d)
	{
		name = n;
		age = a;
		height = h;
		dateOfBirth = d;
	}
	
	public Person1()
	{
		name = "Baby";
		age = 0;
		height = 0;
		dateOfBirth = 2019;
	}

	public int getAge()
	{
		return age;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	public void toString(Person1 a)
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.getAge());
		System.out.println("Height: "+this.getHeight()+"cm");
		System.out.println("Date of Birth: "+this.dateOfBirth);
	}
	
	public boolean equals(Person1 p)
	{
		if(name.equals(p.name) && age == p.getAge() && height == p.getHeight() && dateOfBirth == p.dateOfBirth)
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
