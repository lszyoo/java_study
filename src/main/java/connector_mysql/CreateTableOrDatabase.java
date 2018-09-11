package connector_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableOrDatabase {
    public static void main(String[] args) {
        // 定义数据库基本信息
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pwd = "123456";

        // 加载驱动
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // 数据库连接
            Connection connection = DriverManager.getConnection(url, user, pwd);

            // 测试是否连接数据库成功
            if (!connection.isClosed())
                System.out.println("connect mysql successfully");

            // 执行 sql 语句的类
            Statement statement = connection.createStatement();
            statement.executeLargeUpdate("CREATE DATABASE IF NOT EXISTS java_test");
            // 将给定的 SQL 命令添加到此 Statement 对象的当前命令列表中。
            statement.addBatch("USE java_test");
            statement.addBatch("CREATE TABLE IF NOT EXISTS student(name VARCHAR(20), sex VARCHAR(10), class VARCHAR(20))");
            // 将一批命令提交给数据库来执行，如果全部命令执行成功，则返回更新计数组成的数组。
            statement.executeBatch();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
