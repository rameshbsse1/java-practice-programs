package com.example.test.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindContinentWisePopulation {

    public int getPopulation(List<Country> countries, String continent) {
        int population = 0;

        for (Country country : countries) {
            if (country.getContinent().equalsIgnoreCase(continent)) {
                population += country.getPopulation();
            }

        }
        return population;
    }

    int getPopulationByJava8(List<Country> countries, String contitent) {
        return countries.stream().filter(country -> country.getContinent().equalsIgnoreCase(contitent)).mapToInt(Country::getPopulation).sum();
    }

    public static void main(String[] args) {
        FindContinentWisePopulation findContinentWisePopulation = new FindContinentWisePopulation();
        List<Country> list = new ArrayList<>();
        Country country = new Country("Asia", 1450000000);
        list.add(country);

        country.setContinent("Asia");

        int population = findContinentWisePopulation.getPopulation(list, "asia");
        System.out.println(population);
        System.out.println(findContinentWisePopulation.getPopulationByJava8(list, "asia"));
    }

    public int getPopulationUsingLoop(List<Country> countries, String continent) {
        int population = 0;

        for (Country country: countries) {
            if (country.getContinent().equalsIgnoreCase(continent)) {
                population += country.getPopulation();
            }
        }

        countries.stream().filter(country -> country.getContinent().equalsIgnoreCase(continent)).mapToInt(Country::getPopulation).sum();

        return population;
    }
}

