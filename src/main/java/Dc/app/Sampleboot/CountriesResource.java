package Dc.app.Sampleboot;

import java.util.List;


public class CountriesResource {

    private List<Country> countries ;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
