package br.com.senior.mydomain.myservice.pagamento.handler;

import br.com.senior.EventPublisher;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.EstornarPagamentos;
import br.com.senior.mydomain.myservice.EstornarPagamentosInput;
import br.com.senior.mydomain.myservice.MyServiceConstants;
import br.com.senior.mydomain.myservice.PagamentoEstornadoPayload;

@HandlerImpl
public class EstornarPagamentosHandlerImpl implements EstornarPagamentos {
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
