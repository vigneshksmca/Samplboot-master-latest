package Dc.app.Sampleboot;



import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import javax.swing.text.html.HTMLDocument.Iterator;


@Service
public class ConstantsService {


    @Autowired
    ConstantsRepository constantsRepository;

    @Autowired
    TherapeuticAreaMongoRepository therapeuticAreaMongoRepository;

    @Autowired
    SubTherapeuticAreaMongoRepository subTherapeuticAreaMongoRepository;


    @Autowired
    MedicalSchoolMongoRepository medicalSchoolMongoRepository;

    @Autowired
    IndustryMongoRepository industryMongoRepository;


    @Autowired
    LocationMongoRepository locationMongoRepository;

    public CountriesResource getCountries() {
        return constantsRepository.getCountries();
    }

    public StatesResource getStatesForCountry(String key, Country country) {
        return constantsRepository.getStatesForCountry(key, country);
    }

    public LocationsResource getCitiesForState(String key, String state) {
        List<Location> locations = locationMongoRepository.findByState(state);
        LocationsResource locationsResource=new LocationsResource(locations);
        return locationsResource;
    }

    public TherapeuticAreaResource getTherapeuticAreas(String key) {
        return constantsRepository.getTherapeuticAreas(key);
    }

    public SubTherapeuticAreaResource getSubTherapeuticAreas(String key) {
        return constantsRepository.getSubTherapeuticAreas(key);
    }
    public LocationsResource getLocations(String key){
    	return constantsRepository.getLocations(key);
    }

    public MedicalSchoolResource getMedicalSchools(String key) {
        return constantsRepository.getMedicalSchools(key);
    }

    public IndustriesResource getIndustries(String key) {
        return constantsRepository.getIndustries(key);

    }

    public DegreesResource getDegrees(String key) {
        return constantsRepository.getDegrees(key);
    }

    public Area saveTherapeuticArea(TherapeuticArea area) {
        Area newArea=therapeuticAreaMongoRepository.save(area);
        return newArea;

    }

    public Area saveSubTherapeuticArea(SubTherapeuticArea area) {
        Area newArea=subTherapeuticAreaMongoRepository.save(area);
        return newArea;
    }

    public MedicalSchool saveMedicalSchool(MedicalSchool medicalSchool) {
        MedicalSchool medicalSchool1=medicalSchoolMongoRepository.save(medicalSchool);
        return medicalSchool1;
    }

    public Industry saveIndustry(Industry industry) {
        return industryMongoRepository.save(industry);
    }
    public Location saveLocation(Location location){
    	Location location1=locationMongoRepository.save(location);
    	return location1;
    }
    
