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
			System.out.print("��ȣ�� ������ �ּ���.. ");
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
		System.out.println("========== �޴� ���� ==========");
		System.out.println("1. ���");
		System.out.println("2. ã��");
		System.out.println("3. ����");
		System.out.println("4. ��ü���");
		System.out.println("===========================");
		System.out.println("0. ����");
		System.out.println("===========================");
	}

	@Override
	public void registerMenu() {
		System.out.println("========== �޴� ���� ==========");
		System.out.println("1. �л�");
		System.out.println("2. ����");
		System.out.println("3. ������");
		System.out.println("4. �����޴�");
		System.out.println("===========================");
		while (true) {
			System.out.print("��ȣ�� ������ �ּ���.. ");
			in = new BufferedReader(new InputStreamReader(System.in));
			try {
				int key = Integer.parseInt(in.readLine());
				if (key >= 1 && key <= 4) {
					if (key == 1) {
						System.out.print("���� : ");
						int age = Integer.parseInt(in.readLine());
						System.out.print("�̸� : ");
						String name = in.readLine();
						System.out.print("�й� : ");
						String year = in.readLine();
						register(new HaksaDto(age, name, 1, year));
					} else if (key == 2) {
						System.out.print("���� : ");
						int age = Integer.parseInt(in.readLine());
						System.out.print("�̸� : ");
						String name = in.readLine();
						System.out.print("���� : ");
						String year = in.readLine();
						register(new HaksaDto(age, name, 2, year));
					} else if (key == 3) {
						System.out.print("���� : ");
						int age = Integer.parseInt(in.readLine());
						System.out.print("�̸� : ");
						String name = in.readLine();
						System.out.print("�μ� : ");
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
		System.out.println("*��ϿϷ�*");
	}

	@Override
	public void findNameMenu() {
		HaksaDto haksa = null;
		System.out.println("ã�� �̸��� �Է����ּ���.");
		System.out.print("�̸� : ");
		try {
			String key = in.readLine();
			haksa = findName(key);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (haksa != null) {
			int key = haksa.getKey();
			if (key == 1)
				System.out.println("����:" + haksa.getAge() + 
						"\t�̸�: " + haksa.getName() + 
						"\t�й�: " + haksa.getValue());
			else if (key == 2)
				System.out.println("����:" + haksa.getAge() + 
						"\t�̸�: " + haksa.getName() + 
						"\t����: " + 	haksa.getValue());
			else if (key == 3)
				System.out.println("����:" + haksa.getAge() + 
						"\t�̸�: " + haksa.getName() + 
						"\t�μ�: " + 	haksa.getValue());
		} else {
			System.out.println("�˻� ��� ����");
		}

		System.out.print("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է��� �ּ���. ");
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
		System.out.println("��������");
		System.exit(0);
	}

}
