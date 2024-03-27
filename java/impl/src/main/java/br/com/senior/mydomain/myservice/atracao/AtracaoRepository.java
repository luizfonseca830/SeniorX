package br.com.senior.mydomain.myservice.atracao;

import br.com.senior.mydomain.myservice.AtracaoBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AtracaoRepository extends AtracaoBaseRepository, AtracaoRepositoryCustom {
}
