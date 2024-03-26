package br.com.senior.mydomain.myservice.convidado;

import java.util.List;
import java.util.UUID;

public interface ConvidadoRepositoryCustom {

    String findNomeByIdCustom(String id);

    List<UUID> getAllIds();

    void updateNomeSocialByNome(String nome, String nomeSocial);
}
