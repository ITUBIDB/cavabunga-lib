package tr.edu.itu.cavabunga.lib.entity.property;

import tr.edu.itu.cavabunga.lib.entity.Property;

import javax.persistence.Entity;

@Entity
public class Method extends Property {
    @Override
    public void validate(){
        super.validate();
        super.validateValueType(PropertyValueType.TEXT);
    }
}
