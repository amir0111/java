/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;

/**
 *
 * @author amirs
 */
public class ScrabblepointController {
    

   
     @FXML
   private Button submit;
    @FXML
    private TextField display;
    @FXML
    private Label errormsg1;

    @FXML
    private Label errormsg2;
    @FXML
    private Label score;
    
  
   
    
    
    
   public void onclick(ActionEvent event) {
       
       String textValue=display.getText();
       String textValue2=display.getText();
      
       
       errormsg1.setText("");
       
       
     
       
     ScrabbleModel scrabblemodel= new ScrabbleModel(textValue);
     ScrabblemodelCalculation scrabllemodelcal= new ScrabblemodelCalculation(textValue2);
     
     

       
       
   
       
       

         try{
            scrabblemodel.validatewords();
             scrabllemodelcal.calculation();
               int points=scrabllemodelcal.point;
              score.setText(String.valueOf(points));
               scrabblemodel.insertRow();
               
                 
        
            
                
          
        }
        catch (IllegalArgumentException e){
           errormsg1.setText(e.getMessage());
        }

        System.out.println(scrabblemodel);
     System.out.println(scrabllemodelcal);
   
     

    
 
   }
   }
        
       
        
      
        
        
    



    

    
    
    

