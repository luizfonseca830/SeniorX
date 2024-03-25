package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.mydomain.myservice.ConvidadoEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ConvidadoService {
    @Inject
    private ConvidadoRepository convidadoRepository;

    public List<ConvidadoEntity> findByNomeContainingIgnoreCase(String nome) {
        return convidadoRepository.findByNomeContainingIgnoreCase(nome);
    }

    public List<ConvidadoEntity> findByNomeWithQuery(String nome) {
        return convidadoRepository.findByNomeWithQuery(nome);
    }

}
