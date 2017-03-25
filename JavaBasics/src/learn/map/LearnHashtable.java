package learn.map;

import java.util.Hashtable;
import java.util.Map;

import basics.bean.Friend;

public class LearnHashtable {
	/*
	 * To successfully store and retrieve objects from a hashtable, the objects used as keys must implement 
	 * the hashCode method and the equals method.
	 */

	public static void main(String[] args) {

		Map<Friend, String> ht = new Hashtable<Friend, String>();

		Friend f1 = new Friend("Hari", 36);
		Friend f2 = new Friend("Govind", 34);
		Friend f3 = new Friend("Nishanth", 34);
		Friend f4 = new Friend("Hari", 36);
		
		String status = "Good";

		ht.put(f1, status);
		ht.put(f2, "Good2");
		ht.put(f3, "Good3");
		ht.put(f4, status);

		System.out.println(ht.size());
		
		System.out.println(f1.hashCode());
		
		Friend fDel = new Friend("Hari", 36);
		
		ht.remove(fDel);
		System.out.println(ht.size());
	}
}
