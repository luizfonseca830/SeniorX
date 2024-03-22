package br.com.senior.mydomain.myservice.impl;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.IngressoComprado;
import br.com.senior.mydomain.myservice.IngressoCompradoPayload;

@HandlerImpl
public class IngressoCompradoImpl implements IngressoComprado {

    @Override
    public void ingressoComprado(IngressoCompradoPayload payload) {
        System.out.println("Ingresso Comprado do Evento com sucesso!");
    }
}
