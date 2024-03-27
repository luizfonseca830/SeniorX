package br.com.senior.mydomain.myservice.evento.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.CancelarEvento;
import br.com.senior.mydomain.myservice.CancelarEventoInput;

@HandlerImpl
public class CancelarEventoHandlerImpl implements CancelarEvento {
    @Override
    public void cancelarEvento(CancelarEventoInput payload) {

        try {
            System.out.println("Evento será cancelado..");
            Thread.sleep(3000);
            System.out.println("Evento cancelado !");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
