package task;

public class ascii {
	char c;

	public static void main(String[] args) {
  	// find out ascii value of special character	
		char ch = 'A';
		int i = ch; 
		System.out.println(i);
		
//  find out ascii value of character A to Z

		char capitalchar = 'A';
		char smallchar='a';
//char smallchar='a';
	
for (int j='A';j<='Z';j++) {
System.out.println(capitalchar+ ":" +     j);
capitalchar++;  
}

//find out ascii value of character a to z

		for(int k='a';k<='z';k++) {
			System.out.println(smallchar + ":" + k);
			smallchar++;
			}}}
		











