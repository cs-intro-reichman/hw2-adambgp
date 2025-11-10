//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

	    String input = args[0];
            
            int lines = Integer.parseInt(args[1]);

            int length = input.length();

            String an = "AEFHILMNORSXaefhilmnorsx";

            int check= 0;

            for(int i= 0; i< length  ;i++) 

            { char c = input.charAt(i);

               if(an.indexOf(c)==-1){

                System.out.println( "Give me a  " + c + ": " + c + "!");

               }else{System.out.println( "Give me an " + c + ": " + c + "!"); }
            } 
            System.out.println("What does that spell?");
        
            for(int d=0; d< lines; d++){
                System.out.println(input + "!!!");
            }
            }

        }

