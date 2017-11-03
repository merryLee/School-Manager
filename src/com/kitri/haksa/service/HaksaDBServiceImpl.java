package com.kitri.haksa.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.kitri.haksa.data.HaksaDto;

public class HaksaDBServiceImpl implements HaksaService {

	private List<HaksaDto> list = new ArrayList<HaksaDto>();
	private String job;
	private BufferedReader in;

	@Override
	public void menu() {
		printMenuIntro();
		while (true) {
			System.out.print("번호를 선택해 주세요.. ");
			in = new BufferedReader(new InputStreamReader(System.in));
			try {
				int key = Integer.parseInt(in.readLine());
				if (key >= 0 && key <= 5) {
					if (key == 1)
						registerMenu();
					else if (key == 2)
						findNameMenu();
					else if (key == 3)
						deleteMenu();
					else if (key == 4)
						selectAll();
					else if (key == 0)
						processExit();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void printMenuIntro() {
		System.out.println("========== 메뉴 선택 ==========");
		System.out.println("1. 등록");
		System.out.println("2. 찾기");
		System.out.println("3. 삭제");
		System.out.println("4. 전체출력");
		System.out.println("===========================");
		System.out.println("0. 종료");
		System.out.println("===========================");
	}

	@Override
	public void registerMenu() {
		System.out.println("========== 메뉴 선택 ==========");
		System.out.println("1. 학생");
		System.out.println("2. 교수");
		System.out.println("3. 관리자");
		System.out.println("4. 이전메뉴");
		System.out.println("===========================");
		while (true) {
			System.out.print("번호를 선택해 주세요.. ");
			in = new BufferedReader(new InputStreamReader(System.in));
			try {
				int key = Integer.parseInt(in.readLine());
				if (key >= 1 && key <= 4) {
					if (key == 1) {
						System.out.print("나이 : ");
						int age = Integer.parseInt(in.readLine());
						System.out.print("이름 : ");
						String name = in.readLine();
						System.out.print("학번 : ");
						String year = in.readLine();
						register(new HaksaDto(age, name, 1, year));
					} else if (key == 2) {
						System.out.print("나이 : ");
						int age = Integer.parseInt(in.readLine());
						System.out.print("이름 : ");
						String name = in.readLine();
						System.out.print("과목 : ");
						String year = in.readLine();
						register(new HaksaDto(age, name, 2, year));
					} else if (key == 3) {
						System.out.print("나이 : ");
						int age = Integer.parseInt(in.readLine());
						System.out.print("이름 : ");
						String name = in.readLine();
						System.out.print("부서 : ");
						String year = in.readLine();
						register(new HaksaDto(age, name, 3, year));
					} else if (key == 4)
						menu();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void register(HaksaDto haksa) {
		list.add(haksa);
		System.out.println("*등록완료*");
	}

	@Override
	public void findNameMenu() {
		HaksaDto haksa = null;
		System.out.println("찾을 이름을 입력해주세요.");
		System.out.print("이름 : ");
		try {
			String key = in.readLine();
			haksa = findName(key);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (haksa != null) {
			int key = haksa.getKey();
			if (key == 1)
				System.out.println("나이:" + haksa.getAge() + 
						"\t이름: " + haksa.getName() + 
						"\t학번: " + haksa.getValue());
			else if (key == 2)
				System.out.println("나이:" + haksa.getAge() + 
						"\t이름: " + haksa.getName() + 
						"\t과목: " + 	haksa.getValue());
			else if (key == 3)
				System.out.println("나이:" + haksa.getAge() + 
						"\t이름: " + haksa.getName() + 
						"\t부서: " + 	haksa.getValue());
		} else {
			System.out.println("검색 결과 없음");
		}

		System.out.print("계속하시려면 1, 종료하시려면 0을 입력해 주세요. ");
		try {
			int k = Integer.parseInt(in.readLine());
			if (k == 1)
				menu();
			else if (k == 0)
				processExit();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public HaksaDto findName(String name) {

		HaksaDto hd = null;
		
		return hd;
	}

	@Override
	public void deleteMenu() {

	}

	@Override
	public int delete(String name) {
		return 0;
	}

	@Override
	public void selectAll() {

	}

	@Override
	public void processExit() {
		System.out.println("서비스종료");
		System.exit(0);
	}

}
