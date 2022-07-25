package com.acme.eshop.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class Customer extends BaseModel {

    private String fName;
    private String lName;
    private Long phone;
    private String address;
    private String email;


}
