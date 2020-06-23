package it.spring.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


import it.spring.model.Gioco;

public interface GiocoRepository extends CrudRepository<Gioco, Long> {
	
	public List<Gioco> findByNomeOrderByAsc(String nome);
	
	public List<Gioco> findByPrezzoOrderByAsc(String prezzo);
	
	public List<Gioco> findByClassPegiOrderByAsc(String classPegi);
	
	public List<Gioco> findByCategoriaOrderByAsc(String categoria);
	
}
