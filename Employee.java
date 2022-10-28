import java.util.Date;

class Employee {

	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	
	Date date = new Date();
	
	Employee (String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public int getHireYear() {
		return hireYear;
	}
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	
	
	public double tax() {
		if (salary > 1000.0) {
			return salary * 0.03;
		} else {
			return 0.0;
		}
	}
	
	public double bonus() {
		if (workHours > 40) {
			return (workHours - 40) * 30.0;
		} else {
			return 0.0;
		}
	}
	
	public double raiseSalary() {
		int duration = date.getYear() + 1900 - hireYear;
		
		double totalSalary = ( salary - tax() + bonus() );
		double raiseSalary = 0.0;
		
		if(duration < 10) {
			raiseSalary = totalSalary * 0.05;
		} else if (duration > 9 && duration < 20) {
			raiseSalary = totalSalary * 0.10;
		} else if (duration > 19) {
			raiseSalary = totalSalary * 0.15;
		}
		
		return raiseSalary;
	}

	public void output() {
		System.out.println("Adı:\t\t\t\t" + name);
		System.out.println("Maaşı:\t\t\t\t" + salary);
		System.out.println("Çalışma saati:\t\t\t" + workHours);
		System.out.println("Başlangıç yılı:\t\t\t" + hireYear);
		System.out.println("Vergi:\t\t\t\t" + tax());
		System.out.println("Bonus:\t\t\t\t" + bonus());
		System.out.println("Maaş artışı:\t\t\t" + raiseSalary());
		System.out.println("Vergi ve Bonus ile Maaş:\t" + (salary - tax() + bonus()));
		System.out.println("Toplam maaş:\t\t\t" + (salary + bonus()));
	}
	
}
