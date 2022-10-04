package task_rev;
public class a8 {  //palindrome number
	public static void main(String[] args) {
		int number = 121;
		int temp_number = number;
		int reverse = 0;
		int reminder ;
		
			while(temp_number != 0) {
			reminder = temp_number % 10;
			reverse = reverse*10 + reminder ;
			temp_number = temp_number / 10 ;
		}
			if(number == reverse) {
				System.out.println(number + "  is palindrome");
			}
			else {
				System.out.println(number + "  is not palindrome");
				}
		}}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//for first time --> temp_number =121 ,reminder=1,reverse=0+1=1,and temp_number will become 12
//for second time --> temp_number =12 ,reminder=2,reverse=10+2=12,and temp_number will become 1
//for third time --> temp_number =1 ,reminder=1,reverse=120+1=121,and temp_number will become 0
//for fourth time--> while loop fails as temp_number=0, now if and else block will execute

