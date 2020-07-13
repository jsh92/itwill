package com.day25;

class BuilderExam {
	public static void main(String[] args) 	{
		String str="ABCDEFG";
		StringBuilder sb =  new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		//str = sb.toString();
		//System.out.println(str);

		str="990107-1112222";
		StringBuilder sb2 =  new StringBuilder(str);
		int idx = sb2.lastIndexOf("-");
		if (idx!=-1){
			sb2.deleteCharAt(idx);
		}
		System.out.println(sb2);

		StringBuilder sb3 =  new StringBuilder(str);
		for (int i=0;i<sb3.length() ;i++ ){
			if (sb3.charAt(i)=='-'){
				sb3.deleteCharAt(i);
				break;
			}
		}//for
		System.out.println(sb3);
	}
}

