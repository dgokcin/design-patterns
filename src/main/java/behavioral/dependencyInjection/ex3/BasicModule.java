package behavioral.dependencyInjection.ex3;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

// configure which database should be used!
class BasicModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Database.class).annotatedWith(Names.named("DefaultDatabase"))
                .to(MySqlDatabase.class).in(Scopes.SINGLETON);
        bind(View.class).to(WebView.class);
    }
}
