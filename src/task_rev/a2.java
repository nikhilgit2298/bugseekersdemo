package task_rev;

public class a2 {// ascii values
	

	public static void main(String[] args) {
		//find ascii value of any character
		char ch='A';
		int i=ch;
		System.out.println(i); 
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//find ascii value list for a to z , A to Z
		
		char capital = 'A';
		char small = 'a';
		for(int j='A';j<='Z';j++) {
			System.out.println(capital + ":"  + j);
			capital++;
		}
		for(int k='a';k<='z';k++) {
			System.out.println(small + ":" + k);
			small++;
		}
	}
}
	
