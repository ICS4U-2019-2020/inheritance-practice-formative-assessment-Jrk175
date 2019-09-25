
public class Sept23_Main {
	public static void main(String[] args) {

		
		Person1 jackson = new Person1("Jackson", 17, 100, 2002);	
		
		Person1 baby = new Person1("Baby", 0, 0, 2019);
		
		Person1 unknown = new Person1();	
		
		System.out.println(jackson.getAge());
		
		System.out.println(unknown.getAge());
		
		jackson.setAge(3);
		
		unknown.setAge(99);
		
		System.out.println(jackson.getAge());
		
		System.out.println(unknown.getAge());
		
		System.out.println(jackson.getHeight());
		
		jackson.setHeight(300);
		
		System.out.println(jackson.getHeight());
		
		jackson.toString(jackson);
		
		System.out.println(jackson.equals(unknown));
		
		unknown.setAge(0);
		
		System.out.println(baby.equals(unknown));
		
		Student known = new Student();	
		
		Student a = new Student();	
		
		known.toString(known);
		
		System.out.println(a.equals(known));
		
		System.out.println(known.getGradeAtSchool());
		
		
		
		//Q 17
		
		Student s1 = new Student(); 
		Student s2 = (Student) new Person1(null, 0, 0, 0);
		Person1 p1 = new Student(0, 0, 0, "0");
		Person1 p2 = (Person1) new Object();
		Object o1 = new Student();
		Object o2 = new Person(null, 0, null);

		
		
		
		
		
	}
}
