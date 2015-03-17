package factory_pattern.connection;

/**
 * Created by sergei on 17.03.15.
 */
public class ConnectionFactory {

    public Connection createConnection(String type)
    {
        if (type.equals("mysql")) {
            return new MySQLConnection();
        }

        if (type.equals("mongodb")) {
            return new MongoDBConnection();
        }

        if (type.equals("postgre")) {
            return new PostgreConnection();
        }

        throw new IllegalArgumentException("Connection of type: " + type + " doesn't exist");
    }

}
