
public class Datatypes {
	// Debug
	/* F5 - line by line
	   F8 - normally
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Learning Datatypes");
		
		int i=100;
		i=200;
		System.out.println(i);
		
		String str = "Hello there";
		System.out.println(str);
		
		String str1 = "This is a string";  
		int spaceIdx = str1.indexOf(" ");

		String str2=str1.substring(0,spaceIdx);
		System.out.println(str2);
	}

}
