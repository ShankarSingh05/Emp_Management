package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingByNameUsingComprable {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("J", 101));
		emplist.add(new Employee("E", 106));
		emplist.add(new Employee("S", 103));
		emplist.add(new Employee("B", 105));
		emplist.add(new Employee("C", 102));
		emplist.add(new Employee("A", 104));
		emplist.add(new Employee("S", 107));
		emplist.add(new Employee("C", 108));

		Collections.sort(emplist);
		emplist.forEach(empolyee -> System.out.println(empolyee.getName() + "   " + empolyee.getId()));
	}

}

class Employee implements Comparable {
	private String name;
	private Integer id;

	public Employee(String string, int i) {
		this.name = string;
		this.id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Object o) {
		Employee employee = (Employee) o;
		String name = employee.name;
		if (name == this.name) {
			return this.id.compareTo(employee.id);
		} else {
			return this.name.compareTo(name);
		}

	}
}
