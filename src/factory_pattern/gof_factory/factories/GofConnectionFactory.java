package factory_pattern.gof_factory.factories;

import factory_pattern.connection.Connection;

/**
 * Created by sergei on 17.03.15.
 */
public abstract class GofConnectionFactory {

    public abstract Connection createConnection(String type);

}
