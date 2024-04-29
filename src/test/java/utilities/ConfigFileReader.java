package utilities;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class ConfigFileReader {
    private static final Properties properties;

    static {
        properties = new Properties();
        String propertyFilePath = "src/test/resources/config.properties";
        try (InputStream input = Files.newInputStream(Path.of(propertyFilePath))) {
            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Error al cargar archivo properties " + propertyFilePath, e);
        }
    }

    /**
     * Método que devuelve el valor correspondiente a una clave específica del
     * archivo de configuración.
     * 
     * @param keyName La clave para la cual se desea obtener el valor.
     * @return El valor correspondiente a la clave especificada.
     */
    public static String getpro(String keyName) {
        return properties.getProperty(keyName);
    }

}
