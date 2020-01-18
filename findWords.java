import java.util.Scanner;
import java.io.*;


public class findWords{
    
    public static boolean checkword(String[] list, String word){
	
        return false;
    }
    
    
    public static void main(String[] args){
       
        String[] wordlist= new String[99171];
        int index=0;
        try{
	    
            Scanner in = new Scanner(new FileReader("words"));
        
            while(in.hasNextLine()){
                wordlist[index]=in.nextLine();
                index++;
                
            }
	
        }catch(IOException e){
            e.printStackTrace();
        }
        
   Scanner scan = new Scanner(System.in);
       int rows = scan.nextInt();
       int columns = scan.nextInt();
       String[][] matrix = new String[rows][columns];
       for(int i = 0;i<rows;i++){
           for(int j = 0;j<columns;j++){
               matrix[i][j]=scan.next();
	  }
	}
        
        
        // checks the sequences of letters
        // to see whether they are words or not
           for(int i=0;i<rows;i++){
           String dat="";
           for(int j=0;j<columns;j++){
               dat+=matrix[i][j];
           }
           for(int z=0;z<dat.length();z++)
              {
                 for(int k=1;k<=dat.length()-z;k++)
                 {
		     for(int q=0; q<99171; q++){
                   String boi = dat.substring(z, z+k);                 
		   if(wordlist[q].equals(boi) && wordlist[q].length()>1){
                       System.out.println(boi+" ");
		    }
		     }
                 }
              }          
       }      
    
    }
    
}
