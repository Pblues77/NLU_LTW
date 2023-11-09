
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import java.util.Properties;

//B1:
public class HibernateUtils {
    private static final SessionFactory FACTORY;

    // Nhằm tạo SessionFACTORY 1 lần duy nhất khi chạy
    static {
        org.hibernate.cfg.Configuration conf = new org.hibernate.cfg.Configuration();
        //Cấu hình bằng xml file
        conf.configure("hibernate.cfg.xml");
        // Cấu hình bằng java.util.Properties
//		Properties props = new Properties();
//		props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
//		props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//		props.put(Environment.URL, "jdbc:mysql://localhost/mydatabase");
//		props.put(Environment.USER, "root");
//		props.put(Environment.PASS, "");
//		props.put(Environment.SHOW_SQL, "true");
//		conf.setProperties(props);

        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

        FACTORY = conf.buildSessionFactory(registry);
        System.out.println("Ket noi thanh cong!");
    }

    public static SessionFactory getFactory() {
        return FACTORY;
    }
}
