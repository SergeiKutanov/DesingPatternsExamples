package factory_pattern.gof_factory.connections;

import factory_pattern.connection.Connection;

/**
 * Created by sergei on 17.03.15.
 */
public class SecureMySQLConnection extends Connection {

    @Override
    public String description() {
        return "Secure MySQL connection";
    }
}
