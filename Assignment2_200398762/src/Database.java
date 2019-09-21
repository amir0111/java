
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amirs
 */
public  abstract class  Database {
    
    
    
    private String connectionString
            = "jdbc:mysql://localhost:3306/word";
    private String sqlUserName = "root";
    private String sqlPassword = "";
    private Connection connection;

    public Database(){
          try{
            connection = DriverManager.getConnection(

                    connectionString,
                    sqlUserName,
                    sqlPassword
            );
            System.out.println("Successfully Connected");
        }
        catch (java.sql.SQLException e){

            System.out.println(e);
        }

    }

    public Connection getConnection(){
        return connection;
    }
    public abstract int insertRow();
       

}
 

