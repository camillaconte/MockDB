package co.develhope.mockdb.repositories;

import co.develhope.mockdb.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
