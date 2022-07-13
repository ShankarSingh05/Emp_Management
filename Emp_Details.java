package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Emp_Details implements Comparable<Emp_Details>{
	int id;
	String name;
	Integer age;
	Double sal;
	Emp_Address add;

	public Emp_Details(int id, String name, int age, double sal, Emp_Address add) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Emp_Details [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + ", add=" + add + "]";
	}

	public static void main(String[] args) {
		Emp_Address add_02 = new Emp_Address(2, "chinnapanhalli 2ed cross", "Ranchi", 220037);
		Emp_Address add_03 = new Emp_Address(3, "chinnapanhalli 3th cross", "Bangalore", 560037);
		Emp_Address add_01 = new Emp_Address(1, "chinnapanhalli 1st cross", "Bihar", 824127);
		Emp_Details e1 = new Emp_Details(103, "Shankar", 32, 800, add_01);
		Emp_Details e2 = new Emp_Details(101, "Amit", 29, 300, add_02);
		Emp_Details e3 = new Emp_Details(102, "Nandu", 33, 400, add_03);
		Emp_Details e4 = new Emp_Details(104, "Mohan", 34, 200, add_01);
		Emp_Details e5 = new Emp_Details(106, "Sohan", 36, 500, add_02);
		Emp_Details e6 = new Emp_Details(105, "Sita", 30, 700, add_03);

		List<Emp_Details> list = new LinkedList<Emp_Details>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		System.out.println(list);
		System.out.println("===================================================================================");
		// Collections.sort(list);
		// System.out.println(list);
		ListIterator<Emp_Details> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Emp_Details emp_Details = (Emp_Details) listIterator.next();
			if (emp_Details.age > 30) {
				//System.out.println(emp_Details);
				if (emp_Details.sal == listIterator.next().sal) {
					System.out.println(emp_Details.name.compareTo(listIterator.next().name));
				} else {
					System.out.println(emp_Details.sal.compareTo(listIterator.next().sal));
				}
			}
		}
	}

	@Override
	public int compareTo(Emp_Details o) {
		
		return 0;
	}

}
