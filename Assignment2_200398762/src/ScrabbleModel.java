
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amirs
 */
public class ScrabbleModel extends Database {
    
  
    
private String rawwords;

    /**
     *
     * @param rawwords
     */
  

    public ScrabbleModel(String rawwords) {
       
        this.rawwords = rawwords;
    }
    
    
    
    public void validatewords() 
        throws IllegalArgumentException{
        
         if (rawwords.length() == 0)
            throw new IllegalArgumentException
                (String.format("word is blank! "));
        
        
        
        else  if (rawwords.length()<=1 )
            throw new IllegalArgumentException(
                    String.format(" '%s' word is invalid and " + "has length of %d which is too small! ", rawwords, rawwords.length()));
        
        
        else if (rawwords.length()>=8)
            throw new IllegalArgumentException
                (String.format(" '%s' word  is invalid and  " +" has length of %d which is too long!", rawwords, rawwords.length()));
        
         
        else if (!rawwords.matches(".*[AEIOUaeiou].*")) {
          throw new IllegalArgumentException(
                    String.format(" '%s' word is invalid and doesnot contain vowel!", rawwords));
          }
        else 
            this.rawwords=rawwords;
         
     }

    @Override
    public String toString() {
        return "ScrabbleModel{" + "rawwords=" + rawwords + '}';
    }

    @Override
    public int insertRow() {
  int numRowsAffected = 0;

        Connection connection = getConnection();

        try{

            String sql = "INSERT INTO `words` (`scrabblewords`)" +
                    "VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, rawwords);
          
            numRowsAffected = preparedStatement.executeUpdate();

        }
        catch (java.sql.SQLException e){

            System.err.println(e);
        }

        return numRowsAffected;
     

    }

    
        

    
    }

              
      



   




   
    
