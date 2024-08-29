package org.example;

import dac.CityRepository;
import dac.CountryRepository;
import dac.MeasureRepesitory;
import model.City;
import model.Country;
import model.Measure;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws SQLException {
        CityRepository repository = new CityRepository();
        City city = new City();
        city.setTitle("Подземный подполя");
        System.out.printf(repository.saveCiti(city));

        MeasureRepesitory measureRepesitory1 = new MeasureRepesitory();
        Measure measure1 = new Measure();
        measure1.setName("корупция");
        System.out.println(measureRepesitory1.saveCountr(measure1));

        MeasureRepesitory measureRepesitory2 = new MeasureRepesitory();
        Measure measure2 = new Measure();
        measure2.setName("Ney");
        System.out.println(measureRepesitory2.saveCountr(measure2));





    }
}
