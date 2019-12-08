package behavioral.dependencyInjection.ex3;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule());
        App app = injector.getInstance(App.class); // at this moment the all requested objects was injected into app
        System.out.println(app.getUsernames());
        System.out.println(app.getView().getViewName());
    }
}
