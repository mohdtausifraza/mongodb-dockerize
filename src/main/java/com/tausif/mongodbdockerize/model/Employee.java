package com.tausif.mongodbdockerize.model;
import org.springframework.data.annotation.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document( collection = "employee")
public class Employee {
    @Id
    private long id;

    private String name;
}
