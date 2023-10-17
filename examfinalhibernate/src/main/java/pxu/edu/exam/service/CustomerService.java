package pxu.edu.exam.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import pxu.edu.exam.entity.Customer;

public interface CustomerService {

	Customer findById(Long id);

	void remove(Long id);

	Page<Customer> findAll(Pageable pageable);

	Page<Customer> findAllByFullNameContaining(String fullName, Pageable pageable);

	void save(Customer customer);

}
