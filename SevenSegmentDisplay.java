import java.util.Scanner;
public class SevenSegmentDisplay{   

 public static void segmentDisplay(int number){
               
                String[][] segment = {{"_", "| |", "|_|"},
               
                                {" ", " | ", " | "},
                               
                               
                                {"_", "_ | ",  "| _"},
                               
                               
                                {" _ ", " _ | ", " _ | " },
                               
                               
                                {"|  |", " _ ", " | "},
                               
                               
                                {" _ ", " | _ ",  "_ | "},
                               
                               
                                //{" _ ", " | _ ", " _ | " },
                               
                               
                                {" _ ",  " | _ ", "  | _ | "},
                               
                               
                                {" ", " _ ", " | ", " | " },
                               
                               
                                {" _ ", " | _ | ", " | _ | "},
                               
                               
                                {" _ ", " | _ | ", " _ | "}
               
               
                 };

                if(number > 0 && number <= 9){
         
             
                String[] segmentValue =  segment[number];
               
                for(String value : segmentValue){
               
               
                System.out.println(value);
               
               
               
                }
               
                }
                else{
                System.out.println("nummber must be between 0 - 9 ");
                }
             
               
                }
               
               
               
               
               
                public static void main( String[] args){
               
                Scanner scan = new Scanner(System.in);
               
                System.out.print("Enter a number: ");
                int userInput = scan.nextInt();
       
       
                segmentDisplay(userInput);
               
                }
               
               
}        
               
               
               