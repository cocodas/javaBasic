package collection.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingArrayList {
	private final int LIMIT;	// 자르고자 하는 글자의 개수를 지정한다.
	private final String source; 
	private final List<String> list;
	
	public UsingArrayList() {
		LIMIT = 10;
		source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		list = new ArrayList<String>();
	}

	public UsingArrayList(int lIMIT, String source) {
		LIMIT = lIMIT;
		this.source = source;
		list = new ArrayList<String>();
	}

	public List<String> arrayListSubString() {
		for (int i = 0; i < LIMIT; i++) {
			list.add(source.substring(i, i + 1));
		}
		return list;
	}
	
	public void printString() {
		for (int i = 0; i < source.length(); i++) {
			System.out.println(source.substring(i, i + 1));
		}
	}
	/*
	for(int i = 0; i < length; i += LIMIT) { 
		if(i + LIMIT < length ) 
			list.add(source.substring(i, i+LIMIT)); 
		else 
			list.add(source.substring(i)); 
	} 
	
	for(int i=0; i < list.size(); i++) { 
		System.out.println(list.get(i)); 
	}
	*/ 
	@Override
	public String toString() {
		return list.toString();
	}
}
