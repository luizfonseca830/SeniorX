package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @Transactional
    public ConvidadoEntity updateNomeById(String nome, String id) {

        convidadoRepository.updateNomeById(nome, UUID.fromString(id));

        final Optional<ConvidadoEntity> convidadoOpt = convidadoRepository.findById(UUID.fromString(id));
        if (convidadoOpt.isPresent()) {
            return convidadoOpt.get();
        } else {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, "ID inválido");
        }
    }

    public String findNomeByIdCustom(String id) {
        return convidadoRepository.findNomeByIdCustom(id);
    }

}
