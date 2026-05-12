package py.edu.facitec.odonto.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ConnectionHelper {
	private static SessionFactory sessionFactory;
	//para crear un get de sessionFactory
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	//es un singlenton
	static {
		setup();
	}

	private static void setup() {
		final StandardServiceRegistry serviceRegistry = 
				new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(serviceRegistry)
					.buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(serviceRegistry);
		}
	}
}
