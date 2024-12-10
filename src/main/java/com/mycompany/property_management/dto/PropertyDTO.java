package com.mycompany.property_management.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyDTO {

    private String name;
    private String description;
    private String owner;
    private String owner_email;
    private Double price;
    private String address;

}
