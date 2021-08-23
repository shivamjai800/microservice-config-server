package com.microservices.userservice.VO;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {

    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}


