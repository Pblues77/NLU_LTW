import org.hibernate.Session;

public class HibernateTester {
    public static void main(String[] args) {
        Session session = HibernateUtils.getFactory().openSession();
        //
        session.close();
    }
}
