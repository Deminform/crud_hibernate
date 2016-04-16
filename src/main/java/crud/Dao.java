package crud;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Dao {

    private static  SessionFactory session = null;

    static {
        Configuration cfg = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties());

        session = cfg.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSession() {
        return session;
    }
}
