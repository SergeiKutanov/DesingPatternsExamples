package factory_pattern;

import factory_pattern.connection.Connection;
import factory_pattern.connection.ConnectionFactory;
import factory_pattern.gof_factory.factories.GofConnectionFactory;
import factory_pattern.gof_factory.factories.SecureConnectionFactory;
import factory_pattern.gof_factory.factories.SimpleConnectionFactory;

/**
 * Created by sergei on 17.03.15.
 */
public class app {

    public static void main(String[] args)
    {
        //first kind of implementation
        ConnectionFactory connectionFactory = new ConnectionFactory();

        Connection mysqlConnection = connectionFactory.createConnection("mysql");
        Connection mongodbConnection = connectionFactory.createConnection("mongodb");

        System.out.println("---===Testing first type of factory===---");
        System.out.println(mysqlConnection.description());
        System.out.println(mongodbConnection.description());

        //GoF kind of implementation
        GofConnectionFactory simpleConnectionFactory = new SimpleConnectionFactory();

        Connection simpleMySQLconnection = simpleConnectionFactory.createConnection("mysql");
        Connection simpleMongoDBconnection = simpleConnectionFactory.createConnection("mongodb");

        GofConnectionFactory secureConnectionFactory = new SecureConnectionFactory();

        Connection secureMySQLconnection = secureConnectionFactory.createConnection("mysql");
        Connection secureMongoDBconnection = secureConnectionFactory.createConnection("mongodb");

        System.out.println("---===Testing GoF type of factory===---");

        System.out.println(simpleMySQLconnection.description());
        System.out.println(simpleMongoDBconnection.description());

        System.out.println(secureMySQLconnection.description());
        System.out.println(secureMongoDBconnection.description());

    }

}
