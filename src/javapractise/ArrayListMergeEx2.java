package javapractise;
import java.util.*;
public class ArrayListMergeEx2 {
	public static void main(String[] args) {
	ArrayList<Object> al= new ArrayList<Object>();
	al.add("java");
	al.add(235);
	al.add("sql");
	al.add(97);
	System.out.println("first list");
for(Object i:al) {
	System.out.println(i);
}
ArrayList<Object> al2= new ArrayList<Object>();
al2.add("script");
al2.add(5);
al2.add("sqlirirjrkkrkr");
al2.add(97);
System.out.println("second list");
for(Object i:al2) {
System.out.println(i);
}
al2.addAll(al);
System.out.println("mergedlist");
for(Object i:al2) {
	System.out.println(i);
}
}}
