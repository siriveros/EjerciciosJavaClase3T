package com.itb.wave8.demo.factories;

import com.itb.wave8.demo.sorters.Sorter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SorterFactory {

    private static Object selectedSorter;
    private static final String SORTER_PROPERTIES_NAME = "sorter.properties";
    private static final String SORTER_PROPERTY_NAME = "sorter";

    public static Object getInstance() throws Exception {
        if (selectedSorter == null) {
            Properties properties = new Properties();
            try {
                properties.load(new FileInputStream(new File(SORTER_PROPERTIES_NAME)));
                String sorterProperty = properties.getProperty(SORTER_PROPERTY_NAME);
                if (sorterProperty == null) {
                    throw new Exception("Error la propiedad \"" + SORTER_PROPERTY_NAME + "\" no existe");
                }
                selectedSorter = Class.forName(sorterProperty).getDeclaredConstructor().newInstance();
            } catch (FileNotFoundException e) {
                throw new Exception("No se ha encontrado el archivo " + SORTER_PROPERTIES_NAME, e);
            } catch (IOException e) {
                throw new Exception("Ha ocurrido un error al leer el archivo: ", e);
            } catch (ClassNotFoundException e) {
                throw new Exception("Error el sorter especificado no existe: ", e);
            }
        }
        return selectedSorter;
    }
}
