package edu.miu.annapurnabe.repository;

import edu.miu.annapurnabe.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

/**
 * @author bijayshrestha on 6/24/22
 * @project annapurna-be
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s WHERE s.id=:id and s.status='A'")
    Optional<Student> findById(Integer id);
}
