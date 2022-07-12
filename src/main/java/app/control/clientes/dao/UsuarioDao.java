package app.control.clientes.dao;

import app.control.clientes.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);

}
