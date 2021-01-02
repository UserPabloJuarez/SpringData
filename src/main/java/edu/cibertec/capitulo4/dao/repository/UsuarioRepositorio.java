package edu.cibertec.capitulo4.dao.repository;

import edu.cibertec.capitulo4.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<UsuarioEntity, String> {
    
}
