package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    /**
     * Returns a CustomList containing one city
     * @return
     */
    private CustomList mockCustomList() {
        CustomList CustomList = new CustomList();
        CustomList.add(mockCity());
        return CustomList;
    }

    /**
     * Returns one example city
     * @return Example city
     */
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    /**
     * Returns a list of example cities
     * @return Example cities
     */
    private City[] mockCities() {
        return new City[]{
                // Alberta
                new City("Calgary", "Alberta"),
                new City("Edmonton", "Alberta"), // capital
                // British Columbia
                new City("Vancouver", "British Columbia"),
                new City("Victoria", "British Columbia"), // capital
                // Manitoba
                new City("Winnipeg", "Manitoba"), // capital
                new City("Brandon", "Manitoba"),
                // New Brunswick
                new City("Fredericton", "New Brunswick"), // capital
                new City("Moncton", "New Brunswick"),
                new City("Saint John", "New Brunswick"),
                // Newfoundland and Labrador
                new City("St. John's", "Newfoundland and Labrador"), // capital
                new City("Corner Brook", "Newfoundland and Labrador"),
                // Nova Scotia
                new City("Halifax", "Nova Scotia"), // capital
                new City("Sydney", "Nova Scotia"),
                // Ontario
                new City("Toronto", "Ontario"), // capital
                new City("Ottawa", "Ontario"),
                new City("Mississauga", "Ontario"),
                // Prince Edward Island
                new City("Charlottetown", "Prince Edward Island"), // capital
                new City("Summerside", "Prince Edward Island"),
                // Quebec
                new City("Quebec City", "Quebec"), // capital
                new City("Montreal", "Quebec"),
                // Saskatchewan
                new City("Regina", "Saskatchewan"), // capital
                new City("Saskatoon", "Saskatchewan"),
                // Northwest Territories
                new City("Yellowknife", "Northwest Territories"), // capital
                new City("Inuvik", "Northwest Territories"),
                // Nunavut
                new City("Iqaluit", "Nunavut"), // capital
                new City("Rankin Inlet", "Nunavut"),
                // Yukon
                new City("Whitehorse", "Yukon"), // capital
                new City("Dawson City", "Yukon")
        };
    }
    
    /**
     * Test hasCity
     */
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    /**
     * Tests that adding increases the length
     */
    @Test
    void testAdd() {
        CustomList CustomList = mockCustomList();
        assertEquals(1, CustomList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        CustomList.add(city);
        assertEquals(2, CustomList.getCities().size());
        assertTrue(CustomList.getCities().contains(city));
    }
}
