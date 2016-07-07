package Dc.app.Sampleboot;

import java.util.List;

/**
 * Created by vishnu on 11/6/15.
 */
public class LocationsResource {

    public LocationsResource() {
    }

    public LocationsResource(List<Location> locations) {
        this.locations = locations;
    }

    private List<Location> locations;

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
