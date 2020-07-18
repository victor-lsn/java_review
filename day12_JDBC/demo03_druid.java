package day12_JDBC;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author Victor
 * @version 1.0
 * @date 20-7-18 下午5:24
 */
public class demo03_druid {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(demo03_druid.class.getClassLoader().getResourceAsStream("druid.properties"));


        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

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
