package day12_JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-18 下午12:49
 */
public class testJDBCUtils {
    public static void main(String[] args) throws Exception {
        Connection connection = JDBCUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from stu");
        while (resultSet.next()) {
            System.out.print(resultSet.getObject(1));
            System.out.print(resultSet.getObject(2));
            System.out.print(resultSet.getObject(3));
            System.out.println();
        }
        JDBCUtils.close(resultSet, statement, connection);
    }
}
