package connector_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableOrDatabase {
    public static void main(String[] args) {
        // �������ݿ������Ϣ
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pwd = "123456";

        // ��������
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // ���ݿ�����
            Connection connection = DriverManager.getConnection(url, user, pwd);

            // �����Ƿ��������ݿ�ɹ�
            if (!connection.isClosed())
                System.out.println("connect mysql successfully");

            // ִ�� sql ������
            Statement statement = connection.createStatement();
            statement.executeLargeUpdate("CREATE DATABASE IF NOT EXISTS java_test");
            // �������� SQL ������ӵ��� Statement ����ĵ�ǰ�����б��С�
            statement.addBatch("USE java_test");
            statement.addBatch("CREATE TABLE IF NOT EXISTS student(name VARCHAR(20), sex VARCHAR(10), class VARCHAR(20))");
            // ��һ�������ύ�����ݿ���ִ�У����ȫ������ִ�гɹ����򷵻ظ��¼�����ɵ����顣
            statement.executeBatch();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
