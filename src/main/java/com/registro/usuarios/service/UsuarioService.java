package com.registro.usuarios.service;

import com.registro.usuarios.dto.UsuarioRegistroDto;
import com.registro.usuarios.model.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioService extends UserDetailsService {
    public Usuario save(UsuarioRegistroDto registroDto);

    public List<Usuario> listarUsuarios();

}
