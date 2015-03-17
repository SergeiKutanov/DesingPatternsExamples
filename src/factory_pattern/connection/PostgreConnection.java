package factory_pattern.connection;

/**
 * Created by sergei on 17.03.15.
 */
public class PostgreConnection extends Connection {

    @Override
    public String description() {
        return "Postgre connection";
    }
}
