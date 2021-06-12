package com.school.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.school.mongo.models.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
