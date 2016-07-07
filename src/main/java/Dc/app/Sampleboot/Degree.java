package Dc.app.Sampleboot;



import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Degrees")
public class Degree {

    private String id;
    private String value;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
