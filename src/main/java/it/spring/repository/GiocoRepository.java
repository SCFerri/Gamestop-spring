package it.spring.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


import it.spring.model.Gioco;

public interface GiocoRepository extends CrudRepository<Gioco, Long> {
	
	public List<Gioco> findByTitoloOrderByTitoloAsc(String titolo);
	
	public List<Gioco> findByPrezzoOrderByPrezzoAsc(String prezzo);
	
	public List<Gioco> findByClassPegiOrderByClassPegiAsc(String classPegi);
	
	public List<Gioco> findByCategoriaOrderByCategoriaAsc(String categoria);
	
}
