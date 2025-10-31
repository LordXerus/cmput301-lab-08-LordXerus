package com.example.lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Returns a *Sorted* cities.
     * @return Sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = cities;
        return list;
    }

    /**
     * Deletes a City with the same name and province from the CityList.
     * @param city a city
     */
    public void deleteCity(City city) {
        if(!hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
}
