package com.kitri.haksa.test;

import com.kitri.haksa.service.HaksaDBServiceImpl;

public class HaksaDBMain {

	public static void main(String[] args) {
		
/*		HaksaDto stu = new HaksaDto(20, "�̼���", 1, "2012");
		HaksaDto prof = new HaksaDto(40, "�ڹٱ�����", 2, "JAVA Basic");
		HaksaDto admin = new HaksaDto(40, "������", 3, "IT");*/

		HaksaDBServiceImpl hsi = new HaksaDBServiceImpl();
		
		hsi.menu();
		
		
		System.out.println("���α׷� ����!");
	}
}
