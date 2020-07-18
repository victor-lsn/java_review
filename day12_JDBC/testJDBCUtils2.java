package day12_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-18 下午12:49
 */
public class testJDBCUtils2 {
    public static void main(String[] args) throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "select * from stu where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 1);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
        }


        JDBCUtils.close(resultSet, preparedStatement, connection);
    }
}
