package programmers;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
	public SetTest1() {
		Set<String>set=new HashSet<String>();
		set.add("test");
		set.add("test1");
		set.add("test2");
		set.add("test3");
		set.add("test4");
		set.add("test5");		
		System.out.println(set.add("test"));
		
	}
	public static void main(String[] args) {
		new SetTest1();
	}
}
