package br.com.senior.mydomain.myservice.atracao;

import java.util.List;

public interface AtracaoRepositoryCustom {

    List<String> getAtracaoByNomeEvento(String nomeEvento);
}
