package project;

public class StringOperation {
	
	
	public String concat(String firstname, String lastname){
		
		String name = firstname + lastname;
		return name;

	}
	public int length(String firstname, String lastname) {
		int size = firstname.length() + lastname.length();
		return size;
	}
	public String contains(String firstname, String lastname) {
		return firstname.concat("a");
	}
	
	
public static void main(String[] args) {
	StringOperation so = new StringOperation();
	so.concat("katie", "toromanova");
	so.length("katie", "toromanova");
	so.contains("katie", "toromanova");
}
}
