package br.com.senior.mydomain.myservice.calculadora.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.*;
import br.com.senior.mydomain.myservice.calculadora.CalculadoraService;

import javax.inject.Inject;

@HandlerImpl
public class AdicaoHandleImpl implements CalculadoraAdicao {

    @Inject
    CalculadoraService calculadoraService;
    @Override
    public FieldResultadoCalculadora calculadoraAdicao(FieldCalculadora request) {
        final FieldResultadoCalculadora output = new FieldResultadoCalculadora();
        output.resultado = calculadoraService.adicao(request.numero1, request.numero2);
       return output;

    }
}
