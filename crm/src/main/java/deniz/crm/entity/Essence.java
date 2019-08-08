package deniz.crm.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("essences")
public class Essence {

    @Field("essence_name")
    private String name;

    private String concentration;

    public Essence(String name,String concentration){
        this.name=name;
        this.concentration=concentration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

}
