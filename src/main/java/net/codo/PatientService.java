package net.codo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository repository;
	
	public List<Patient> listAll() {
		return repository.findAll();
	}
	
	public void save(Patient patient) {
		repository.save(patient);
	}
	
	public Patient get(Long id) {
		return repository.getById(id);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
