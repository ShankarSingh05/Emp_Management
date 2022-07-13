package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Emp e1 = new Emp(101, "Amit", 32, 600);
		Emp e2 = new Emp(104, "Nandu", 33, 700);
		Emp e3 = new Emp(103, "Shankar", 29, 500);
		Emp e4 = new Emp(102, "Tinku", 35, 800);
		Emp e5 = new Emp(105, "Ram", 34, 800);
		List<Emp> list = new ArrayList<Emp>();
		list.add(e1);
		list.add(e3);
		list.add(e5);
		list.add(e2);
		for (Emp emp : list) {
			System.out.println(emp);
		}
		Collections.sort(list);
		System.out.println("======================================================");
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}
}

//==============================================================

class Emp implements Comparable<Emp> {
	int id;
	String name;
	int age;
	Double salary;

	public Emp(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Emp o) {
		if (this.age>30) 
		{
			  if (this.salary==o.salary) 
			{
				return this.name.compareTo(o.name);
			}
				else 
				{
					return this.salary.compareTo(o.salary);
				}
		}
		return age;
	}
		
	}







