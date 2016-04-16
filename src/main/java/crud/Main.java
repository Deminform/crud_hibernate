package crud;

import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Dao.getSession();
        System.out.println(sessionFactory.isClosed());
        sessionFactory.close();
        System.out.println(sessionFactory.isClosed());
    }
}
