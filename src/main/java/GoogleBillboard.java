

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		
	for(int i = 0; i < e.length()-12; i++){
      String digits = e.substring(i+2, i+12);
      double dNum = Double.parseDouble(digits);
      if(isPrime(dNum)){
        System.out.println(dNum);
       break; 
      }
   }
	}
	

	//Finish this function
	//Note that you can only call isPrime() in your main() method if you make isPrime() static since main() is also a static method.
		
	public static boolean isPrime(double dNum){
		 if(dNum < 2)
    		return false;
   	 for(int i = 2; i <= Math.sqrt(dNum);i++)
      	 if(dNum%i == 0)
     	  return false;
    return true;  
	}

}

