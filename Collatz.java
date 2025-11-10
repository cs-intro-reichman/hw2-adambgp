// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int lim = Integer.parseInt(args[0]);
        String cha = args[1];
		int seed = 0;
		
	 if(cha.equals("v")){ 	
	    	for(int i=0 ;i< lim;i++){
		
		    	int count = 0;
        
			    seed= seed +1 ;
			    int n = seed;
		
			do{ 
		
				count++;
		
				System.out.print(n + " ");
		           if(n % 2 == 0)
			     	   {
				    	n = n/2;
				       }
				    else 
					    {
					    n = n * 3 + 1;	
					    }

				 }
		
			while (n> 1);
		    count++;
			System.out.print(1 + " ");
		
			System.out.print("(" + count + ")" );
		
			System.out.println();
	    
		} System.out.println("Every one of the " + lim + " hailstone sequences reached 1.");
	} else if (cha.equals("c")){
		System.out.println("Every one of the first " + lim + " hailstone sequences reached 1.");
	}
	
}
}