package edu.itu.cavabunga.lib.entity.component;

import edu.itu.cavabunga.lib.entity.Component;
import edu.itu.cavabunga.lib.entity.property.PropertyType;
import edu.itu.cavabunga.lib.exception.Validation;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Calendar extends Component {
    @Override
    public void validate(){
        if(this.getParent() != null){
            throw new Validation("Calendar component cannot have parent component");
        }

        super.validate();

        List<PropertyType> optionalOneList = new ArrayList<>();
        optionalOneList.add(PropertyType.Calscale);
        optionalOneList.add(PropertyType.Method);
        super.validateOptionalOneProperties(optionalOneList);

        List<PropertyType> requiredOneList = new ArrayList<>();
        requiredOneList.add(PropertyType.Prodid);
        requiredOneList.add(PropertyType.Version);
        super.validateRequiredOneProperties(requiredOneList);
    }
}
