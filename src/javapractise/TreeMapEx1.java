package javapractise;
import java.util.TreeMap;
public class TreeMapEx1 {
public static void main(String[] args) {
	TreeMap<Integer,String> hm= new TreeMap<Integer,String>();
	hm.put(10,"Alex");
	hm.put(15,"Nila");
	hm.put(20,"Tina");
	hm.put(22,"Peter");
	hm.put(5,"Tina");
	System.out.println("printing values only");
	System.out.println(hm.values());
	System.out.println("printing all keys");
	System.out.println(hm.keySet());
	System.out.println("all entries in map in key=value format");
	System.out.println(hm.entrySet());
	System.out.println(hm.get(20));
	System.out.println(hm.containsKey(25));
	System.out.println(hm.containsKey(5));
	System.out.println(hm.containsValue("tina"));
	System.out.println(hm.remove(20));
	System.out.println(hm.entrySet());
	System.out.println(hm.descendingKeySet());
	System.out.println(hm.descendingMap());
	System.out.println(hm.firstKey());
	System.out.println(hm.lastKey());
	hm.put(22,"pooja");
	System.out.println(hm.entrySet());
}
}
