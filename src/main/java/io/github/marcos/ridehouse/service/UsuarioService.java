package io.github.marcos.ridehouse.service;
import io.github.marcos.ridehouse.dto.UsuarioRequest;
import io.github.marcos.ridehouse.model.Usuario;
import io.github.marcos.ridehouse.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario addUsuario(UsuarioRequest usuarioRequest) {
        var usuario = new Usuario();

        usuario.setNomeCompleto(usuarioRequest.nomeCompleto());
        usuario.setEmail(usuarioRequest.email());
        usuario.setCpf(usuarioRequest.cpf());
        usuario.setDataNascimento(usuarioRequest.dataNascimento());
        usuario.setTelefone(usuarioRequest.telefone());
        usuario.setGenero(usuarioRequest.genero());
        usuario.setAceitouTermos(usuarioRequest.aceitouTermos());

        return usuarioRepository.save(usuario);
    }
}
