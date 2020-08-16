package pucmm.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pucmm.springboot.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
