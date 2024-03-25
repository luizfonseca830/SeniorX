package br.com.senior.mydomain.myservice.calculadora;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.mydomain.myservice.CalculadoraSubtracao;
import br.com.senior.mydomain.myservice.FieldCalculadora;
import br.com.senior.mydomain.myservice.FieldResultadoCalculadora;

import javax.inject.Inject;

@HandlerImpl
public class SubtracaoHandleImpl implements CalculadoraSubtracao {

    @Inject
    CalculadoraService calculadoraService;
    @Override
    public FieldResultadoCalculadora calculadoraSubtracao(FieldCalculadora request) {
        final FieldResultadoCalculadora output = new FieldResultadoCalculadora();
        output.resultado = calculadoraService.subtracao(request.numero1, request.numero2);
        return output;
    }
}
