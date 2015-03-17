package factory_pattern.gof_factory.factories;

import factory_pattern.connection.Connection;
import factory_pattern.gof_factory.connections.SecureMongoDBConnection;
import factory_pattern.gof_factory.connections.SecureMySQLConnection;

/**
 * Created by sergei on 17.03.15.
 */
public class SecureConnectionFactory extends GofConnectionFactory {

    @Override
    public Connection createConnection(String type) {

        if (type.equals("mysql")) {
            return new SecureMySQLConnection();
        }

        if (type.equals("mongodb")) {
            return new SecureMongoDBConnection();
        }

        throw new IllegalArgumentException("Connection of type: " + type + " doesn't exist");

    }

}
