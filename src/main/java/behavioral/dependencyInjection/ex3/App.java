package behavioral.dependencyInjection.ex3;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.List;

public class App {

    private final Database database;
    private final View view;

    @Inject // constructor injection
    public App(@Named("DefaultDatabase") Database database, View view) {
        this.database = database;
        this.view = view;
    }

    public Database getDatabase() {
        return database;
    }

    public List<String> getUsernames() {
        return database.getUsernames();
    }

    public View getView() {
        return view;
    }
}