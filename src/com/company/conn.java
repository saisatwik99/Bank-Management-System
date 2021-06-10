package com.company;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///bank", "root", "Satwik@2002");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
