package it.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.spring.model.Gioco;

public interface GiocoRepository extends CrudRepository<Gioco, Long> {
	
	@Query(value = "SELECT g FROM Gioco g WHERE g.nome LIKE '%' || :keyword || '%'"
			+ " OR g.classPegi LIKE '%' || :keyword || '%'"
			+ " OR g.prezzo LIKE '%' || :keyword || '%'"
			+ " OR g.categoria LIKE '%' || :keyword || '%'")
	public List<Gioco> search(@Param("keyword") String keyword);
	
	public List<Gioco> orderByPrezzo(String string);
	
	public List<Gioco> orderByNome(String nome);
	
	public List<Gioco> orderByClassPegi(String string);
	
	public List<Gioco> orderByCategoria(String categoria);
	
}
