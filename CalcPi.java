// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   int times = Integer.parseInt(args[0]);
	   double sum = 0;
	   double t = 1;
	   for(int i=1 ; i <= times; i++){
         if(i%2 == 0){ 
		sum = sum - 1/t;
		 }else{
		sum = sum + 1/t;
		 } t= t+2;
	   }
	    System.out.println("pi according to Java: " + Math.PI);
	    System.out.println("pai, approximated:    " + sum*4);
	}
} 
