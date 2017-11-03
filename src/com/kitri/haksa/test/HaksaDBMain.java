package com.kitri.haksa.test;

import com.kitri.haksa.service.HaksaDBServiceImpl;

public class HaksaDBMain {

	public static void main(String[] args) {
		
/*		HaksaDto stu = new HaksaDto(20, "이선민", 1, "2012");
		HaksaDto prof = new HaksaDto(40, "자바교수님", 2, "JAVA Basic");
		HaksaDto admin = new HaksaDto(40, "관리자", 3, "IT");*/

		HaksaDBServiceImpl hsi = new HaksaDBServiceImpl();
		
		hsi.menu();
		
		
		System.out.println("프로그램 종료!");
	}
}
