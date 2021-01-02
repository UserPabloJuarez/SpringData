package edu.cibertec.capitulo4.service;

import edu.cibertec.capitulo4.dao.repository.UsuarioRepositorio;
import edu.cibertec.capitulo4.entity.UsuarioEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioEntity validaLogin(UsuarioEntity usuario) {
        UsuarioEntity rpta = getUsuario(usuario.getUsuario());
        if (rpta != null) {
            if (!rpta.getClave().equalsIgnoreCase(usuario.getClave())) {
                rpta = null;
            }
        }
        return rpta;
    }

    public void insertaUsuario(UsuarioEntity ue) {
        usuarioRepositorio.save(ue);
    }

    public void eliminarUsuario(String codigo) {
        usuarioRepositorio.deleteById(codigo);
    }

    public List<UsuarioEntity> getListaUsuarios() {
        return usuarioRepositorio.findAll();
    }

    public UsuarioEntity getUsuario(String codigo) {
        UsuarioEntity rpta = null;
        Optional<UsuarioEntity> busqueda = usuarioRepositorio.findById(codigo);
        if (busqueda.isPresent()) {
            rpta = busqueda.get();
        }
        return rpta;
    }
}
