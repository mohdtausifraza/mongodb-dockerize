package com.tausif.mongodbdockerize.repository;

import com.tausif.mongodbdockerize.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {
}
