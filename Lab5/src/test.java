
public class test {

	public static void main(String[] args) {
		//test person object
		System.out.println("-----I am testing Person-----");
		Person p1 = new Person("Colin", 2020);
		Person p2 = new Person("Colin", 2020);
		Person p3 = new Person();
		System.out.println(p1.equals(p2));
		System.out.println(p1); // by default will call the toString function
		p1.setName("Bolin");
		p1.setYear(2022);
		System.out.println(p1.getName() + p1.getYear());
		
		//test student object
		System.out.println("-----I am testing Student-----");
		Student s1 = new Student("Colin", 2020, "Computer Engineering");
		Student s2 = new Student("Colin", 2020, "Computer Engineering");
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		s1.setMajor("Bomputer Bngineering");
		s1.setName("Bolin");
		s1.setYear(2021);
		System.out.println(s1.getName() + s1.getYear() + s1.getMajor());
		
		//test instructor object
		System.out.println("-----I am testing Instructor-----");
		Instructor i1 = new Instructor("Colin", 1999, "lecturer");
		Instructor i2 = new Instructor("Colin", 1999, "lecturer");
		System.out.println(i1.equals(i2));
		System.out.println(i1);
		i1.setName("Bolin");
		i1.setYear(1998);
		i1.setRank("Becturer");
		System.out.println(i1.getName() + i1.getYear() + i1.getRank());
		
		//test employee object
		System.out.println("-----I am testing Employee-----");
		Employee e1 = new Employee("Colin", 1999, 500000.00);
		Employee e2 = new Employee("Colin", 1999, 500000.00);
		System.out.println(e1.equals(e2));
		System.out.println(e1);
		e1.setName("Bolin");
		e1.setYear(1998);
		e1.setSalary(51000.00);
		System.out.println(e1.getName() + e1.getYear() + e1.getSalary());
		
		//test manager object
		System.out.println("-----I am testing Manager-----");
		Manager m1 = new Manager("Colin", 1999, 50000.00, "Human Resource");
		Manager m2 = new Manager("Colin", 1999, 50000.00, "Human Resource");
		System.out.println(m1.equals(m2));
		System.out.println(m1);
		m1.setName("Bolin");
		m1.setYear(1998);
		m1.setSalary(51000.00);
		m1.setDepartment("Buman Besource");
		System.out.println(m1.getName() + m1.getYear() + m1.getSalary() + m1.getDepartment());
		
		//test executive object
		System.out.println("-----I am testing Executive-----");
		Executive E1 = new Executive("Colin", 1999, 50000.00, "Human Resource", "Room 420");
		Executive E2 = new Executive("Colin", 1999, 50000.00, "Human Resource", "Room 420");
		System.out.println(E1.equals(E2));
		System.out.println(E1);
		E1.setName("Bolin");
		E1.setYear(1998);
		E1.setSalary(51000.00);
		E1.setDepartment("Buman Besource");
		E1.setOfficeLocation("Room 421");
		System.out.println(E1.getName() + E1.getYear() + E1.getSalary() + E1.getDepartment() + E1.getOfficeLocation());

	}

}
