package com.azamat_komaev.patterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        CountryComponent allCountries = new Country("World");

        CountryComponent country1 = new Country("Russia");
        CountryComponent country2 = new Country("USA");

        allCountries.add(country1);
        allCountries.add(country2);

        CountryComponent russianRegion = new Country("North Ossetia");
        CountryComponent usaRegion = new Country("Texas");

        country1.add(russianRegion);
        country2.add(usaRegion);

        CountryComponent ossetianCity = new City("Vladikavkaz");
        CountryComponent texasCity = new City("Ostin");

        russianRegion.add(ossetianCity);
        usaRegion.add(texasCity);

        allCountries.print();
    }
}