    public void insertTherapeuticArea(){
        try
        {
        List<String> therapeuticAreaList = new ArrayList<String>();
        therapeuticAreaList.add("Anatomy");
        therapeuticAreaList.add("Anesthesiology");
        therapeuticAreaList.add("Aerospace Medicine");
        therapeuticAreaList.add("Biochemistry");
        therapeuticAreaList.add("Biomedical Engineering");
        therapeuticAreaList.add("Cardiothoracic Surgery");
        therapeuticAreaList.add("Dermatology ");
        therapeuticAreaList.add("Emergency Medicine");
        therapeuticAreaList.add("Family Medicine");
        therapeuticAreaList.add("Genetics");
        therapeuticAreaList.add("Internal Medicine ");
        therapeuticAreaList.add("Hospice & Palliative Medicine");
        therapeuticAreaList.add("Microbiology");
        therapeuticAreaList.add("Molecular Biology");
        therapeuticAreaList.add("Forensic Medicine & Toxicology");
        therapeuticAreaList.add("Neurology ");
        therapeuticAreaList.add("Neuro Surgery");
        therapeuticAreaList.add("Nuclear Medicine");
        therapeuticAreaList.add("Obstetrics and Gynecology");
        therapeuticAreaList.add("Occupational Medicine");
        therapeuticAreaList.add("Ophthalmology");
        therapeuticAreaList.add("Orthopedic Surgery");
        therapeuticAreaList.add("Otorhinolaryngology, Head and Neck Surgery");
        therapeuticAreaList.add("Pathology");
        therapeuticAreaList.add("Pediatrics");
        therapeuticAreaList.add("Pharmacology");
        therapeuticAreaList.add("Pharmaceutical Mecdicine");
        therapeuticAreaList.add("Physical Medicine and Rehabilitation");
        therapeuticAreaList.add("Physiology");
        therapeuticAreaList.add("Preventive, Community & Social Medicine");
        therapeuticAreaList.add("Psychiatry");
        therapeuticAreaList.add("Radiation Medicine");
        therapeuticAreaList.add("Radiology");
        therapeuticAreaList.add("Regenerative Medicine");
        therapeuticAreaList.add("Sports Medicine");
        therapeuticAreaList.add("Surgery");
        therapeuticAreaList.add("Urology");
        therapeuticAreaList.add("Translational Medicine");
        therapeuticAreaList.add("Dentistry");
        therapeuticAreaList.add("Podiatric Medicine");
        therapeuticAreaList.add("Physiotherapy");
        therapeuticAreaList.add("Optometry");
        therapeuticAreaList.add("Audiology");
        therapeuticAreaList.add("Nursing");
        therapeuticAreaList.add("Hospitalist");
        therapeuticAreaList.add("Immunology and cellular medicine ");
        
        Iterator<String> itr = therapeuticAreaList.iterator();
        
        while(itr.hasNext()){
        
        String value = (String) itr.next();
        TherapeuticArea therapeuticArea = new TherapeuticArea();
      
        therapeuticArea.setArea(value);
         therapeuticAreaMongoRepository.save(therapeuticArea);
       
       }
        }
        catch(Exception e){
        	System.out.println(e.getMessage());
        }
        }
    public void insertsubTherapeuticArea(){
        try
        {
        List<String> subTherapeuticAreaList = new ArrayList<String>();
        subTherapeuticAreaList.add("Cardiac Anesthesia");
        subTherapeuticAreaList.add("Critical care");
        subTherapeuticAreaList.add("Pain management");
        subTherapeuticAreaList.add("Pediatric Anesthesia");
        subTherapeuticAreaList.add("Neuro Anesthesia");
        subTherapeuticAreaList.add("Heart Transplant");
        subTherapeuticAreaList.add("Lung Transplant");
        subTherapeuticAreaList.add("Structural heart Disease");
        subTherapeuticAreaList.add("Pediatric");
        subTherapeuticAreaList.add("Dermatopathology ");
        subTherapeuticAreaList.add("Aesthetic Dermatology");
        subTherapeuticAreaList.add("Derm Oncology");
        subTherapeuticAreaList.add("Cutaneous Surgery");
        subTherapeuticAreaList.add("Dermatological immunology");
        subTherapeuticAreaList.add("Hospitalist");
        subTherapeuticAreaList.add("Oncology");
        subTherapeuticAreaList.add("Cardiology");
        subTherapeuticAreaList.add("Gastroenterology");
        subTherapeuticAreaList.add("Nephrology");
        subTherapeuticAreaList.add("Pulmonary And Critical Care");
        subTherapeuticAreaList.add("Rheumatology");
        subTherapeuticAreaList.add("Vascular Medicine");
        subTherapeuticAreaList.add("Allergy And Immunology");
        subTherapeuticAreaList.add("Hepatology");
        subTherapeuticAreaList.add("Endocrinologist");
        subTherapeuticAreaList.add("Aesthetic medicine");
        subTherapeuticAreaList.add("Geriatrics");
        subTherapeuticAreaList.add("Infectious Disease");
        subTherapeuticAreaList.add("Sports Medicine");
        subTherapeuticAreaList.add("Neuro Oncology");
        subTherapeuticAreaList.add("Autonomic Neurology");
        subTherapeuticAreaList.add("Neuromuscular Neurology");
        subTherapeuticAreaList.add("Headache Medicine");
        subTherapeuticAreaList.add("Neurocritical Care");
        subTherapeuticAreaList.add("Neural Repair And Rehabilitation");
        subTherapeuticAreaList.add("Geriatric Neurology");
        subTherapeuticAreaList.add("Neuroimaging");
        subTherapeuticAreaList.add("Behavioral Neurology And Neuropsychiatry ");
        subTherapeuticAreaList.add("Gynecology Oncology");
        subTherapeuticAreaList.add("Urogynecology And Female Pelvic Medicine");
        subTherapeuticAreaList.add("Reproductive  Endocrinology And Infertility");
        subTherapeuticAreaList.add("Minimally Invasive Gynecologist");
        subTherapeuticAreaList.add("Maternal And Fetal Health");
        subTherapeuticAreaList.add("Geriatric Gynecology");
        subTherapeuticAreaList.add("Pediatric And Adolescent Gynecology");
        subTherapeuticAreaList.add("Family Planning");
        subTherapeuticAreaList.add("Retina Specialist");
        subTherapeuticAreaList.add("Oculoplasty");
        subTherapeuticAreaList.add("Pediatric Ophthalmology");
        subTherapeuticAreaList.add("Neuropthalmology");
        subTherapeuticAreaList.add("Vitreoretinal  Disease Surgery");
        subTherapeuticAreaList.add("Ophthalmic Pathology");
        subTherapeuticAreaList.add("Corneal And External Disease");
        subTherapeuticAreaList.add("Cataract And Refractive Surgery");
        subTherapeuticAreaList.add("Glaucoma Surgery");
        subTherapeuticAreaList.add("Uveitis And Ocular Immunology ");
        subTherapeuticAreaList.add("Shoulder And Elbow");
        subTherapeuticAreaList.add("Hand Surgery");
        subTherapeuticAreaList.add("Hip And Knee Surgery");
        subTherapeuticAreaList.add("Foot And Ankle Surgery");
        subTherapeuticAreaList.add("Trauma surgery");
        subTherapeuticAreaList.add("Pediatric Orthopedics");
        subTherapeuticAreaList.add("Sports Medicine");
        subTherapeuticAreaList.add("Spine Surgery");
        subTherapeuticAreaList.add("Musculoskeletal Oncology");
        subTherapeuticAreaList.add("Neuro Otology");
        subTherapeuticAreaList.add("Sleep Medicine");
        subTherapeuticAreaList.add("Pediatric Otolaryngiology");
        subTherapeuticAreaList.add("Head And Neck Plastic Surgery");
        subTherapeuticAreaList.add("General Pathology");
        subTherapeuticAreaList.add("Gastrointestinal Pathology");
        subTherapeuticAreaList.add("Derma Pathology");
        subTherapeuticAreaList.add("Neuropathology");
        subTherapeuticAreaList.add("Uropathology");
        subTherapeuticAreaList.add("Thoracic pathology");
        subTherapeuticAreaList.add("Cardiac Pathology");
        subTherapeuticAreaList.add("Bone Pathology");
        subTherapeuticAreaList.add("Neurology");
        subTherapeuticAreaList.add("Gastroenterology");
        subTherapeuticAreaList.add("Endocrinology");
        subTherapeuticAreaList.add("Genetics");
        subTherapeuticAreaList.add("Child Psychiatry");
        subTherapeuticAreaList.add("Pulmonary And Critical Care");
        subTherapeuticAreaList.add("Nephrology");
        subTherapeuticAreaList.add("Neonatology");
        subTherapeuticAreaList.add("Pediatric Oncology");
        subTherapeuticAreaList.add("Cell Based Therapist ");
        subTherapeuticAreaList.add("Infectious Disease ");
        subTherapeuticAreaList.add("General Pharmacology");
        subTherapeuticAreaList.add("Neuropharmacology");
        subTherapeuticAreaList.add("Cardiacpahrmacology");
        subTherapeuticAreaList.add("Gastrointestinal Pharmacology");
        subTherapeuticAreaList.add("Kidney Pharmacology");
        subTherapeuticAreaList.add("Psychopharmacology");
        subTherapeuticAreaList.add("Clinical Pharmacology");
        subTherapeuticAreaList.add("Brain Injury");
        subTherapeuticAreaList.add("Pediatric PM&R");
        subTherapeuticAreaList.add("Pain Medicine");
        subTherapeuticAreaList.add("Sports Medicine");
        subTherapeuticAreaList.add("Spinal Cord Rehabilitation");
        subTherapeuticAreaList.add("Hospice And Palliative Medicine");
        subTherapeuticAreaList.add("Musculoskeletal Rehabilitation");
        subTherapeuticAreaList.add("Cardiac Pulmonary");
        subTherapeuticAreaList.add("Gastrointestinal");
        subTherapeuticAreaList.add("Kidney");
        subTherapeuticAreaList.add("Blood Circulation");
        subTherapeuticAreaList.add("Neurophysiology");
        subTherapeuticAreaList.add("Acid Base Physiology");
        subTherapeuticAreaList.add("Urophysiology");
        subTherapeuticAreaList.add("Lymphatic Circulation");
        subTherapeuticAreaList.add("Child And Adolescent  Psychiatry ");
        subTherapeuticAreaList.add("Addiction Psychiatry");
        subTherapeuticAreaList.add("Forensic Psychiatry");
        subTherapeuticAreaList.add("Psychosomatic Medicine");
        subTherapeuticAreaList.add("Geriatric Psychiatry");
        subTherapeuticAreaList.add("Sleep Medicine");
        subTherapeuticAreaList.add("Pediatric Radiology");
        subTherapeuticAreaList.add("Thoracic Radiology");
        subTherapeuticAreaList.add("Head And Neck Radiology");
        subTherapeuticAreaList.add("Neuroradiology");
        subTherapeuticAreaList.add("Skeletal Radiology");
        subTherapeuticAreaList.add("Interventional Radiology");
        subTherapeuticAreaList.add("Ultrasonology");
        subTherapeuticAreaList.add("Gastrointestinal Radiology");
        subTherapeuticAreaList.add("General Surgery");
        subTherapeuticAreaList.add("Cardiac Surgery");
        subTherapeuticAreaList.add("Minimally Invasive Surgery");
        subTherapeuticAreaList.add("Thoracic Surgery");
        subTherapeuticAreaList.add("Breast Surgery");
        subTherapeuticAreaList.add("Surgical Oncology");
        subTherapeuticAreaList.add("Plastic Surgery");
        subTherapeuticAreaList.add("Surgical Critical Care");
        subTherapeuticAreaList.add("Pediatric Surgery");
        subTherapeuticAreaList.add("Vascular Surgery");
        subTherapeuticAreaList.add("Colorectal Surgery");
        subTherapeuticAreaList.add("Uroncology");
        subTherapeuticAreaList.add("Pelvic Reconstruction And Bladder Surgery");
        subTherapeuticAreaList.add("Urethral Reconstruction");
        subTherapeuticAreaList.add("Male Infertility");
        subTherapeuticAreaList.add("Minimally Invasive Urology");
        subTherapeuticAreaList.add("Pediatric Urology");
        subTherapeuticAreaList.add("Pediatric Dentistry");
        subTherapeuticAreaList.add("Ortho Dentistry");
        subTherapeuticAreaList.add("Periodontics");
        subTherapeuticAreaList.add("Maxillofacial Surgery ");
        subTherapeuticAreaList.add("Aesthetic Dentistry ");
        
        Iterator<String> itr = subTherapeuticAreaList.iterator();
        
        while(itr.hasNext()){
        
        String value = (String) itr.next();
        SubTherapeuticArea subTherapeuticArea = new SubTherapeuticArea();
        subTherapeuticArea.setArea(value);
        subTherapeuticAreaMongoRepository.save(subTherapeuticArea);
        }
        }
        catch(Exception e){
        	System.out.println(e.getMessage());
        }
        }
        
    public void insertLocation(){
		try{
		List<Location> insertLocationList=new ArrayList<Location>();
		FileInputStream file = new FileInputStream(new File("/home/kosoft-013/Downloads/eclipse/Workspace/Samplboot-master latest/cityListForIndia1.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()) {
			Location loc=new Location();
			Country con=new Country();
	        Row row = rowIterator.next();
	        //loc.setId("");
	        loc.setCity(row.getCell(0).toString());
	        loc.setState(row.getCell(1).toString());
	        con.setCountryName(row.getCell(2).toString());
	        con.setCountryCode(row.getCell(3).toString());
	        loc.setCountry(con);
	        insertLocationList.add(loc);
	        System.out.println("");
		}
		 locationMongoRepository.save(insertLocationList);
		 file.close();
		} 
		catch (IOException e) {
		    e.printStackTrace();
		}
		
		
	}

	

}
