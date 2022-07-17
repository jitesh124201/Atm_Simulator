package bank.management.system;

import java.sql.*;


public class Cons {

    Connection c;
    Statement s;
    public Cons(){
        try{
            
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","jitesh63");
            s=c.createStatement();
        
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
