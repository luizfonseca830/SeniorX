package br.com.senior.mydomain.myservice.atracao;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class AtracaoService {
    @Inject
    AtracaoRepository atracaoRepository;

    public List<String> getAtracaoByNomeEvento(String nomeEvento){
        return atracaoRepository.getAtracaoByNomeEvento(nomeEvento);
    }
}
