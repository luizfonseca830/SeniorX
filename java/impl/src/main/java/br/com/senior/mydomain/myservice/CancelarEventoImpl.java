package br.com.senior.mydomain.myservice;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class CancelarEventoImpl implements CancelarEvento{
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
