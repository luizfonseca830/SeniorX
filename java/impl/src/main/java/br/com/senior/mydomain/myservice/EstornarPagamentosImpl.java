package br.com.senior.mydomain.myservice;

import br.com.senior.EventPublisher;
import br.com.senior.messaging.model.HandlerImpl;

import java.util.ArrayList;
import java.util.List;

@HandlerImpl
public class EstornarPagamentosImpl implements EstornarPagamentos {
    @Override
    public void estornarPagamentos(EstornarPagamentosInput payload) {
        payload.ingressos.forEach(i -> {
            System.out.println("Enviando codigo " + i);
            final PagamentoEstornadoPayload payloadEvento = new PagamentoEstornadoPayload();
            payloadEvento.codigoIngresso = i;

            EventPublisher.publish(MyServiceConstants.Events.PAGAMENTO_ESTORNADO, payloadEvento);
        });
    }
}
