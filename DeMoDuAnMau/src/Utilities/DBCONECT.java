/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vuong
 */
public class DBCONECT {
    private static Connection conn;

    public static Connection getConnection() {
        if (DBCONECT.conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "123456",
                        dbUrl = "jdbc:sqlserver://localhost:1433;"
                        + "databaseName=FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041"
                        + ";encrypt=true;trustServerCertificate=true;";

                conn = DriverManager
                        .getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return DBCONECT.conn;
    }
}
