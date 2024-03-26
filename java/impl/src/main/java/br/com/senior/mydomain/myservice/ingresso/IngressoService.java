package br.com.senior.mydomain.myservice.ingresso;

import br.com.senior.mydomain.myservice.GetIdsByNomeConvidadoInput;
import br.com.senior.mydomain.myservice.IngressoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@Service
public class IngressoService {
    @Inject
    private IngressoRepository ingressoRepository;

    public List<IngressoEntity> findByNomeConvidado(String nome) {
        return ingressoRepository.findByNomeConvidado(nome);
    }

    public List<UUID> getIdsByNomeConvidado(String nomeConvidado){
        return ingressoRepository.getIdsByNomeConvidado(nomeConvidado);
    }
}
