package connector_mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class InsertTable {
    public static void main(String[] args) throws Exception {
        // ���ݿ������Ϣ
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/java_test";
        String user = "root";
        String pwd = "123456";

        // ��������
        Class.forName(driver);

        // �������ݿ�
        Connection con = DriverManager.getConnection(url, user, url);
        if (!con.isClosed())
            System.out.println("connect mysql successfully");



    }
}
