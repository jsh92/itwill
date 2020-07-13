package com.day18;

import java.util.Scanner;

class Employee{	
	protected String name;

	public Employee(String name){
		this.name = name;
	}

	public void setName(String name){		
		this.name = name;
	}

	public String getName()	{
			return this.name;
	}

	public int findPay(){
		return 0;
	}
	
}//

class Permanent extends Employee{	
	private int salary; //기본급여
	private int bonus; //보너스

	public Permanent(String name, int salary, int bonus){
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public void setSalary(int salary){
		this.salary = salary;	
	}

	public int getSalary(){
		return this.salary;
	}

	public void setBonus(int bonus){
		this.bonus = bonus;	
	}

	public int getBonus(){
		return this.bonus;
	}

	public int findPay(){
		return salary+bonus;
	}
}

class Temporary extends Employee{	
	private int time; //일한시간
	private int pay;  //시간당 급여

	public Temporary(String name, int time, int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}	

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return this.time;
	}
	
	public void setPay(int pay){
		this.pay = pay;
	}

	public int getPay(){
		return this.pay;
	}

	public int findPay(){
		return time*pay;
	}
}//

class EmployeeExam1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직(P), 임시직(T)을 입력하세요");
		String empType = sc.nextLine();
			
		if (empType.equalsIgnoreCase("P")){
			System.out.println("이름, 기본급여, 보너스를 입력하세요");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			int bonus = sc.nextInt();
			
			Permanent p = new Permanent(name, salary, bonus);
			
			String etype = "고용직";
			System.out.println("\n고용형태 : "+etype);
			System.out.println("이름 : "+p.getName());
			System.out.println("급여 : "+p.findPay());
		}else if (empType.equalsIgnoreCase("T")){
			System.out.println("이름, 일한시간, 시간당급여를 입력하세요");
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay = sc.nextInt();
			
			Temporary t = new Temporary(name, time, pay);

			String etype = "임시직";
			System.out.println("\n고용형태:"+etype);
			System.out.println("이름:"+t.getName());
			System.out.println("급여:"+t.findPay());
		}
	}
}
