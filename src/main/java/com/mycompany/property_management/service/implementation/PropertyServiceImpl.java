package com.mycompany.property_management.service.implementation;

import com.mycompany.property_management.dto.PropertyDTO;
import com.mycompany.property_management.service.PropertyService;
import org.springframework.stereotype.Service;

/*
Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as
"an operation offered as an interface that stands alone in the model, with no encapsulated state."
May also indicate that a class is a "Business Service Facade" (in the Core J2EE patterns sense), or something similar.
This annotation is a general-purpose stereotype, and individual teams may narrow their semantics and use as appropriate.
 */
@Service
public class PropertyServiceImpl implements PropertyService {
    @Override
    public void saveProperty(PropertyDTO propertyDTO) {
    }
}
