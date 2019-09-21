
import java.sql.Connection;
import java.util.Scanner;
import static javafx.beans.binding.Bindings.length;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amirs
 */
public class ScrabblemodelCalculation  {

public int point;
        public String word ;
	public   String WORD;
        boolean valid = false;
        int length;
	char wordArray[];
          
          
          public ScrabblemodelCalculation(int point){
           this.point=point;
          }

    public ScrabblemodelCalculation(String word) {
        this.word=word;
        this.WORD=word;
       
    }
     
  

   
    
    
    public void calculation(){
    {
     
      do
      {
    	
	        
      		length = word.length();
      		int alpha = 0;


			
			if (alpha == 0)
				valid = true;

      }while(!valid);
      
      for ( int at = 0; at < length; at++ ) 
         {
            WORD = word.toUpperCase();  
         } // end UpperCase
      	  
      //Convert String to charArray
      wordArray = WORD.toCharArray();


      //For each element of array, calculate the point and add to total point
      for ( int j = 0; j < length; j++ ) 
         {
     		switch( wordArray[ j ])
     		{
     			case 'Q':
     			case 'Z':
					point += 10;
					break;
					
     			case 'J':
					point += 8;
					break;

     			case 'K':
     			case 'X':
					point += 5;
					break;

     			case 'F':
     			case 'H':
     			case 'V':
     			case 'W':
     			case 'Y':
					point += 4;
					break;
					
     			case 'B':
     			case 'C':
     			case 'M':
     			case 'P':
					point += 3;
					break;

     			case 'D':
     			case 'G':
					point += 2;
					break;
					
                        		default:
					point += 1;
					
     		}//end switch-case structure

       	 }//end point calculation loop

       //output
     
    }}
    
    
    

    @Override
    public String toString() {
        return "ScrabblemodelCalculation{" + "point=" + point + ", word=" + word + ", WORD=" + WORD + '}';
    }
           
}
  
    
    
    

