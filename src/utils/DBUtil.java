package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    public static final String persistenceUnitName ="tasklist";
    private static EntityManagerFactory emf;
    public static EntityManager createEntityManager(){
        return getEntityManagerFactory().createEntityManager();
    }
    private static EntityManagerFactory getEntityManagerFactory(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        }
        return emf;
    }
}
