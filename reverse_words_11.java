public class reverse_words_11 {

	public static void main(String[] args) {
		  String s[] = "Anurag Jain".split(" ");  
		  
	      for(int i=0;i<s.length;i++){
	    	  
	    	  String str=s[i];
	    	  
	    	  for(int j=str.length()-1;j>=0;j--) {
	    		  System.out.print(str.charAt(j));
	    	  }
	    	  System.out.print(" ");
	      } 
	}
}


//String ans = "";
//for (int i = s.length - 1; i >= 0; i--)
//ans += s[i] + " "; 
//System.out.println("Reversed String: " + ans); 