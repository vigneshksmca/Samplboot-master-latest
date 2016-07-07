package Dc.app.Sampleboot;

import com.mongodb.BasicDBObject;
//import dc.core.constants.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConstantsRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public CountriesResource getCountries() {
        List<Location> locations = mongoTemplate.findAll(Location.class);
        CountriesResource countriesResource = new CountriesResource();
        countriesResource.setCountries(mongoTemplate.getCollection("Location").distinct("country"));
        return countriesResource;
    }

    public StatesResource getStatesForCountry(String key, Country country) {
        StatesResource statesResource = new StatesResource();
        statesResource.setStates(mongoTemplate.getCollection("Location").distinct("state", new BasicDBObject("country.countryCode", country.getCountryCode())));
        return statesResource;
    }
    
    public CitiesResource getCitiesForState(String key, String state) {
        CitiesResource citiesResoiurce = new CitiesResource();
        citiesResoiurce.setCities(mongoTemplate.getCollection("Location").distinct("city", new BasicDBObject("state", state)));
        return citiesResoiurce;
    }

    public TherapeuticAreaResource getTherapeuticAreas(String key) {
        TherapeuticAreaResource therapeuticAreaResource= new TherapeuticAreaResource();
        therapeuticAreaResource.setTherapeuticAreas(mongoTemplate.findAll(Area.class, "TherapeuticAreas"));
        return therapeuticAreaResource;
    }

    public SubTherapeuticAreaResource getSubTherapeuticAreas(String key) {
        SubTherapeuticAreaResource subTherapeuticAreaResource= new SubTherapeuticAreaResource();
        subTherapeuticAreaResource.setSubTherapeuticAreas(mongoTemplate.findAll(Area.class, "SubTherapeuticAreas"));
        return subTherapeuticAreaResource;
    }
    public LocationsResource getLocations(String key){
    	LocationsResource locationsResource=new LocationsResource();
    	locationsResource.setLocations(mongoTemplate.findAll(Location.class));
    	return locationsResource;
    }

    public MedicalSchoolResource getMedicalSchools(String key) {
        MedicalSchoolResource medicalSchoolResource= new MedicalSchoolResource();
        medicalSchoolResource.setMedicalSchools(mongoTemplate.findAll(MedicalSchool.class));
        return  medicalSchoolResource;
    }


    public IndustriesResource getIndustries(String key) {
        IndustriesResource industriesResource = new IndustriesResource();
        industriesResource.setIndustries(mongoTemplate.findAll(Industry.class));
        return industriesResource;
    }

    public DegreesResource getDegrees(String key) {
        DegreesResource degreesResource = new DegreesResource();
        degreesResource.setDegrees(mongoTemplate.findAll(Degree.class));
        return degreesResource;
    }
}
