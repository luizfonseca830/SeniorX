package br.com.senior.mydomain.myservice.convidado.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;

@HandlerImpl
public class CadastrarConvidadoHandlerImpl implements CadastrarConvidado {

    @Override
    public CadastrarConvidadoOutput cadastrarConvidado(CadastrarConvidadoInput request) {

        FieldCadastroConvidado recordField = new FieldCadastroConvidado();
        recordField.nome = request.nome.nome;
        recordField.nomeSocial = request.nome.nomeSocial;

        final CadastrarConvidadoOutput output = new CadastrarConvidadoOutput();
        output.convidado = recordField;
        output.resultado = ResultadoCadastradoConvidado.CADASTRADO_NOVO;

        return output;
    }
}
