package basic.atm;

import java.sql.*;


public class Database {
    private static final String dbClassName = "";

    private static final String CONNECTION = "";

    private static final String USER = "user";

    private static final String PASSWORD = "password";

    public static java.sql.Connection connection() throws Exception {
        Class.forName(dbClassName);

        return DriverManager.getConnection(CONNECTION, USER, PASSWORD);
    }
}