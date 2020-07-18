package day12_JDBC;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-18 下午5:05
 */
public class demo02_c3p0 {
    public static void main(String[] args) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test01");
        dataSource.setUser("root");
        dataSource.setPassword("123456");

        Connection connection = dataSource.getConnection();
        String sql = "select * from stu";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }

        connection.close();
    }
}
