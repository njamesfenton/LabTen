import java.util.*;

public class movieApp {
	public static void main(String[] args) {
	ArrayList<Movies> myList = new ArrayList<>();
	String[] titles = {"Star Wars 1","Star Wars 2","E.T.","Saving Private Ryan","Miracle","Anchorman","The Hangover"};
	String[] catagory = {"scifi","scifi","scifi","drama","drama","comedy","comedy"};
	Scanner sc = new Scanner(System.in);
	System.out.println("Please pick a genre to see movie titles.(SciFi, Comedy, Drama)");
	String input = sc.nextLine();
	
	for (int i = 0; i < catagory.length; i++) {
		myList.add(new Movies(titles[i],catagory[i]));
	}
	
	
	
	
	for (int i = 0; i < myList.size(); i++) {
		if (myList.get(i).getCatagory().equalsIgnoreCase(input))
			System.out.println(myList.get(i).getTitle());
				
	}
      
	}

}
