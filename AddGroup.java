import java.util.ArrayList;
import java.util.HashSet;

public class AddGroup {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		arr1.add("Ram");
		arr1.add("Dave");
		arr1.add("Peter");
		arr2.add("Julia");
		arr2.add("Roberts");
		System.out.println("Main : " + arr1);
		System.out.println("Second : " + arr2);
		arr1.addAll(arr2);
		System.out.println("After adding second to main : " + arr1);

		// add objects based on index

		arr1.add(2, "Aishwarya");
		System.out.println("After adding element at index 2 : " + arr1);
		HashSet<String> hs = new HashSet<String>();
		hs.add("shalaka");
		hs.add("kapse");
		arr1.addAll(1, hs);
		System.out.println("After adding hashset to arraylist at index 1 : " + arr1);

		// Remove objects from list

		arr1.remove(1);
		System.out.println("After removing element at index 1 : " + arr1);
		arr1.remove("Julia");
		System.out.println("After removing Julia : " + arr1);

		// Retain objects in Array List
		
		ArrayList<String> retainList = new ArrayList<String>();
		retainList.add("Ram");
		retainList.add("kapse");
		retainList.add("Aishwarya");
		
		arr1.retainAll(retainList);
		System.out.println("Retained : " + arr1);
		
		//Replace Objects
		arr1.set(2, "Rohit Sharma");
		System.out.println("Replaced List to : " + arr1);
		
		//Check object exists or not
		boolean isExists = arr1.contains("Rohit Sharma");
		System.out.println("Contains Rohit Sharma? : " + isExists);
		isExists = arr1.contains("Idiots");
		System.out.println("Contains Idiots? : " + isExists);
		ArrayList<String> containList = new ArrayList<String>();
		containList.add("Ram");
		containList.add("Rohit Sharma");
		isExists = arr1.containsAll(containList);
		System.out.println("Contains List : " + isExists);
		
		//Get Objects from ArrayList using index
		String name = arr1.get(1);
		System.out.println(name);
		
		//check object index position
		int index = arr1.indexOf(name);
		System.out.println(index);
		
		arr1.add(name);
		index = arr1.indexOf(name);
		System.out.println("Gives First Occurrence : " +index);
		
		//Clear, Empty, Size
		int size;
		boolean isEmpty;
		size = arr1.size();
		System.out.println("Size of ArrayList : " + size);
		isEmpty = arr1.isEmpty();
		System.out.println("The Array List is Empty? : "+ isEmpty);
		arr1.clear();
		System.out.println("Array List Cleared!!!");
		isEmpty = arr1.isEmpty();
		System.out.println("The Array List is Empty? : "+ isEmpty);
		}
}
