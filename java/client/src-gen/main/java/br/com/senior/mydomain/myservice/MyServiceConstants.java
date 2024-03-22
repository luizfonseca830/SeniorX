/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

public interface MyServiceConstants {
    String DOMAIN = "my_domain";
    String SERVICE = "my_service";
    
    interface Commands {
    	/**
    	 * 
    	 * Primitiva que retorna uma mensagem de olá com o nome do requisitante
    	 * Normalmente no campo who é informado seu próprio nome
    	 * 
    	 * @see HelloWorldInput the request payload
    	 */
    	String HELLO_WORLD = "helloWorld";
    	/**
    	 * The success response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 * @see HelloWorldOutput the response payload
    	 */
    	String HELLO_WORLD_RESPONSE = "helloWorldResponse";
    	/**
    	 * An error response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 */
    	String HELLO_WORLD_ERROR = "helloWorldError";
    	/**
    	 * Cadastra um novo evento (ex: SeniorTec, Casamento, Aniversário, etc)
    	 * @see CadastrarEventoInput the request payload
    	 */
    	String CADASTRAR_EVENTO = "cadastrarEvento";
    	/**
    	 * The success response primitive for cadastrarEvento.
    	 *
    	 * @see #CADASTRAR_EVENTO the request primitive
    	 * @see RetornoCadastrarEvento the response payload
    	 */
    	String CADASTRAR_EVENTO_RESPONSE = "cadastrarEventoResponse";
    	/**
    	 * An error response primitive for cadastrarEvento.
    	 *
    	 * @see #CADASTRAR_EVENTO the request primitive
    	 */
    	String CADASTRAR_EVENTO_ERROR = "cadastrarEventoError";
    	/**
    	 * Cadastrar um novo convidado e acompanhantes
    	 * @see CadastrarConvidadoInput the request payload
    	 */
    	String CADASTRAR_CONVIDADO = "cadastrarConvidado";
    	/**
    	 * The success response primitive for cadastrarConvidado.
    	 *
    	 * @see #CADASTRAR_CONVIDADO the request primitive
    	 * @see CadastrarConvidadoOutput the response payload
    	 */
    	String CADASTRAR_CONVIDADO_RESPONSE = "cadastrarConvidadoResponse";
    	/**
    	 * An error response primitive for cadastrarConvidado.
    	 *
    	 * @see #CADASTRAR_CONVIDADO the request primitive
    	 */
    	String CADASTRAR_CONVIDADO_ERROR = "cadastrarConvidadoError";
    	/**
    	 * @see ComprarIngressoInput the request payload
    	 */
    	String COMPRAR_INGRESSO = "comprarIngresso";
    	/**
    	 * The success response primitive for comprarIngresso.
    	 *
    	 * @see #COMPRAR_INGRESSO the request primitive
    	 * @see ComprarIngressoOutput the response payload
    	 */
    	String COMPRAR_INGRESSO_RESPONSE = "comprarIngressoResponse";
    	/**
    	 * An error response primitive for comprarIngresso.
    	 *
    	 * @see #COMPRAR_INGRESSO the request primitive
    	 */
    	String COMPRAR_INGRESSO_ERROR = "comprarIngressoError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    }
    
    interface Signals {
    	String CANCELAR_EVENTO = "cancelarEvento";
    	String ESTORNAR_PAGAMENTOS = "estornarPagamentos";
    }
    
    interface Events {
    	String INGRESSO_COMPRADO = "ingressoComprado";
    	String PAGAMENTO_ESTORNADO = "pagamentoEstornado";
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    }
    
}
