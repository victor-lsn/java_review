package day12_JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-18 上午10:57
 */
public class demo01 {
    public static void main(String[] args) throws Exception {
        //Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01", "root", "123456");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from stu");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
