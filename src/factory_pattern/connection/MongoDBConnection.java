package factory_pattern.connection;

/**
 * Created by sergei on 17.03.15.
 */
public class MongoDBConnection extends Connection {

    @Override
    public String description() {
        return "MongoDB connection";
    }
}
