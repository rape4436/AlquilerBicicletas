package com.rances.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


/**
 * Clase que accede a archivos de propiedades.
 * Para cargar, configuracion de rutas de: archivos, reportes, base de datos.
 * 
 */
public class PropertiesLoader {

    private static String aplicacionHome = null;
    private static PropertiesLoader m_propertiesLoader = null;

    private final Properties m_properties_file = new Properties();

    private PropertiesLoader() {}

    public static PropertiesLoader getInstance() throws Exception {

	    if (m_propertiesLoader == null) {
		m_propertiesLoader = new PropertiesLoader();
		m_propertiesLoader.initialize();
	    }
	    return m_propertiesLoader;
    }

    private void initialize() throws Exception {

    	aplicacionHome = System.getProperty("aplicacion.home");

	    File dir = new File(aplicacionHome);

	    if (!dir.exists()) {
	    	throw new NullPointerException();
	    }

	    // Property - directorios
	    InputStream inputStreamDir = new FileInputStream("C:/Confspring/conf/.....................");
	    m_properties_file.load(inputStreamDir);
	    
	    inputStreamDir.close();
    }


    public static String getAplicacionHome() {
    	return aplicacionHome;
    }

    public String getPropertyFile(String key) {
    	return m_properties_file.getProperty(key);
    }

    public String getPropertyPropertyFileAplicacion(String key) {
    	return aplicacionHome + m_properties_file.getProperty(key);
    }
}
