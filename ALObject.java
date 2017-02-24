import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ALObject {

	public static void main(String[] args) {
		//Get subList from ArrayList
		List<String> mainList = new ArrayList<String>();
		mainList.add("Ram");
		mainList.add("Dave");
		mainList.add("Peter");
		mainList.add("Julia");
		mainList.add("Roberts");
		System.out.println("Main List : "+mainList);
		List<String> subList = mainList.subList(0, 2);
		System.out.println("SubList : "+subList);
		
		//Convert ArrayList Object to Array Object
		String[] strArray = new String[mainList.size()];
		mainList.toArray(strArray);
		int i = 0;
		for(String name : strArray) {
			System.out.println("Element " + i + ": " + name);
			i++;
		}
		
		//Remove object from ArrayList using iterator
		Iterator<String> it = mainList.iterator();
		while(it.hasNext()) {
			mainList.remove(0);
		}
		System.out.println("After removing each element : "+mainList);
		
		//ListIterator
		mainList.add("Ram");
		mainList.add("Dave");
		mainList.add("Peter");
		mainList.add("Julia");
		mainList.add("Roberts");
		ListIterator<String> lit = mainList.listIterator();
		System.out.println("------Forward Direction------");
		while(lit.hasNext()) {
			int nextIndex = lit.nextIndex();
			String name = lit.next();
			System.out.println(nextIndex + " : " + name);
		}
		
		System.out.println("------Reverse Direction------");
		while(lit.hasPrevious()) {
			int prevIndex = lit.previousIndex();
			String name = lit.previous();
			System.out.println(prevIndex + " : " + name);
		}
		
		//ListIterator(int index) Starts from this index
		lit = mainList.listIterator(2);
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		lit = mainList.listIterator(1);
		while(lit.hasNext()) {
			int nextIndex = lit.nextIndex();
			String name = lit.next();
			System.out.println(nextIndex + " : " + name);
		}
		
		//Remove elements from ArrayList using list iterator
		lit = mainList.listIterator();
		while(lit.hasNext()) {
			lit.next();
			lit.remove();
		}
		System.out.println("After removing each element : "+mainList);
		
		//Add or replace element using list iterator
		mainList.add("Ram");
		mainList.add("Dave");
		mainList.add("Peter");
		mainList.add("Julia");
		mainList.add("Roberts");
		lit = mainList.listIterator();
		while(lit.hasNext()) {
			int indexPosition = lit.nextIndex();
			if(indexPosition == 2) {
				lit.add("Virat");
			}
			lit.next();
		}
		System.out.println("Main List after adding element : "+mainList);
		
		lit = mainList.listIterator();
		String repName = "Virat";
		while(lit.hasNext()) {
			String name = lit.next();
			if(name.equalsIgnoreCase(repName)) {
				lit.set("Aishwarya");
			}
		}
		System.out.println("Main List after replacing : " + mainList);
	}
}
