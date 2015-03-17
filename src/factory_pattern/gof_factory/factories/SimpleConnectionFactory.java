package factory_pattern.gof_factory.factories;

import factory_pattern.connection.Connection;
import factory_pattern.connection.MongoDBConnection;
import factory_pattern.connection.MySQLConnection;
import factory_pattern.connection.PostgreConnection;

/**
 * Created by sergei on 17.03.15.
 */
public class SimpleConnectionFactory extends GofConnectionFactory {

    @Override
    public Connection createConnection(String type) {

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
