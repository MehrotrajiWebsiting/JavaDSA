import java.util.*;
public class hacktoberfest {
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();
		ll.add("LinkedList");
		ll.add("JavaDSA");
		ll.add(1, "In");
		ll.add( " Java To Removing An Element");
		System.out.println(ll);
		ll.remove("JavaDSA");
		System.out.println(ll);
	}
}

