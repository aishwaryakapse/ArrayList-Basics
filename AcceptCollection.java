import java.util.ArrayList;
import java.util.HashSet;

public class AcceptCollection {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Ram");
		hs.add("Dave");
		hs.add("Peter");
		System.out.println("HashSet: " + hs);

		ArrayList<String> list = new ArrayList<String>(hs);
		System.out.println(list);

	}

}
