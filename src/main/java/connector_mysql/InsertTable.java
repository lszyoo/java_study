package connector_mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class InsertTable {
    public static void main(String[] args) throws Exception {
        // 数据库基本信息
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/java_test";
        String user = "root";
        String pwd = "123456";

        // 加载驱动
        Class.forName(driver);

        // 连接数据库
        Connection con = DriverManager.getConnection(url, user, url);
        if (!con.isClosed())
            System.out.println("connect mysql successfully");



    }
}
