/*

no need to write sql for basic operation
can add constom methods later
basic meethod like search save delete are automatically given by this


*/
package com.kavinda.sms.repository;

import com.kavinda.sms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}