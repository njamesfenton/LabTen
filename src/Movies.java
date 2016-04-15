
public class Movies {
private String Title;
private String Catagory;
public Movies(String title, String catagory) {
	Title = title;
	Catagory = catagory;
}
//movies class with a constructor to pass tile and category strings through
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getCatagory() {
	return Catagory;
}
public void setCatagory(String catagory) {
	Catagory = catagory;
}

//setters and getters to retrieve names and titles but could also be used to update and add both

}
