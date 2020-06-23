package it.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.spring.model.Gioco;
import it.spring.repository.GiocoRepository;

@Service
@Transactional
public class GiocoService {
	@Autowired 
	private GiocoRepository repo;
	
	public void save(Gioco gioco) {
		repo.save(gioco);
	}
	
	public List<Gioco> listAll() {
		return (List<Gioco>) repo.findAll();
	}
	
	public Gioco get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Gioco> orderByPrezzo(){
		return (List<Gioco>) repo.findByPrezzoOrderByAsc("prezzo");
	}
	
	public List<Gioco> orderByNome() {
		return (List<Gioco>) repo.findByNomeOrderByAsc("nome");
	}
	
	public List<Gioco> orderByClassPegi() {
		return (List<Gioco>) repo.findByClassPegiOrderByAsc("classPegi");
	}
	
	public List<Gioco> orderByCategoria() {
		return (List<Gioco>) repo.findByCategoriaOrderByAsc("categoria");
	}
}
