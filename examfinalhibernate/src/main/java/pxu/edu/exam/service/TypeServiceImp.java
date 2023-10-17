package pxu.edu.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pxu.edu.exam.entity.TypeCustomer;
import pxu.edu.exam.repository.TypeRepository;

@Service
public class TypeServiceImp implements TypeService {
	@Autowired
	private TypeRepository typeRepository;

	@Override
	public List<TypeCustomer> getAll() {
		return typeRepository.findAll();
	}

}