package com.kitri.haksa.data;

import java.util.ArrayList;

public class HaksaDao {
	
	public HaksaDao() {
		
	}

	public void register(HaksaDto haksa) {
		
	}
	
	public HaksaDto findName(String name) {
		HaksaDto haksa = new HaksaDto(0, name, 0, name);
		
		
		return haksa;
	}
	
	public int delete(String name) {
		int a = 0;
		
		
		return a;		
	}
	
	public ArrayList<HaksaDto> selectAllList() {
		ArrayList<HaksaDto> list = new ArrayList<HaksaDto>();
		
		return list;
	}
	
	
}
