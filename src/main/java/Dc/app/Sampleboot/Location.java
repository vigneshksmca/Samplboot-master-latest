package Dc.app.Sampleboot;

//import dc.core.constants.model.Country;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Location")
public class Location {

    private String id;
    private String city;
    private String state;
    private Country country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


