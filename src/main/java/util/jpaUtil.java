package util;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class jpaUtil implements Serializable {
    private static final EntityManagerFactory factory;
    static {
        factory = Persistence.createEntityManagerFactory("UenpQuadras");
    }
    
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
    public static void close() {
        factory.close();
    }
    
    
    
}