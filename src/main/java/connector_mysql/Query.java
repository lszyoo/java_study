package connector_mysql;

import java.sql.*;
import java.util.Random;

public class Query {
    /**
     * 首先准备两张表：
     *      student（class varchar(20), name varchar(20), sex varchar(10)）
     *      people (id int, name varchar(), age int)
     *  现将 student 表中 name 列插入 people 中，id 和 age 为固定几个轮询插入
     */

    public static void main(String[] args) throws Exception {
        // 定义数据库基本信息
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/java_test";       // 若连接远程库只需将 localhost 换成 远程主机ip
        String user = "root";
        String pwd = "123456";

        // 加载驱动
        Class.forName(driver);
        // 数据库连接，相当于 mysql -h url -uuser -ppwd
        Connection conn = DriverManager.getConnection(url, user, pwd);
        // 测试连接是否成功
        if (!conn.isClosed())
            System.out.println("connect mysql successfully");

        Statement state = conn.createStatement();

        // 查询 student 表中 name 列
        String sql = "SELECT * FROM student";
        ResultSet rs = state.executeQuery(sql);

        int[] arr = new int[]{18, 16, 19, 21};

        String selectName = null;
        String insertData = null;
        int i = 0;
        while (rs.next()) {
            selectName = rs.getString("name");
            insertData = String.format("insert into people values(%s, '%s', %s)", i, selectName, arr[i]);
            conn.prepareStatement(insertData).execute();
            i++;
            if (i >= arr.length)
                i = 0;
        }
        rs.close();
        conn.close();

//        String createTable = "create table people(id int, name varchar(20), age int)";
//        state.executeLargeUpdate(createTable);

//        String[] arr = new String[]{"benchi", "kk", "mashaladi", "falali"};


//        for (int i = 0; i <= 10 ; i++) {
//            int n = new Random().nextInt(arr.length - 1);
//            String insertData = String.format("insert into people values(%s, '%s', 18)", i, arr[n]);
//            System.out.println(insertData);
//            conn.prepareStatement(insertData).execute();
//        }
    }
}