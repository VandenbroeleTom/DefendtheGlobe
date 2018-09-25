package data;

/**
 * Created by vande on 2/12/2017.
 */
public class Repositories {

    private static BreakoutRepository mysqlBreakoutRepository = new BreakoutRepositoryMySql();

    public static BreakoutRepository getMysqlBreakoutRepository() {
        return mysqlBreakoutRepository;
    }
}
