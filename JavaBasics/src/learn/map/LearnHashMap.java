package learn.map;

import java.util.HashMap;
import java.util.Map;

import basics.bean.Friend;

public class LearnHashMap {
	
	/*
	 * Note that this implementation is not synchronized
	 * 
	 */

	public static void main(String[] args) {

		Map<Friend, String> hm = new HashMap<Friend, String>();

		Friend f1 = new Friend("Hari", 36);
		Friend f2 = new Friend("Govind", 34);
		Friend f3 = new Friend("Nishanth", 34);
		Friend f4 = new Friend("Hari", 36);

		hm.put(f1, "Good1");
		hm.put(f2, "Good2");
		hm.put(f3, "Good3");
		hm.put(f4, "Good1");

		System.out.println(hm.size());
	}
}
