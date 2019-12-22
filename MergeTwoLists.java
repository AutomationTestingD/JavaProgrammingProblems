package javaPrograms;

import java.util.ArrayList;

public class MergeTwoLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(5);
		arrayList2.add(6);
		arrayList2.add(7);
		arrayList2.add(8);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(9);
		a.add(10);
				
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>(10);
		
		arrayList3.addAll(arrayList);

		arrayList3.addAll(arrayList2);
		
		arrayList3.addAll(a);
		
		
		System.out.println(arrayList3);		
				
		}
}
