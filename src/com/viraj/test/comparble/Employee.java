package com.viraj.test.comparble;

public class Employee implements Comparable<Employee>{

	 	private int id;
	    private String name;
	    private int age;
	    private long salary;
		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public long getSalary() {
			return salary;
		}

		public Employee(int id, String name, int age, long salary) {
//			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		
		
		
		@Override
		public String toString() {
			return id+" name=" + name + ", age=" + age + ", salary=" + salary;
		}

		//let's sort the employee based on an id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
		@Override
		public int compareTo(Employee employee) {
			// TODO Auto-generated method stub
			return this.id-employee.id;
		}
		
		
		
		
	    
	    
}
