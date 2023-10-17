package pxu.edu.exam.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import pxu.edu.exam.entity.Customer;

@Repository("customerRepository")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
	Page<Customer> findAllByFullNameContaining(String fullName, Pageable pageable);

}
