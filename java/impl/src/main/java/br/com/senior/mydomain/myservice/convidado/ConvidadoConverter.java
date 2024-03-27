package br.com.senior.mydomain.myservice.convidado;

import br.com.senior.mydomain.myservice.Convidado;
import br.com.senior.mydomain.myservice.ConvidadoEntity;
import br.com.senior.mydomain.myservice.UpdateConvidadoNomeByIdOutput;
import org.springframework.stereotype.Service;

@Service
public class ConvidadoConverter {

    public UpdateConvidadoNomeByIdOutput toUpdateConvidadoNomeByIdOuput(ConvidadoEntity convidado){
        final UpdateConvidadoNomeByIdOutput output = new UpdateConvidadoNomeByIdOutput();
        output.id = convidado.getId().toString();
        output.nome = convidado.getNome();

        return output;
    }

    public Convidado toConvidado (ConvidadoEntity convidado){
        return new Convidado(
                convidado.getId().toString(), convidado.getNome(), convidado.getNomeSocial(),
                convidado.getCpf(), convidado.getDataNascimneto(), null
        );
    }
}
