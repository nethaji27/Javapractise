package javapractise;
import java.util.*;
public class ArrayListEx1 {
public static void main(String[] args) {
	ArrayList<Integer> al= new ArrayList <Integer>();
	al.add(665666);
	al.add(8597);
	al.add(7557);
	System.out.println("before using for each loop");
	Collections.sort(al);
	for(Integer i:al) {
		System.out.println(i);
	}
	
}

}
