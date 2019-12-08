package behavioral.dependencyInjection.ex3;

import com.google.common.collect.Lists;

import java.util.List;

//@Singleton
public class MySqlDatabase implements Database {

    @Override
    public List<String> getUsernames() {
        return Lists.newArrayList("sql1", "sql2", "sql3");
    }
}