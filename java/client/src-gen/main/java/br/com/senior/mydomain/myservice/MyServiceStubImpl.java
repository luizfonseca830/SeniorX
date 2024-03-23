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
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
