package br.com.fiap.calorias.service;

import br.com.fiap.calorias.model.Usuario;
import br.com.fiap.calorias.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service  // gerenciada pelo Spring, assim podem ser injetadas como dependência em outras classes
public class UsuarioService {

    @Autowired  // injetado automaticamente sem a necessidade de instanciar
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        // grava um usuário no banco, retorna qual foi o usuário gravado e o id
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorId(Long id){
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        // a classe Optional trata os objetos com valores opcional, ele pode estar presente ou não no objeto, tratando assim de valores nulos
        if (usuarioOptional.isPresent()){
            return usuarioOptional.get();
        } else {
            throw new RuntimeException("Usuário não existe!");
        }
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public void excluir(Long id){
        Optional<Usuario> usuarioOptional =
                usuarioRepository.findById(id);

        if (usuarioOptional.isPresent()){
            usuarioRepository.delete(usuarioOptional.get());
        } else {
            throw new RuntimeException("Usuário não encontrado!");
        }
    }

    public Usuario atualizar(Usuario usuario){
        Optional<Usuario> usuarioOptional =
                usuarioRepository.findById(usuario.getUsuarioId());

        if (usuarioOptional.isPresent()){
            return usuarioRepository.save(usuario);
            // o método save sabe salvar ou atualizar dependendo do ID do registro
        } else {
            throw new RuntimeException("Usuário não encontrado!");
        }
    }

}