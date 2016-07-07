package Dc.app.Sampleboot;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/constants")
public class ConstantsController {

    @Autowired
    ConstantsService constantsService;

    @RequestMapping(value = "/getCountries")
    public ResponseEntity<CountriesResource> getCountries(){
        CountriesResource countriesResource = constantsService.getCountries();
        return new ResponseEntity<CountriesResource>(countriesResource,HttpStatus.FOUND);
    }
    

    @RequestMapping(value = "/getStatesForCountry",method = RequestMethod.POST)
    public ResponseEntity<StatesResource> getStatesForCountry(@RequestParam(defaultValue = "") String key,@RequestBody Country country){
        StatesResource statesResource= constantsService.getStatesForCountry(key, country);
        return new ResponseEntity<StatesResource>(statesResource,HttpStatus.FOUND);
    }

    @RequestMapping(value = "/getCitiesForState",method = RequestMethod.GET)
    public ResponseEntity<LocationsResource> getCitiesForState(@RequestParam(value = "key") String key,@RequestParam String state){
        LocationsResource locationsResource = constantsService.getCitiesForState(key, state);
        return new ResponseEntity<LocationsResource>(locationsResource,HttpStatus.OK);
    }


    @RequestMapping(value = "/getTherapeuticAreas",method = RequestMethod.GET)
    public ResponseEntity<TherapeuticAreaResource> getTherapeuticAreas(@RequestParam String key){
        TherapeuticAreaResource therapeuticAreaResource = constantsService.getTherapeuticAreas(key);
        return new ResponseEntity<TherapeuticAreaResource>(therapeuticAreaResource,HttpStatus.FOUND);
    }

    @RequestMapping(value = "/getSubTherapeuticAreas",method = RequestMethod.GET)
    public ResponseEntity<SubTherapeuticAreaResource> getSubTherapeuticAreas(@RequestParam String key){
        SubTherapeuticAreaResource subTherapeuticAreaResource= constantsService.getSubTherapeuticAreas(key);
        return new ResponseEntity<SubTherapeuticAreaResource>(subTherapeuticAreaResource,HttpStatus.FOUND);
    }
    @RequestMapping(value="/getLocations",method=RequestMethod.GET)
    public ResponseEntity<LocationsResource> getLocations(@RequestParam String key){
    	LocationsResource locationsResource=constantsService.getLocations(key);
    	return new ResponseEntity<LocationsResource>(locationsResource,HttpStatus.FOUND);
    }
    @RequestMapping(value = "/getMedicalSchools",method = RequestMethod.GET)
    public ResponseEntity<MedicalSchoolResource> getMedicalSchools(@RequestParam String key){
        MedicalSchoolResource medicalSchoolResource= constantsService.getMedicalSchools(key);
        return new ResponseEntity<MedicalSchoolResource>(medicalSchoolResource,HttpStatus.FOUND);
    }

    @RequestMapping(value = "/getIndustries",method = RequestMethod.GET)
    public ResponseEntity<IndustriesResource> getIndustries(@RequestParam String key){
        IndustriesResource industriesResource = constantsService.getIndustries(key);
        return new ResponseEntity<IndustriesResource>(industriesResource,HttpStatus.FOUND);
    }

    @RequestMapping(value = "/getDegrees",method = RequestMethod.GET)
    public ResponseEntity<DegreesResource> getDegrees(@RequestParam String key){
        DegreesResource degreesResource = constantsService.getDegrees(key);
        return new ResponseEntity<DegreesResource>(degreesResource,HttpStatus.FOUND);
    }

    @RequestMapping(value = "/saveTherapeuticArea",method = RequestMethod.POST)
    public ResponseEntity saveTherapeuticArea(@RequestBody TherapeuticArea area){
        Area newArea = constantsService.saveTherapeuticArea(area);
        return new ResponseEntity(newArea,HttpStatus.OK);
    }

    @RequestMapping(value = "/saveSubTherapeuticArea",method = RequestMethod.POST)
    public ResponseEntity saveSubTherapeuticArea(@RequestBody SubTherapeuticArea area){
        Area newArea = constantsService.saveSubTherapeuticArea(area);
        return new ResponseEntity(newArea,HttpStatus.OK);
    
    }

    @RequestMapping(value = "/saveMedicalSchool",method = RequestMethod.POST)
    public ResponseEntity saveMedicalSchool(@RequestBody MedicalSchool medicalSchool){
        MedicalSchool medicalSchool1 = constantsService.saveMedicalSchool(medicalSchool);
        return new ResponseEntity(medicalSchool1,HttpStatus.OK);
    }

    @RequestMapping(value = "/saveIndustry",method = RequestMethod.POST)
    public ResponseEntity saveIndustry(@RequestBody Industry industry){
        Industry newIndustry = constantsService.saveIndustry(industry);
        return new ResponseEntity(newIndustry,HttpStatus.OK);
    }
    @RequestMapping (value="/saveTherapeuticArea", method=RequestMethod.GET)
    public ResponseEntity insertTherapeuticArea(){
        constantsService.insertTherapeuticArea();
     return new ResponseEntity(HttpStatus.ACCEPTED);
    }
    @RequestMapping (value="/savesubTherapeuticArea", method=RequestMethod.GET)
    public ResponseEntity insertsubTherapeuticArea(){
        constantsService.insertsubTherapeuticArea();
     return new ResponseEntity(HttpStatus.ACCEPTED);
    }
    
    @RequestMapping (value="/insertLocation", method=RequestMethod.GET)
    public ResponseEntity insertLocation(){
        constantsService.insertLocation();
     return new ResponseEntity(HttpStatus.ACCEPTED);
    }
    
    @RequestMapping(value="/saveLocation",method=RequestMethod.POST)
    public ResponseEntity saveLocation(@RequestBody Location location){
    	Location location1=constantsService.saveLocation(location);
    	return new ResponseEntity(location1,HttpStatus.OK);
    }
}
