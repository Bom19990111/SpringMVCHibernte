package pxu.edu.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pxu.edu.exam.entity.TypeCustomer;

@Repository("typeRepository")
public interface TypeRepository extends JpaRepository<TypeCustomer, Long> {

}
