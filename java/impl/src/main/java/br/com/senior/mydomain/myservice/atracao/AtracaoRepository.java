package br.com.senior.mydomain.myservice.atracao;

import br.com.senior.mydomain.myservice.AtracaoBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtracaoRepository extends AtracaoBaseRepository, AtracaoRepositoryCustom {
}
