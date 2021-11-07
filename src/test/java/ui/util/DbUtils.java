//package ui.util;
//
//import ui.helper.CommonHelper;
//
//import java.sql.*;
//
//public class DbUtils {
//    public static Connection createConnection() {
//        Connection connection = null;
//        String username = CommonHelper.getEnvironmentProperty("db.username");
//        String password = CommonHelper.getEnvironmentProperty("db.password");
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            connection = DriverManager.getConnection("db.uel", username, password);
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return connection;
//    }
//
//    public static void closeConnection(Connection connection) {
//        try {
//            if (connection != null) {
//                connection.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static String executeSelect(String select) {
//        Connection connection = null;
//        String colValue = "";
//        try {
//            connection = createConnection();
//            Statement statement = connection.createStatement();
//            //Execute the select statement
//            ResultSet resultSet = statement.executeQuery(select);
//            if (resultSet.next()) {
//                //Get column value by column name:
//                colValue = resultSet.getString(1);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeConnection(connection);
//        }
//        return colValue;
//    }
//}
