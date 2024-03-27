package br.com.senior.mydomain.myservice.ingresso;

import java.util.List;
import java.util.UUID;

interface IngressoCustomRepository {

    List<UUID> getIdsByNomeConvidado(String nomeConvidado);
}
