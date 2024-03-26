/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import br.com.senior.messaging.*;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

import java.util.concurrent.CompletableFuture;


/**
* 
*/
@SuppressWarnings("deprecation") // To prevent warnings in generated code about known deprecated methods.
public class MyServiceStubImpl  implements MyServiceStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #MyServiceStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public MyServiceStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new br.com.senior.mydomain.myservice.InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public MyServiceStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método helloWorld
	 * This is a public operation
	 * 
	         Primitiva que retorna uma mensagem de olá com o nome do requisitante
	         Normalmente no campo who é informado seu próprio nome
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.HelloWorldImpl impl = new br.com.senior.mydomain.myservice.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * This is a public operation
	 * 
	         Primitiva que retorna uma mensagem de olá com o nome do requisitante
	         Normalmente no campo who é informado seu próprio nome
	 */
	@Override
	public void helloWorld(HelloWorldInput input) {
		br.com.senior.mydomain.myservice.impl.HelloWorldImpl impl = new br.com.senior.mydomain.myservice.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * This is a public operation
	 * 
	         Primitiva que retorna uma mensagem de olá com o nome do requisitante
	         Normalmente no campo who é informado seu próprio nome
	 */
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		return this.helloWorldRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * This is a public operation
	 * 
	         Primitiva que retorna uma mensagem de olá com o nome do requisitante
	         Normalmente no campo who é informado seu próprio nome
	*/
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.HelloWorldImpl impl = new br.com.senior.mydomain.myservice.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método calculadoraAdicao
	 * This is a public operation
	 * Realiza a operação matematica de adição
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FieldResultadoCalculadora calculadoraAdicao(FieldCalculadora input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CalculadoraAdicaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraAdicaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.calculadoraAdicao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraAdicao
	 * This is a public operation
	 * Realiza a operação matematica de adição
	 */
	@Override
	public void calculadoraAdicao(FieldCalculadora input) {
		br.com.senior.mydomain.myservice.impl.CalculadoraAdicaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraAdicaoImpl(messengerSupplier, userId, messageSupplier);
		impl.calculadoraAdicao(input);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraAdicao
	 * This is a public operation
	 * Realiza a operação matematica de adição
	 */
	@Override
	public CompletableFuture<FieldResultadoCalculadora> calculadoraAdicaoRequest(FieldCalculadora input) {
		return this.calculadoraAdicaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraAdicao
	 * This is a public operation
	 * Realiza a operação matematica de adição
	*/
	@Override
	public CompletableFuture<FieldResultadoCalculadora> calculadoraAdicaoRequest(FieldCalculadora input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CalculadoraAdicaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraAdicaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.calculadoraAdicaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método calculadoraSubtracao
	 * This is a public operation
	 * Realiza a operação matematica de subtração
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FieldResultadoCalculadora calculadoraSubtracao(FieldCalculadora input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CalculadoraSubtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraSubtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.calculadoraSubtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraSubtracao
	 * This is a public operation
	 * Realiza a operação matematica de subtração
	 */
	@Override
	public void calculadoraSubtracao(FieldCalculadora input) {
		br.com.senior.mydomain.myservice.impl.CalculadoraSubtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraSubtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.calculadoraSubtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraSubtracao
	 * This is a public operation
	 * Realiza a operação matematica de subtração
	 */
	@Override
	public CompletableFuture<FieldResultadoCalculadora> calculadoraSubtracaoRequest(FieldCalculadora input) {
		return this.calculadoraSubtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraSubtracao
	 * This is a public operation
	 * Realiza a operação matematica de subtração
	*/
	@Override
	public CompletableFuture<FieldResultadoCalculadora> calculadoraSubtracaoRequest(FieldCalculadora input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CalculadoraSubtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraSubtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.calculadoraSubtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método calculadoraMultiplicacao
	 * This is a public operation
	 * Realiza a operação matematica de multiplicação
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FieldResultadoCalculadora calculadoraMultiplicacao(FieldCalculadora input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CalculadoraMultiplicacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraMultiplicacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.calculadoraMultiplicacao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraMultiplicacao
	 * This is a public operation
	 * Realiza a operação matematica de multiplicação
	 */
	@Override
	public void calculadoraMultiplicacao(FieldCalculadora input) {
		br.com.senior.mydomain.myservice.impl.CalculadoraMultiplicacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraMultiplicacaoImpl(messengerSupplier, userId, messageSupplier);
		impl.calculadoraMultiplicacao(input);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraMultiplicacao
	 * This is a public operation
	 * Realiza a operação matematica de multiplicação
	 */
	@Override
	public CompletableFuture<FieldResultadoCalculadora> calculadoraMultiplicacaoRequest(FieldCalculadora input) {
		return this.calculadoraMultiplicacaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraMultiplicacao
	 * This is a public operation
	 * Realiza a operação matematica de multiplicação
	*/
	@Override
	public CompletableFuture<FieldResultadoCalculadora> calculadoraMultiplicacaoRequest(FieldCalculadora input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CalculadoraMultiplicacaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraMultiplicacaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.calculadoraMultiplicacaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método calculadoraDivisao
	 * This is a public operation
	 * Realiza a operação matematica de divisão
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FieldResultadoCalculadora calculadoraDivisao(FieldCalculadora input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CalculadoraDivisaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraDivisaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.calculadoraDivisao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraDivisao
	 * This is a public operation
	 * Realiza a operação matematica de divisão
	 */
	@Override
	public void calculadoraDivisao(FieldCalculadora input) {
		br.com.senior.mydomain.myservice.impl.CalculadoraDivisaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraDivisaoImpl(messengerSupplier, userId, messageSupplier);
		impl.calculadoraDivisao(input);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraDivisao
	 * This is a public operation
	 * Realiza a operação matematica de divisão
	 */
	@Override
	public CompletableFuture<FieldResultadoCalculadora> calculadoraDivisaoRequest(FieldCalculadora input) {
		return this.calculadoraDivisaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método calculadoraDivisao
	 * This is a public operation
	 * Realiza a operação matematica de divisão
	*/
	@Override
	public CompletableFuture<FieldResultadoCalculadora> calculadoraDivisaoRequest(FieldCalculadora input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CalculadoraDivisaoImpl impl = new br.com.senior.mydomain.myservice.impl.CalculadoraDivisaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.calculadoraDivisaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findBynome
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindBynomeOutput findBynome(FindBynomeInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindBynomeImpl impl = new br.com.senior.mydomain.myservice.impl.FindBynomeImpl(messengerSupplier, userId, messageSupplier);
		return impl.findBynome(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findBynome
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void findBynome(FindBynomeInput input) {
		br.com.senior.mydomain.myservice.impl.FindBynomeImpl impl = new br.com.senior.mydomain.myservice.impl.FindBynomeImpl(messengerSupplier, userId, messageSupplier);
		impl.findBynome(input);
	}
	
	/**
	 * Chamada assíncrona para o método findBynome
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<FindBynomeOutput> findBynomeRequest(FindBynomeInput input) {
		return this.findBynomeRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findBynome
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<FindBynomeOutput> findBynomeRequest(FindBynomeInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindBynomeImpl impl = new br.com.senior.mydomain.myservice.impl.FindBynomeImpl(messengerSupplier, userId, messageSupplier);
		return impl.findBynomeRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findIngressoBynomeConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindIngressoBynomeConvidadoOutput findIngressoBynomeConvidado(FindIngressoBynomeConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindIngressoBynomeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.FindIngressoBynomeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.findIngressoBynomeConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findIngressoBynomeConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void findIngressoBynomeConvidado(FindIngressoBynomeConvidadoInput input) {
		br.com.senior.mydomain.myservice.impl.FindIngressoBynomeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.FindIngressoBynomeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.findIngressoBynomeConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método findIngressoBynomeConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<FindIngressoBynomeConvidadoOutput> findIngressoBynomeConvidadoRequest(FindIngressoBynomeConvidadoInput input) {
		return this.findIngressoBynomeConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findIngressoBynomeConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<FindIngressoBynomeConvidadoOutput> findIngressoBynomeConvidadoRequest(FindIngressoBynomeConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindIngressoBynomeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.FindIngressoBynomeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.findIngressoBynomeConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método findNomeByIdCustom
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public FindNomeByIdCustomOutput findNomeByIdCustom(FindNomeByIdCustomInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindNomeByIdCustomImpl impl = new br.com.senior.mydomain.myservice.impl.FindNomeByIdCustomImpl(messengerSupplier, userId, messageSupplier);
		return impl.findNomeByIdCustom(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método findNomeByIdCustom
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void findNomeByIdCustom(FindNomeByIdCustomInput input) {
		br.com.senior.mydomain.myservice.impl.FindNomeByIdCustomImpl impl = new br.com.senior.mydomain.myservice.impl.FindNomeByIdCustomImpl(messengerSupplier, userId, messageSupplier);
		impl.findNomeByIdCustom(input);
	}
	
	/**
	 * Chamada assíncrona para o método findNomeByIdCustom
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<FindNomeByIdCustomOutput> findNomeByIdCustomRequest(FindNomeByIdCustomInput input) {
		return this.findNomeByIdCustomRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método findNomeByIdCustom
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<FindNomeByIdCustomOutput> findNomeByIdCustomRequest(FindNomeByIdCustomInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.FindNomeByIdCustomImpl impl = new br.com.senior.mydomain.myservice.impl.FindNomeByIdCustomImpl(messengerSupplier, userId, messageSupplier);
		return impl.findNomeByIdCustomRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getAllConvidados
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetAllConvidadosOutput getAllConvidados(GetAllConvidadosInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetAllConvidadosImpl impl = new br.com.senior.mydomain.myservice.impl.GetAllConvidadosImpl(messengerSupplier, userId, messageSupplier);
		return impl.getAllConvidados(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getAllConvidados
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void getAllConvidados(GetAllConvidadosInput input) {
		br.com.senior.mydomain.myservice.impl.GetAllConvidadosImpl impl = new br.com.senior.mydomain.myservice.impl.GetAllConvidadosImpl(messengerSupplier, userId, messageSupplier);
		impl.getAllConvidados(input);
	}
	
	/**
	 * Chamada assíncrona para o método getAllConvidados
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<GetAllConvidadosOutput> getAllConvidadosRequest(GetAllConvidadosInput input) {
		return this.getAllConvidadosRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método getAllConvidados
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<GetAllConvidadosOutput> getAllConvidadosRequest(GetAllConvidadosInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetAllConvidadosImpl impl = new br.com.senior.mydomain.myservice.impl.GetAllConvidadosImpl(messengerSupplier, userId, messageSupplier);
		return impl.getAllConvidadosRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getConvidadosByCpf
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetConvidadosByCpfOutput getConvidadosByCpf(GetConvidadosByCpfInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetConvidadosByCpfImpl impl = new br.com.senior.mydomain.myservice.impl.GetConvidadosByCpfImpl(messengerSupplier, userId, messageSupplier);
		return impl.getConvidadosByCpf(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getConvidadosByCpf
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void getConvidadosByCpf(GetConvidadosByCpfInput input) {
		br.com.senior.mydomain.myservice.impl.GetConvidadosByCpfImpl impl = new br.com.senior.mydomain.myservice.impl.GetConvidadosByCpfImpl(messengerSupplier, userId, messageSupplier);
		impl.getConvidadosByCpf(input);
	}
	
	/**
	 * Chamada assíncrona para o método getConvidadosByCpf
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<GetConvidadosByCpfOutput> getConvidadosByCpfRequest(GetConvidadosByCpfInput input) {
		return this.getConvidadosByCpfRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método getConvidadosByCpf
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<GetConvidadosByCpfOutput> getConvidadosByCpfRequest(GetConvidadosByCpfInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetConvidadosByCpfImpl impl = new br.com.senior.mydomain.myservice.impl.GetConvidadosByCpfImpl(messengerSupplier, userId, messageSupplier);
		return impl.getConvidadosByCpfRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getIdsByNomeConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetIdsByNomeConvidadoOutput getIdsByNomeConvidado(GetIdsByNomeConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetIdsByNomeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.GetIdsByNomeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getIdsByNomeConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getIdsByNomeConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void getIdsByNomeConvidado(GetIdsByNomeConvidadoInput input) {
		br.com.senior.mydomain.myservice.impl.GetIdsByNomeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.GetIdsByNomeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.getIdsByNomeConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método getIdsByNomeConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<GetIdsByNomeConvidadoOutput> getIdsByNomeConvidadoRequest(GetIdsByNomeConvidadoInput input) {
		return this.getIdsByNomeConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método getIdsByNomeConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<GetIdsByNomeConvidadoOutput> getIdsByNomeConvidadoRequest(GetIdsByNomeConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetIdsByNomeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.GetIdsByNomeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getIdsByNomeConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getAtracaoByNomeEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetAtracaoByNomeEventoOutput getAtracaoByNomeEvento(GetAtracaoByNomeEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetAtracaoByNomeEventoImpl impl = new br.com.senior.mydomain.myservice.impl.GetAtracaoByNomeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getAtracaoByNomeEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getAtracaoByNomeEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void getAtracaoByNomeEvento(GetAtracaoByNomeEventoInput input) {
		br.com.senior.mydomain.myservice.impl.GetAtracaoByNomeEventoImpl impl = new br.com.senior.mydomain.myservice.impl.GetAtracaoByNomeEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.getAtracaoByNomeEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método getAtracaoByNomeEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<GetAtracaoByNomeEventoOutput> getAtracaoByNomeEventoRequest(GetAtracaoByNomeEventoInput input) {
		return this.getAtracaoByNomeEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método getAtracaoByNomeEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<GetAtracaoByNomeEventoOutput> getAtracaoByNomeEventoRequest(GetAtracaoByNomeEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetAtracaoByNomeEventoImpl impl = new br.com.senior.mydomain.myservice.impl.GetAtracaoByNomeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getAtracaoByNomeEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateConvidadoNomeById
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public UpdateConvidadoNomeByIdOutput updateConvidadoNomeById(UpdateConvidadoNomeByIdInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeByIdImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeByIdImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateConvidadoNomeById(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateConvidadoNomeById
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void updateConvidadoNomeById(UpdateConvidadoNomeByIdInput input) {
		br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeByIdImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeByIdImpl(messengerSupplier, userId, messageSupplier);
		impl.updateConvidadoNomeById(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateConvidadoNomeById
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<UpdateConvidadoNomeByIdOutput> updateConvidadoNomeByIdRequest(UpdateConvidadoNomeByIdInput input) {
		return this.updateConvidadoNomeByIdRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateConvidadoNomeById
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<UpdateConvidadoNomeByIdOutput> updateConvidadoNomeByIdRequest(UpdateConvidadoNomeByIdInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeByIdImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeByIdImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateConvidadoNomeByIdRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateConvidadoNomeSocialByNome
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public UpdateConvidadoNomeSocialByNomeOutput updateConvidadoNomeSocialByNome(UpdateConvidadoNomeSocialByNomeInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeSocialByNomeImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeSocialByNomeImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateConvidadoNomeSocialByNome(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateConvidadoNomeSocialByNome
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void updateConvidadoNomeSocialByNome(UpdateConvidadoNomeSocialByNomeInput input) {
		br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeSocialByNomeImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeSocialByNomeImpl(messengerSupplier, userId, messageSupplier);
		impl.updateConvidadoNomeSocialByNome(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateConvidadoNomeSocialByNome
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<UpdateConvidadoNomeSocialByNomeOutput> updateConvidadoNomeSocialByNomeRequest(UpdateConvidadoNomeSocialByNomeInput input) {
		return this.updateConvidadoNomeSocialByNomeRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateConvidadoNomeSocialByNome
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<UpdateConvidadoNomeSocialByNomeOutput> updateConvidadoNomeSocialByNomeRequest(UpdateConvidadoNomeSocialByNomeInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeSocialByNomeImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateConvidadoNomeSocialByNomeImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateConvidadoNomeSocialByNomeRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método cadastrarEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastra um novo evento (ex: SeniorTec, Casamento, Aniversário, etc)
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public RetornoCadastrarEvento cadastrarEvento(CadastrarEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CadastrarEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CadastrarEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.cadastrarEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método cadastrarEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastra um novo evento (ex: SeniorTec, Casamento, Aniversário, etc)
	 */
	@Override
	public void cadastrarEvento(CadastrarEventoInput input) {
		br.com.senior.mydomain.myservice.impl.CadastrarEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CadastrarEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.cadastrarEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método cadastrarEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastra um novo evento (ex: SeniorTec, Casamento, Aniversário, etc)
	 */
	@Override
	public CompletableFuture<RetornoCadastrarEvento> cadastrarEventoRequest(CadastrarEventoInput input) {
		return this.cadastrarEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método cadastrarEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastra um novo evento (ex: SeniorTec, Casamento, Aniversário, etc)
	*/
	@Override
	public CompletableFuture<RetornoCadastrarEvento> cadastrarEventoRequest(CadastrarEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CadastrarEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CadastrarEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.cadastrarEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método cadastrarConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastrar um novo convidado e acompanhantes
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CadastrarConvidadoOutput cadastrarConvidado(CadastrarConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CadastrarConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CadastrarConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.cadastrarConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método cadastrarConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastrar um novo convidado e acompanhantes
	 */
	@Override
	public void cadastrarConvidado(CadastrarConvidadoInput input) {
		br.com.senior.mydomain.myservice.impl.CadastrarConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CadastrarConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.cadastrarConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método cadastrarConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastrar um novo convidado e acompanhantes
	 */
	@Override
	public CompletableFuture<CadastrarConvidadoOutput> cadastrarConvidadoRequest(CadastrarConvidadoInput input) {
		return this.cadastrarConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método cadastrarConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastrar um novo convidado e acompanhantes
	*/
	@Override
	public CompletableFuture<CadastrarConvidadoOutput> cadastrarConvidadoRequest(CadastrarConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CadastrarConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CadastrarConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.cadastrarConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método comprarIngresso
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ComprarIngressoOutput comprarIngresso(ComprarIngressoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ComprarIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.ComprarIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.comprarIngresso(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método comprarIngresso
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void comprarIngresso(ComprarIngressoInput input) {
		br.com.senior.mydomain.myservice.impl.ComprarIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.ComprarIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.comprarIngresso(input);
	}
	
	/**
	 * Chamada assíncrona para o método comprarIngresso
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ComprarIngressoOutput> comprarIngressoRequest(ComprarIngressoInput input) {
		return this.comprarIngressoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método comprarIngresso
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ComprarIngressoOutput> comprarIngressoRequest(ComprarIngressoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ComprarIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.ComprarIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.comprarIngressoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetMetadataImpl impl = new br.com.senior.mydomain.myservice.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.mydomain.myservice.impl.GetMetadataImpl impl = new br.com.senior.mydomain.myservice.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		return this.getMetadataRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	*/
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.GetMetadataImpl impl = new br.com.senior.mydomain.myservice.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método importConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportConvidadoOutput importConvidado(ImportConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void importConvidado(ImportConvidadoInput input) {
		br.com.senior.mydomain.myservice.impl.ImportConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.importConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método importConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ImportConvidadoOutput> importConvidadoRequest(ImportConvidadoInput input) {
		return this.importConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método importConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ImportConvidadoOutput> importConvidadoRequest(ImportConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método exportConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportConvidadoOutput exportConvidado(ExportConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void exportConvidado(ExportConvidadoInput input) {
		br.com.senior.mydomain.myservice.impl.ExportConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ExportConvidadoOutput> exportConvidadoRequest(ExportConvidadoInput input) {
		return this.exportConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método exportConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ExportConvidadoOutput> exportConvidadoRequest(ExportConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método importEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportEventoOutput importEvento(ImportEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportEventoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void importEvento(ImportEventoInput input) {
		br.com.senior.mydomain.myservice.impl.ImportEventoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.importEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método importEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ImportEventoOutput> importEventoRequest(ImportEventoInput input) {
		return this.importEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método importEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ImportEventoOutput> importEventoRequest(ImportEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportEventoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método exportEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportEventoOutput exportEvento(ExportEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportEventoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void exportEvento(ExportEventoInput input) {
		br.com.senior.mydomain.myservice.impl.ExportEventoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ExportEventoOutput> exportEventoRequest(ExportEventoInput input) {
		return this.exportEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método exportEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ExportEventoOutput> exportEventoRequest(ExportEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportEventoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método importAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportAtracaoOutput importAtracao(ImportAtracaoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void importAtracao(ImportAtracaoInput input) {
		br.com.senior.mydomain.myservice.impl.ImportAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.importAtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método importAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ImportAtracaoOutput> importAtracaoRequest(ImportAtracaoInput input) {
		return this.importAtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método importAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ImportAtracaoOutput> importAtracaoRequest(ImportAtracaoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ImportAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.ImportAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método exportAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportAtracaoOutput exportAtracao(ExportAtracaoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void exportAtracao(ExportAtracaoInput input) {
		br.com.senior.mydomain.myservice.impl.ExportAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportAtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<ExportAtracaoOutput> exportAtracaoRequest(ExportAtracaoInput input) {
		return this.exportAtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método exportAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	*/
	@Override
	public CompletableFuture<ExportAtracaoOutput> exportAtracaoRequest(ExportAtracaoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ExportAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.ExportAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.mydomain.myservice.impl.GetDependenciesImpl impl = new br.com.senior.mydomain.myservice.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.mydomain.myservice.impl.GetDependenciesImpl impl = new br.com.senior.mydomain.myservice.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		return this.getDependenciesRequest(0l);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	*/
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest(long timeout) {
		br.com.senior.mydomain.myservice.impl.GetDependenciesImpl impl = new br.com.senior.mydomain.myservice.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest(timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createConvidado
	 * This is a public operation
	 * The 'create' request primitive for the Convidado entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Convidado createConvidado(Convidado input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createConvidado
	 * This is a public operation
	 * The 'create' request primitive for the Convidado entity.
	 */
	@Override
	public void createConvidado(Convidado input) {
		br.com.senior.mydomain.myservice.impl.CreateConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.createConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método createConvidado
	 * This is a public operation
	 * The 'create' request primitive for the Convidado entity.
	 */
	@Override
	public CompletableFuture<Convidado> createConvidadoRequest(Convidado input) {
		return this.createConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createConvidado
	 * This is a public operation
	 * The 'create' request primitive for the Convidado entity.
	*/
	@Override
	public CompletableFuture<Convidado> createConvidadoRequest(Convidado input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkConvidado
	 * This is a public operation
	 * The 'createBulk' request primitive for the Convidado entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkConvidadoOutput createBulkConvidado(CreateBulkConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkConvidado
	 * This is a public operation
	 * The 'createBulk' request primitive for the Convidado entity.
	 */
	@Override
	public void createBulkConvidado(CreateBulkConvidadoInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkConvidado
	 * This is a public operation
	 * The 'createBulk' request primitive for the Convidado entity.
	 */
	@Override
	public CompletableFuture<CreateBulkConvidadoOutput> createBulkConvidadoRequest(CreateBulkConvidadoInput input) {
		return this.createBulkConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkConvidado
	 * This is a public operation
	 * The 'createBulk' request primitive for the Convidado entity.
	*/
	@Override
	public CompletableFuture<CreateBulkConvidadoOutput> createBulkConvidadoRequest(CreateBulkConvidadoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeConvidado
	 * This is a public operation
	 * The 'createMerge' request primitive for the Convidado entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Convidado createMergeConvidado(Convidado input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeConvidado
	 * This is a public operation
	 * The 'createMerge' request primitive for the Convidado entity.
	 */
	@Override
	public void createMergeConvidado(Convidado input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeConvidado
	 * This is a public operation
	 * The 'createMerge' request primitive for the Convidado entity.
	 */
	@Override
	public CompletableFuture<Convidado> createMergeConvidadoRequest(Convidado input) {
		return this.createMergeConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeConvidado
	 * This is a public operation
	 * The 'createMerge' request primitive for the Convidado entity.
	*/
	@Override
	public CompletableFuture<Convidado> createMergeConvidadoRequest(Convidado input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveConvidado
	 * This is a public operation
	 * The 'retrieve' request primitive for the Convidado entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Convidado retrieveConvidado(Convidado.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveConvidado
	 * This is a public operation
	 * The 'retrieve' request primitive for the Convidado entity.
	 */
	@Override
	public void retrieveConvidado(Convidado.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveConvidado
	 * This is a public operation
	 * The 'retrieve' request primitive for the Convidado entity.
	 */
	@Override
	public CompletableFuture<Convidado> retrieveConvidadoRequest(Convidado.GetRequest input) {
		return this.retrieveConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveConvidado
	 * This is a public operation
	 * The 'retrieve' request primitive for the Convidado entity.
	*/
	@Override
	public CompletableFuture<Convidado> retrieveConvidadoRequest(Convidado.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Convidado entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Convidado.PagedResults listConvidado(Convidado.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.ListConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Convidado entity.
	 */
	@Override
	public void listConvidado(Convidado.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.ListConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.listConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método listConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Convidado entity.
	 */
	@Override
	public CompletableFuture<Convidado.PagedResults> listConvidadoRequest(Convidado.PageRequest input) {
		return this.listConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listConvidado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Convidado entity.
	*/
	@Override
	public CompletableFuture<Convidado.PagedResults> listConvidadoRequest(Convidado.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.ListConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateConvidado
	 * This is a public operation
	 * The 'update' request primitive for the Convidado entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Convidado updateConvidado(Convidado input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateConvidado
	 * This is a public operation
	 * The 'update' request primitive for the Convidado entity.
	 */
	@Override
	public void updateConvidado(Convidado input) {
		br.com.senior.mydomain.myservice.impl.UpdateConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateConvidado
	 * This is a public operation
	 * The 'update' request primitive for the Convidado entity.
	 */
	@Override
	public CompletableFuture<Convidado> updateConvidadoRequest(Convidado input) {
		return this.updateConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateConvidado
	 * This is a public operation
	 * The 'update' request primitive for the Convidado entity.
	*/
	@Override
	public CompletableFuture<Convidado> updateConvidadoRequest(Convidado input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeConvidado
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Convidado entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Convidado updateMergeConvidado(Convidado input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeConvidado
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Convidado entity.
	 */
	@Override
	public void updateMergeConvidado(Convidado input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeConvidado(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeConvidado
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Convidado entity.
	 */
	@Override
	public CompletableFuture<Convidado> updateMergeConvidadoRequest(Convidado input) {
		return this.updateMergeConvidadoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeConvidado
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Convidado entity.
	*/
	@Override
	public CompletableFuture<Convidado> updateMergeConvidadoRequest(Convidado input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeConvidadoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeConvidadoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteConvidado
	 * This is a public operation
	 * The 'delete' request primitive for the Convidado entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteConvidado(Convidado.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteConvidado(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteConvidado
	 * This is a public operation
	 * The 'delete' request primitive for the Convidado entity.
	 */
	@Override
	public void deleteConvidado(Convidado.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteConvidadoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteConvidadoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteConvidado(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createEvento
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento createEvento(Evento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createEvento
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 */
	@Override
	public void createEvento(Evento input) {
		br.com.senior.mydomain.myservice.impl.CreateEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.createEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createEvento
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> createEventoRequest(Evento input) {
		return this.createEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createEvento
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	*/
	@Override
	public CompletableFuture<Evento> createEventoRequest(Evento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkEvento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkEventoOutput createBulkEvento(CreateBulkEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkEvento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 */
	@Override
	public void createBulkEvento(CreateBulkEventoInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkEvento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<CreateBulkEventoOutput> createBulkEventoRequest(CreateBulkEventoInput input) {
		return this.createBulkEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkEvento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	*/
	@Override
	public CompletableFuture<CreateBulkEventoOutput> createBulkEventoRequest(CreateBulkEventoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeEvento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento createMergeEvento(Evento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEvento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 */
	@Override
	public void createMergeEvento(Evento input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEvento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> createMergeEventoRequest(Evento input) {
		return this.createMergeEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEvento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	*/
	@Override
	public CompletableFuture<Evento> createMergeEventoRequest(Evento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeEventoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveEvento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento retrieveEvento(Evento.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveEventoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEvento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 */
	@Override
	public void retrieveEvento(Evento.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveEventoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEvento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> retrieveEventoRequest(Evento.GetRequest input) {
		return this.retrieveEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEvento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	*/
	@Override
	public CompletableFuture<Evento> retrieveEventoRequest(Evento.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveEventoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento.PagedResults listEvento(Evento.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListEventoImpl impl = new br.com.senior.mydomain.myservice.impl.ListEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Evento entity.
	 */
	@Override
	public void listEvento(Evento.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListEventoImpl impl = new br.com.senior.mydomain.myservice.impl.ListEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.listEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método listEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento.PagedResults> listEventoRequest(Evento.PageRequest input) {
		return this.listEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Evento entity.
	*/
	@Override
	public CompletableFuture<Evento.PagedResults> listEventoRequest(Evento.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListEventoImpl impl = new br.com.senior.mydomain.myservice.impl.ListEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateEvento
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento updateEvento(Evento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateEventoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateEvento
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 */
	@Override
	public void updateEvento(Evento input) {
		br.com.senior.mydomain.myservice.impl.UpdateEventoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateEvento
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> updateEventoRequest(Evento input) {
		return this.updateEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateEvento
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	*/
	@Override
	public CompletableFuture<Evento> updateEventoRequest(Evento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateEventoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeEvento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Evento updateMergeEvento(Evento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeEventoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEvento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 */
	@Override
	public void updateMergeEvento(Evento input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeEventoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeEvento(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEvento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 */
	@Override
	public CompletableFuture<Evento> updateMergeEventoRequest(Evento input) {
		return this.updateMergeEventoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEvento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	*/
	@Override
	public CompletableFuture<Evento> updateMergeEventoRequest(Evento input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeEventoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeEventoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeEventoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteEvento
	 * This is a public operation
	 * The 'delete' request primitive for the Evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteEvento(Evento.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteEventoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteEvento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteEvento
	 * This is a public operation
	 * The 'delete' request primitive for the Evento entity.
	 */
	@Override
	public void deleteEvento(Evento.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteEventoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteEventoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteEvento(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso createEvento_Ingressos(Evento.Id parentId, Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.createEvento_Ingressos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public void createEvento_Ingressos(Evento.Id parentId, Ingresso input) {
		br.com.senior.mydomain.myservice.impl.CreateEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		impl.createEvento_Ingressos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método createEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public CompletableFuture<Ingresso> createEvento_IngressosRequest(Evento.Id parentId, Ingresso input) {
		return this.createEvento_IngressosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	*/
	@Override
	public CompletableFuture<Ingresso> createEvento_IngressosRequest(Evento.Id parentId, Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.createEvento_IngressosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso createMergeEvento_Ingressos(Evento.Id parentId, Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeEvento_Ingressos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public void createMergeEvento_Ingressos(Evento.Id parentId, Ingresso input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeEvento_Ingressos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public CompletableFuture<Ingresso> createMergeEvento_IngressosRequest(Evento.Id parentId, Ingresso input) {
		return this.createMergeEvento_IngressosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	*/
	@Override
	public CompletableFuture<Ingresso> createMergeEvento_IngressosRequest(Evento.Id parentId, Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeEvento_IngressosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso updateEvento_Ingressos(Evento.Id parentId, Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateEvento_Ingressos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public void updateEvento_Ingressos(Evento.Id parentId, Ingresso input) {
		br.com.senior.mydomain.myservice.impl.UpdateEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		impl.updateEvento_Ingressos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método updateEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public CompletableFuture<Ingresso> updateEvento_IngressosRequest(Evento.Id parentId, Ingresso input) {
		return this.updateEvento_IngressosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	*/
	@Override
	public CompletableFuture<Ingresso> updateEvento_IngressosRequest(Evento.Id parentId, Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateEvento_IngressosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso updateMergeEvento_Ingressos(Evento.Id parentId, Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeEvento_Ingressos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public void updateMergeEvento_Ingressos(Evento.Id parentId, Ingresso input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeEvento_Ingressos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public CompletableFuture<Ingresso> updateMergeEvento_IngressosRequest(Evento.Id parentId, Ingresso input) {
		return this.updateMergeEvento_IngressosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	*/
	@Override
	public CompletableFuture<Ingresso> updateMergeEvento_IngressosRequest(Evento.Id parentId, Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeEvento_IngressosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso retrieveEvento_Ingressos(Evento.Id parentId, Ingresso.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveEvento_Ingressos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public void retrieveEvento_Ingressos(Evento.Id parentId, Ingresso.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveEvento_Ingressos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public CompletableFuture<Ingresso> retrieveEvento_IngressosRequest(Evento.Id parentId, Ingresso.GetRequest input) {
		return this.retrieveEvento_IngressosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	*/
	@Override
	public CompletableFuture<Ingresso> retrieveEvento_IngressosRequest(Evento.Id parentId, Ingresso.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveEvento_IngressosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteEvento_Ingressos(Evento.Id parentId, Ingresso.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteEvento_Ingressos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public void deleteEvento_Ingressos(Evento.Id parentId, Ingresso.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteEvento_Ingressos(parentId, input);
	}
	
	
	/**
	 * Chamada síncrona para o método listEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso.PagedResults listEvento_Ingressos(Evento.Id parentId, Ingresso.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.ListEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.listEvento_Ingressos(parentId, input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public void listEvento_Ingressos(Evento.Id parentId, Ingresso.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.ListEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		impl.listEvento_Ingressos(parentId, input);
	}
	
	/**
	 * Chamada assíncrona para o método listEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 */
	@Override
	public CompletableFuture<Ingresso.PagedResults> listEvento_IngressosRequest(Evento.Id parentId, Ingresso.PageRequest input) {
		return this.listEvento_IngressosRequest(parentId, input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listEvento_Ingressos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	*/
	@Override
	public CompletableFuture<Ingresso.PagedResults> listEvento_IngressosRequest(Evento.Id parentId, Ingresso.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListEvento_IngressosImpl impl = new br.com.senior.mydomain.myservice.impl.ListEvento_IngressosImpl(messengerSupplier, userId, messageSupplier);
		return impl.listEvento_IngressosRequest(parentId, input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createIngresso
	 * This is a public operation
	 * The 'create' request primitive for the Ingresso entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso createIngresso(Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createIngresso(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createIngresso
	 * This is a public operation
	 * The 'create' request primitive for the Ingresso entity.
	 */
	@Override
	public void createIngresso(Ingresso input) {
		br.com.senior.mydomain.myservice.impl.CreateIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.createIngresso(input);
	}
	
	/**
	 * Chamada assíncrona para o método createIngresso
	 * This is a public operation
	 * The 'create' request primitive for the Ingresso entity.
	 */
	@Override
	public CompletableFuture<Ingresso> createIngressoRequest(Ingresso input) {
		return this.createIngressoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createIngresso
	 * This is a public operation
	 * The 'create' request primitive for the Ingresso entity.
	*/
	@Override
	public CompletableFuture<Ingresso> createIngressoRequest(Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createIngressoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkIngresso
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ingresso entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkIngressoOutput createBulkIngresso(CreateBulkIngressoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkIngresso(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkIngresso
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ingresso entity.
	 */
	@Override
	public void createBulkIngresso(CreateBulkIngressoInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkIngresso(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkIngresso
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ingresso entity.
	 */
	@Override
	public CompletableFuture<CreateBulkIngressoOutput> createBulkIngressoRequest(CreateBulkIngressoInput input) {
		return this.createBulkIngressoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkIngresso
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ingresso entity.
	*/
	@Override
	public CompletableFuture<CreateBulkIngressoOutput> createBulkIngressoRequest(CreateBulkIngressoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkIngressoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeIngresso
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ingresso entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso createMergeIngresso(Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeIngresso(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeIngresso
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ingresso entity.
	 */
	@Override
	public void createMergeIngresso(Ingresso input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeIngresso(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeIngresso
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ingresso entity.
	 */
	@Override
	public CompletableFuture<Ingresso> createMergeIngressoRequest(Ingresso input) {
		return this.createMergeIngressoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeIngresso
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ingresso entity.
	*/
	@Override
	public CompletableFuture<Ingresso> createMergeIngressoRequest(Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeIngressoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveIngresso
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ingresso entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso retrieveIngresso(Ingresso.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveIngresso(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveIngresso
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ingresso entity.
	 */
	@Override
	public void retrieveIngresso(Ingresso.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveIngresso(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveIngresso
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ingresso entity.
	 */
	@Override
	public CompletableFuture<Ingresso> retrieveIngressoRequest(Ingresso.GetRequest input) {
		return this.retrieveIngressoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveIngresso
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ingresso entity.
	*/
	@Override
	public CompletableFuture<Ingresso> retrieveIngressoRequest(Ingresso.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveIngressoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listIngresso
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Ingresso entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso.PagedResults listIngresso(Ingresso.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.ListIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listIngresso(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listIngresso
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Ingresso entity.
	 */
	@Override
	public void listIngresso(Ingresso.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.ListIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.listIngresso(input);
	}
	
	/**
	 * Chamada assíncrona para o método listIngresso
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Ingresso entity.
	 */
	@Override
	public CompletableFuture<Ingresso.PagedResults> listIngressoRequest(Ingresso.PageRequest input) {
		return this.listIngressoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listIngresso
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Ingresso entity.
	*/
	@Override
	public CompletableFuture<Ingresso.PagedResults> listIngressoRequest(Ingresso.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.ListIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listIngressoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateIngresso
	 * This is a public operation
	 * The 'update' request primitive for the Ingresso entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso updateIngresso(Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateIngresso(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateIngresso
	 * This is a public operation
	 * The 'update' request primitive for the Ingresso entity.
	 */
	@Override
	public void updateIngresso(Ingresso input) {
		br.com.senior.mydomain.myservice.impl.UpdateIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateIngresso(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateIngresso
	 * This is a public operation
	 * The 'update' request primitive for the Ingresso entity.
	 */
	@Override
	public CompletableFuture<Ingresso> updateIngressoRequest(Ingresso input) {
		return this.updateIngressoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateIngresso
	 * This is a public operation
	 * The 'update' request primitive for the Ingresso entity.
	*/
	@Override
	public CompletableFuture<Ingresso> updateIngressoRequest(Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateIngressoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeIngresso
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ingresso entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Ingresso updateMergeIngresso(Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeIngresso(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeIngresso
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ingresso entity.
	 */
	@Override
	public void updateMergeIngresso(Ingresso input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeIngresso(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeIngresso
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ingresso entity.
	 */
	@Override
	public CompletableFuture<Ingresso> updateMergeIngressoRequest(Ingresso input) {
		return this.updateMergeIngressoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeIngresso
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ingresso entity.
	*/
	@Override
	public CompletableFuture<Ingresso> updateMergeIngressoRequest(Ingresso input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeIngressoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeIngressoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteIngresso
	 * This is a public operation
	 * The 'delete' request primitive for the Ingresso entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteIngresso(Ingresso.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteIngresso(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteIngresso
	 * This is a public operation
	 * The 'delete' request primitive for the Ingresso entity.
	 */
	@Override
	public void deleteIngresso(Ingresso.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteIngressoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteIngressoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteIngresso(input);
	}
	
	
	/**
	 * Chamada síncrona para o método createAtracao
	 * This is a public operation
	 * The 'create' request primitive for the Atracao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atracao createAtracao(Atracao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createAtracao
	 * This is a public operation
	 * The 'create' request primitive for the Atracao entity.
	 */
	@Override
	public void createAtracao(Atracao input) {
		br.com.senior.mydomain.myservice.impl.CreateAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.createAtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método createAtracao
	 * This is a public operation
	 * The 'create' request primitive for the Atracao entity.
	 */
	@Override
	public CompletableFuture<Atracao> createAtracaoRequest(Atracao input) {
		return this.createAtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createAtracao
	 * This is a public operation
	 * The 'create' request primitive for the Atracao entity.
	*/
	@Override
	public CompletableFuture<Atracao> createAtracaoRequest(Atracao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createBulkAtracao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atracao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkAtracaoOutput createBulkAtracao(CreateBulkAtracaoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAtracao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atracao entity.
	 */
	@Override
	public void createBulkAtracao(CreateBulkAtracaoInput input) {
		br.com.senior.mydomain.myservice.impl.CreateBulkAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkAtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAtracao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atracao entity.
	 */
	@Override
	public CompletableFuture<CreateBulkAtracaoOutput> createBulkAtracaoRequest(CreateBulkAtracaoInput input) {
		return this.createBulkAtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAtracao
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atracao entity.
	*/
	@Override
	public CompletableFuture<CreateBulkAtracaoOutput> createBulkAtracaoRequest(CreateBulkAtracaoInput input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateBulkAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateBulkAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método createMergeAtracao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atracao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atracao createMergeAtracao(Atracao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAtracao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atracao entity.
	 */
	@Override
	public void createMergeAtracao(Atracao input) {
		br.com.senior.mydomain.myservice.impl.CreateMergeAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeAtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAtracao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atracao entity.
	 */
	@Override
	public CompletableFuture<Atracao> createMergeAtracaoRequest(Atracao input) {
		return this.createMergeAtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAtracao
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atracao entity.
	*/
	@Override
	public CompletableFuture<Atracao> createMergeAtracaoRequest(Atracao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.CreateMergeAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.CreateMergeAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método retrieveAtracao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atracao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atracao retrieveAtracao(Atracao.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAtracao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atracao entity.
	 */
	@Override
	public void retrieveAtracao(Atracao.GetRequest input) {
		br.com.senior.mydomain.myservice.impl.RetrieveAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveAtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAtracao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atracao entity.
	 */
	@Override
	public CompletableFuture<Atracao> retrieveAtracaoRequest(Atracao.GetRequest input) {
		return this.retrieveAtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAtracao
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atracao entity.
	*/
	@Override
	public CompletableFuture<Atracao> retrieveAtracaoRequest(Atracao.GetRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.RetrieveAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.RetrieveAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método listAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Atracao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atracao.PagedResults listAtracao(Atracao.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.ListAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Atracao entity.
	 */
	@Override
	public void listAtracao(Atracao.PageRequest input) {
		br.com.senior.mydomain.myservice.impl.ListAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.ListAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.listAtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método listAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Atracao entity.
	 */
	@Override
	public CompletableFuture<Atracao.PagedResults> listAtracaoRequest(Atracao.PageRequest input) {
		return this.listAtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método listAtracao
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Atracao entity.
	*/
	@Override
	public CompletableFuture<Atracao.PagedResults> listAtracaoRequest(Atracao.PageRequest input, long timeout) {
		br.com.senior.mydomain.myservice.impl.ListAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.ListAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateAtracao
	 * This is a public operation
	 * The 'update' request primitive for the Atracao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atracao updateAtracao(Atracao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateAtracao
	 * This is a public operation
	 * The 'update' request primitive for the Atracao entity.
	 */
	@Override
	public void updateAtracao(Atracao input) {
		br.com.senior.mydomain.myservice.impl.UpdateAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateAtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateAtracao
	 * This is a public operation
	 * The 'update' request primitive for the Atracao entity.
	 */
	@Override
	public CompletableFuture<Atracao> updateAtracaoRequest(Atracao input) {
		return this.updateAtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateAtracao
	 * This is a public operation
	 * The 'update' request primitive for the Atracao entity.
	*/
	@Override
	public CompletableFuture<Atracao> updateAtracaoRequest(Atracao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método updateMergeAtracao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atracao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atracao updateMergeAtracao(Atracao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAtracao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atracao entity.
	 */
	@Override
	public void updateMergeAtracao(Atracao input) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeAtracao(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAtracao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atracao entity.
	 */
	@Override
	public CompletableFuture<Atracao> updateMergeAtracaoRequest(Atracao input) {
		return this.updateMergeAtracaoRequest(input, 0l);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAtracao
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atracao entity.
	*/
	@Override
	public CompletableFuture<Atracao> updateMergeAtracaoRequest(Atracao input, long timeout) {
		br.com.senior.mydomain.myservice.impl.UpdateMergeAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.UpdateMergeAtracaoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAtracaoRequest(input, timeout, TimeUnit.MILLISECONDS);
	}
	/**
	 * Chamada síncrona para o método deleteAtracao
	 * This is a public operation
	 * The 'delete' request primitive for the Atracao entity.
	 * @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteAtracao(Atracao.Id input, long timeout) {
		br.com.senior.mydomain.myservice.impl.DeleteAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAtracao(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteAtracao
	 * This is a public operation
	 * The 'delete' request primitive for the Atracao entity.
	 */
	@Override
	public void deleteAtracao(Atracao.Id input) {
		br.com.senior.mydomain.myservice.impl.DeleteAtracaoImpl impl = new br.com.senior.mydomain.myservice.impl.DeleteAtracaoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAtracao(input);
	}
	
	

	/**
	 * Chamada assíncrona para o método cancelarEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	@Override
	public void cancelarEvento( CancelarEventoInput input ) {
	
		MyServiceValidator.validate(input);
	
		Message message = null;
		if (messageSupplier != null && messageSupplier.get() != null) {
			message = messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Signals.CANCELAR_EVENTO, 
				DtoJsonConverter.toJSON(input));
		}
		else {
			message = new Message(userId.getTenant(), // 
				MyServiceConstants.DOMAIN, // 
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Signals.CANCELAR_EVENTO,
				DtoJsonConverter.toJSON(input));
		}
			
		try {
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método estornarPagamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	@Override
	public void estornarPagamentos( EstornarPagamentosInput input ) {
	
		MyServiceValidator.validate(input);
	
		Message message = null;
		if (messageSupplier != null && messageSupplier.get() != null) {
			message = messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Signals.ESTORNAR_PAGAMENTOS, 
				DtoJsonConverter.toJSON(input));
		}
		else {
			message = new Message(userId.getTenant(), // 
				MyServiceConstants.DOMAIN, // 
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Signals.ESTORNAR_PAGAMENTOS,
				DtoJsonConverter.toJSON(input));
		}
			
		try {
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	
	private Message createMessage(ImportIngressoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(PagamentoEstornadoPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(IngressoCompradoPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ServiceStartedPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportConvidadoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportAtracaoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportEventoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportAtracaoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(NotifyUserEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportEventoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ExportIngressoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	
	private Message createMessage(ImportConvidadoEventPayload input, String requestName) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				requestName, //
				DtoJsonConverter.toJSON(input));
		}
		return  new Message(userId.getTenant(), // 
			MyServiceConstants.DOMAIN, // 
			MyServiceConstants.SERVICE, //
			requestName, // 
			DtoJsonConverter.toJSON(input));
	}
	

	/**
	 * Chamada assíncrona para o método publishIngressoComprado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishIngressoComprado( IngressoCompradoPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.INGRESSO_COMPRADO);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishPagamentoEstornado
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishPagamentoEstornado( PagamentoEstornadoPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.PAGAMENTO_ESTORNADO);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishServiceStarted
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishServiceStarted( ServiceStartedPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.SERVICE_STARTED);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishNotifyUserEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.NOTIFY_USER_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportConvidadoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportConvidadoEvent( ImportConvidadoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_CONVIDADO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportConvidadoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportConvidadoEvent( ExportConvidadoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_CONVIDADO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportEventoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportEventoEvent( ImportEventoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_EVENTO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportEventoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportEventoEvent( ExportEventoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_EVENTO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportIngressoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportIngressoEvent( ImportIngressoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_INGRESSO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportIngressoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportIngressoEvent( ExportIngressoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_INGRESSO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishImportAtracaoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishImportAtracaoEvent( ImportAtracaoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.IMPORT_ATRACAO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	 * Chamada assíncrona para o método publishExportAtracaoEvent
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	public void publishExportAtracaoEvent( ExportAtracaoEventPayload input ) {
		Message message = createMessage(input, MyServiceConstants.Events.EXPORT_ATRACAO_EVENT);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
