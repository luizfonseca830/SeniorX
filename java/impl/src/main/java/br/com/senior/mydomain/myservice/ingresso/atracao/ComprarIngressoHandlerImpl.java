package br.com.senior.mydomain.myservice.ingresso.atracao;

import br.com.senior.EventPublisher;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;

import java.util.Random;

@HandlerImpl
public class ComprarIngressoHandlerImpl implements ComprarIngresso {
    @Override
    public ComprarIngressoOutput comprarIngresso(ComprarIngressoInput request) {
        //Gere um código para o novo ingresso
        String codigoIngresso = Integer.toString(new Random().nextInt(100));

        //Salve a compra TODO não sera feito agora pois nao tem banco de dados

        //Emitir o evento de ingresso comprado
        //Basicamente é um dto como se fosse o input ou output
        IngressoCompradoPayload payload = new IngressoCompradoPayload();
        payload.codigoIngresso = codigoIngresso;

        EventPublisher.publish(MyServiceConstants.Events.INGRESSO_COMPRADO, payload);

        //Retorna o DTO da action
        ComprarIngressoOutput out = new ComprarIngressoOutput();
        out.codigoIngresso = codigoIngresso;

        return out;
    }
}
