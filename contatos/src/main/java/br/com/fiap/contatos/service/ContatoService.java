package br.com.fiap.contatos.service;

import br.com.fiap.contatos.dto.ContatoCadastroDto;
import br.com.fiap.contatos.dto.ContatoExibicaoDto;
import br.com.fiap.contatos.repository.ContatoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import br.com.fiap.contatos.model.Contato;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired  //instanciando a classe repository

    private ContatoRepository contatoRepository;
    public ContatoExibicaoDto gravar(ContatoCadastroDto contatoCadastroDto) {
        // método que retorna qual foi o novo contato incluido no backend

        Contato contato = new Contato();
        BeanUtils.copyProperties(contatoCadastroDto, contato);
        // copiando as propriedades de contatoCadastroDTO para contato
        // isso é necessário pois o Repository utiliza o objeto "contatos" para
        // a persistência de dados
        return new ContatoExibicaoDto(contatoRepository.save(contato));
    }

    public ContatoExibicaoDto buscarPorId(Long id){
        //ao invés de chamar o próprio Contato, chamamos o DTO pois não contém dados sensíveis
        // do usuário

        Optional<Contato> contatoOptional = contatoRepository.findById(id);
        // definindo que o contato pode ter valores nulos com o Optional

        if(contatoOptional.isPresent()) {
            return new ContatoExibicaoDto(contatoOptional.get());
            // caso o objeto exista, vamos instanciar um novo DTO
            // com os dados requeridos pelo construtor, para assim retornar na api

        }else {
            throw new RuntimeException("Contato não encontrado!");
        }
    }

    public List<Contato> listarTodosContatos() {
        return contatoRepository.findAll();
    }

    public void excluir(Long id){

        Optional<Contato> contatoOptional = contatoRepository.findById(id);

        if(contatoOptional.isPresent()) {
            contatoRepository.delete(contatoOptional.get());
        }else {
            throw new RuntimeException("Contato não encontrado!");
        }
    }

    public  List<Contato> mostrarAniversariantes(LocalDate dataInicial, LocalDate dataFinal) {
        return contatoRepository.findByDataNascBetween(dataInicial, dataFinal);
    }

    public Contato atualizar(Contato contato) {

        Optional<Contato> contatoOptional = contatoRepository.findById(contato.getId());

        if(contatoOptional.isPresent()) {
            return contatoRepository.save(contato);
        }else {
            throw new RuntimeException("Contato não encontrado!");
        }
    }

    public Contato buscarPeloNome (String nome) {
        Optional<Contato> contatoOptional = contatoRepository.findByNome(nome);

        if(contatoOptional.isPresent()) {
            return contatoOptional.get();
        }else {
            throw new RuntimeException("Contato não encontrado!");
        }
    }
}
