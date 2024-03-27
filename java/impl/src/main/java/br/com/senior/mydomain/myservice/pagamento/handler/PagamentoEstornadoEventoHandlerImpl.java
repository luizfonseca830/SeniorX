package br.com.senior.mydomain.myservice.pagamento.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.PagamentoEstornado;
import br.com.senior.mydomain.myservice.PagamentoEstornadoPayload;

@HandlerImpl
public class PagamentoEstornadoEventoHandlerImpl implements PagamentoEstornado {
    @Override
    public void pagamentoEstornado(PagamentoEstornadoPayload payload) {
        System.out.println("Pagamento estornado para o ingresso " + payload.codigoIngresso);
    }
}
