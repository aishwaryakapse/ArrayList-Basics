import java.util.ArrayList;
import java.util.Iterator;

public class EachElementAL {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Dave");
		list.add("Peter");
		list.add("John");
		System.out.println(list);
		
		//foreach loop
		
		for(String name : list){
			System.out.println(name);
		}
		
		//using iterator and for loop
		
		for(Iterator<String> iter = list.iterator(); iter.hasNext();){
			String name = iter.next();
			System.out.println(name);
		}
		
		//using while loop and iterator
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
