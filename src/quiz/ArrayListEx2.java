package quiz;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();
		
		System.out.println("=���������� �߰��ϱ�=");
		System.out.println("ArrayList :"+ add1(al));
		System.out.println("=���������� �߰��ϱ�=");
		
	}
	
	public static long add1(ArrayList al) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) al.add(i+"");
		return start;
	}
}
