package tr.edu.itu.cavabunga.lib.entity.property;

import tr.edu.itu.cavabunga.lib.entity.Property;
import tr.edu.itu.cavabunga.lib.exception.Validation;

import javax.persistence.Entity;

@Entity
public class Calscale extends Property {
    @Override
    public void validate(){
        super.validate();
        super.validateValueType(PropertyValueType.TEXT);

        //TODO: is cavabunga support only for Gregorian calendar?
        if(!this.getValue().equals("GREGORIAN")){
            throw new Validation("CALSCALE value is different from acceptable value range: " + this.getValue());
        }
    }
}
