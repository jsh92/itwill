package com.day14;

import java.util.Scanner;

class Programmer{	
	private String name;
	private String language;
	private int career;
	
	public Programmer(String p_name, String p_language, int p_career) {
		name = p_name;
		language = p_language;
		career = p_career;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName()	{
		return this.name;		
	}

	public void setLanguage(String language){
		this.language = language;
	}
	
	public String getLanguage(){
		return this.language;
	}
	
	public int getCareer(){
		return this.career;
	}

	public void setCareer(int career){
		this.career = career;			
	}
	
	public void work(){									
		System.out.println("프로그래밍을 합니다\n");
	}		
}//class

public class ProgrammerExam {
	public static void main(String[] args){
		System.out.println("이름, 개발언어, 개발경력을 입력하세요");	
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String lang = sc.nextLine();
		int career = sc.nextInt();
		System.out.println("==================================");

		Programmer p = new Programmer(name, lang, career);
		p.work();
		
		p.setName("김길동");
		p.setLanguage("java");
		p.setCareer(5);
		
		System.out.println("이름:"+p.getName());
		System.out.println("개발언어:"+p.getLanguage());
		System.out.println("개발경력: "+ p.getCareer() +"년");
		
		p.work();
	}
}