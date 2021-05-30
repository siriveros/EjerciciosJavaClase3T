package com.itb.wave8.demo.factories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ComparatorFactory {

    private static Object selectedComparator;
    private static final String COMPARATOR_PROPERTIES_NAME = "comparator.properties";
    private static final String COMPARATOR_PROPERTY_NAME = "comparator";

    public static Object getInstance() throws Exception {
        if (selectedComparator == null) {
            Properties properties = new Properties();
            try {
                properties.load(new FileInputStream(new File(COMPARATOR_PROPERTIES_NAME)));
                String comparatorProperty = properties.getProperty(COMPARATOR_PROPERTY_NAME);
                if (comparatorProperty == null) {
                    throw new Exception("Error la propiedad \"" + COMPARATOR_PROPERTY_NAME + "\" no existe");
                }
                selectedComparator = Class.forName(comparatorProperty).getDeclaredConstructor().newInstance();
            } catch (FileNotFoundException e) {
                throw new Exception("No se ha encontrado el archivo " + COMPARATOR_PROPERTIES_NAME, e);
            } catch (IOException e) {
                throw new Exception("Ha ocurrido un error al leer el archivo: ", e);
            } catch (ClassNotFoundException e) {
                throw new Exception("Error el comparator especificado no existe: ", e);
            }
        }
        return selectedComparator;
    }
}
