package pxu.edu.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import pxu.edu.exam.entity.Customer;
import pxu.edu.exam.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer findById(Long id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public void remove(Long id) {
		customerRepository.deleteById(id);
	}

	@Override
	public Page<Customer> findAll(Pageable pageable) {
		return customerRepository.findAll(pageable);
	}

	@Override
	public void save(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public Page<Customer> findAllByFullNameContaining(String fullName, Pageable pageable) {
		return customerRepository.findAllByFullNameContaining(fullName, pageable);
	}

}
