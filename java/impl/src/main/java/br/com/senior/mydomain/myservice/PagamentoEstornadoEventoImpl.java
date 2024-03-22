package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

import java.util.List;

@HandlerImpl
public class PagamentoEstornadoEventoImpl implements PagamentoEstornado{
    @Override
    public void pagamentoEstornado(PagamentoEstornadoPayload payload) {
        System.out.println("Pagamento estornado para o ingresso " + payload.codigoIngresso);
    }
}
