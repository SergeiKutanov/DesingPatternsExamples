package factory_pattern.connection;

/**
 * Created by sergei on 17.03.15.
 */
public class MySQLConnection extends Connection {

    @Override
    public String description() {
        return "MySQL connection";
    }
}
