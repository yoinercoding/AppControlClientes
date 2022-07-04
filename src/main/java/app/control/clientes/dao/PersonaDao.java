package app.control.clientes.dao;

import app.control.clientes.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
