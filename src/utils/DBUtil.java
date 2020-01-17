package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final String PESISTENCE_UNIT_NAME = "daily_report_sysytem";
    private static EntityManagerFactory emf;

    public static EntityManager createEntitymanager() {
        return _getEntityManagerFactory().createEntityManager();
    }

    public static EntityManagerFactory _getEntityManagerFactory() {
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PESISTENCE_UNIT_NAME);
        }
        return emf;
    }
}
