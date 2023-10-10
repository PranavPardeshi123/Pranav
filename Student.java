import java.util.Scanner; class Student 
{ 
 	String city;  	String name;  	int age; 
 
 	void Student(String c,String nm,int a) 
 	{ 
 	 	city = c;  	 	name = nm;  	 	age = a; 
 	} 
 	 	void getdata() 
 	{ 
 	 	Scanner in =new Scanner(System.in);  	 	System.out.print("Enter name: ");  	 	name=in.next(); 
 	 	System.out.print("Enter age: ");  	 	age=in.nextInt(); 
 	 	System.out.print("Enter city: ");  	 	city=in.next(); 
 	 	System.out.println(" "); 
 	} 
 
 	void putData() 
 	{ 
 	 	System.out.println("Name = " + name); 
  System.out.println("Age = " + age);   System.out.println("City = " + city); 
 	 	System.out.println(" "); 
 	} 
} 
 
class Main 
{ 
 	public static void main(String[] args) 
 	{ 
 	 	Student s1 = new Student();  	 	Student s2=new Student();  	 	s1.getdata();  	 	s2.getdata();  	 	s1.putData();  	 	s2.putData(); 
 	} 
} 
