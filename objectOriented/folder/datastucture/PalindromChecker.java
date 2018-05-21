package datastucture;

public class PalindromChecker {

	public static void main(String[] args) {
		
		System.out.println("Enter the String:");
	//	String string=Utility.inputStringLine().toLowerCase().replaceAll(" ", "");
		String string=Utility.inputStringLine().toLowerCase().replaceAll(" ", "");
		isPalindromeChecker(string);
	}

	
	 public static void isPalindromeChecker(String string) {
	        Dequeue d= new Dequeue();
	        boolean status=false;
	        char[] array=string.toCharArray();
	        char first;
	        char last;
	        for(int i=0;i<array.length;i++)
	        {
	            d.addRear(array[i]);
	        }
	        /*int size=d.size();
	        System.out.println(size);*/
	        while(d.size()>1)
	        {
	            first=d.removeFront();
	            last=d.removeRear();
	            System.out.println(first);
	            System.out.println(last);
	            if(first!=last)
	            {
	                status=false;
	                break;
	            }
	            else
	                status=true;
	        }
	        if(status==true)
	        {
	            System.out.println("Is a palindrome");
	        }
	        else
	            System.out.println("Not a palindrome");
	    }
	
	
}
