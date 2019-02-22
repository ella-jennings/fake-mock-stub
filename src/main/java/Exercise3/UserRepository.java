package Exercise3;

public class UserRepository implements IRepository {
    public String[] getUserDetails() {
        // this would normally have more functionality, like fetching data from a database
        // e.g. a SELECT statement in SQL
        // however we are not testing this part so we don't really care
        // we want to fake information coming back!
        // In order for the project to build, this returns an empty string array
        return new String[0];
    }
}
