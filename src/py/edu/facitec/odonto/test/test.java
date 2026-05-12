package py.edu.facitec.odonto.test;

import java.net.ConnectException;

import py.edu.facitec.odonto.util.ConnectionHelper;

public class test {

	public static void main(String[] args) {
		System.out.println("Conectando...");
        var sf = ConnectionHelper.getSessionFactory();
        if (sf != null) {
            System.out.println("✅ Conexión OK - tablas generadas");
            sf.close();
        } else {
            System.out.println("❌ Error: sessionFactory es null");
        }
    }

}
