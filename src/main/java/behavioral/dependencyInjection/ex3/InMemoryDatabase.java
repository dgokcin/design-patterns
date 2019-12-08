package behavioral.dependencyInjection.ex3;

import com.google.common.collect.Lists;

import java.util.List;

//@Singleton
public class InMemoryDatabase implements Database {

    @Override
    public List<String> getUsernames() {
        return Lists.newArrayList("in_mem1", "in_mem2", "in_mem3");
    }
}
