package br.com.senior.mydomain.myservice.calculadora.handler;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.CalculadoraMultiplicacao;
import br.com.senior.mydomain.myservice.FieldCalculadora;
import br.com.senior.mydomain.myservice.FieldResultadoCalculadora;
import br.com.senior.mydomain.myservice.calculadora.CalculadoraService;

import javax.inject.Inject;

@HandlerImpl
public class MultiplicacaoHandleImpl implements CalculadoraMultiplicacao {
    @Inject
    CalculadoraService calculadoraService;
    @Override
    public FieldResultadoCalculadora calculadoraMultiplicacao(FieldCalculadora request) {
        final FieldResultadoCalculadora output = new FieldResultadoCalculadora();
        output.resultado = calculadoraService.multiplicacao(request.numero1, request.numero2);
        return output;
    }
}
