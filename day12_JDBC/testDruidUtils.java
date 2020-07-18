package day12_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-18 下午5:45
 */
public class testDruidUtils {
    public static void main(String[] args) throws Exception {
        Connection connection = DruidUtils.getConnection();
        String sql = "select * from stu";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }

        DruidUtils.close(resultSet, preparedStatement, connection);
    }
}
