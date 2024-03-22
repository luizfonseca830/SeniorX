package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class CadastrarConvidadoImpl implements CadastrarConvidado {

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
