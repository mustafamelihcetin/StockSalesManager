package tr.com.melihcetin.core;

import tr.com.melihcetin.interfaces.CoreInterfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ObjectHelper extends CoreFields implements CoreInterfaces {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(getUrl(),getUserName(),getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
