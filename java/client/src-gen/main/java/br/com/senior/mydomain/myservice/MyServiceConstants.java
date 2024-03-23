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
    	String ODATA = "odata";
    	/**
    	 * The success response primitive for odata.
    	 *
    	 * @see #ODATA the request primitive
    	 */
    	String ODATA_RESPONSE = "odataResponse";
    	/**
    	 * An error response primitive for odata.
    	 *
    	 * @see #ODATA the request primitive
    	 */
    	String ODATA_ERROR = "odataError";
    	/**
    	 * @see ImportConvidadoInput the request payload
    	 */
    	String IMPORT_CONVIDADO = "importConvidado";
    	/**
    	 * The success response primitive for importConvidado.
    	 *
    	 * @see #IMPORT_CONVIDADO the request primitive
    	 * @see ImportConvidadoOutput the response payload
    	 */
    	String IMPORT_CONVIDADO_RESPONSE = "importConvidadoResponse";
    	/**
    	 * An error response primitive for importConvidado.
    	 *
    	 * @see #IMPORT_CONVIDADO the request primitive
    	 */
    	String IMPORT_CONVIDADO_ERROR = "importConvidadoError";
    	/**
    	 * @see ExportConvidadoInput the request payload
    	 */
    	String EXPORT_CONVIDADO = "exportConvidado";
    	/**
    	 * The success response primitive for exportConvidado.
    	 *
    	 * @see #EXPORT_CONVIDADO the request primitive
    	 * @see ExportConvidadoOutput the response payload
    	 */
    	String EXPORT_CONVIDADO_RESPONSE = "exportConvidadoResponse";
    	/**
    	 * An error response primitive for exportConvidado.
    	 *
    	 * @see #EXPORT_CONVIDADO the request primitive
    	 */
    	String EXPORT_CONVIDADO_ERROR = "exportConvidadoError";
    	/**
    	 * @see ImportEventoInput the request payload
    	 */
    	String IMPORT_EVENTO = "importEvento";
    	/**
    	 * The success response primitive for importEvento.
    	 *
    	 * @see #IMPORT_EVENTO the request primitive
    	 * @see ImportEventoOutput the response payload
    	 */
    	String IMPORT_EVENTO_RESPONSE = "importEventoResponse";
    	/**
    	 * An error response primitive for importEvento.
    	 *
    	 * @see #IMPORT_EVENTO the request primitive
    	 */
    	String IMPORT_EVENTO_ERROR = "importEventoError";
    	/**
    	 * @see ExportEventoInput the request payload
    	 */
    	String EXPORT_EVENTO = "exportEvento";
    	/**
    	 * The success response primitive for exportEvento.
    	 *
    	 * @see #EXPORT_EVENTO the request primitive
    	 * @see ExportEventoOutput the response payload
    	 */
    	String EXPORT_EVENTO_RESPONSE = "exportEventoResponse";
    	/**
    	 * An error response primitive for exportEvento.
    	 *
    	 * @see #EXPORT_EVENTO the request primitive
    	 */
    	String EXPORT_EVENTO_ERROR = "exportEventoError";
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
    	/**
    	 * The 'create' request primitive for the Convidado entity.
    	 * @see Convidado the request payload
    	 */
    	String CREATE_CONVIDADO = "createConvidado";
    	/**
    	 * The success response primitive for createConvidado.
    	 *
    	 * @see #CREATE_CONVIDADO the request primitive
    	 */
    	String CREATE_CONVIDADO_RESPONSE = "createConvidadoResponse";
    	/**
    	 * An error response primitive for createConvidado.
    	 *
    	 * @see #CREATE_CONVIDADO the request primitive
    	 */
    	String CREATE_CONVIDADO_ERROR = "createConvidadoError";
    	/**
    	 * The 'createBulk' request primitive for the Convidado entity.
    	 * @see CreateBulkConvidadoInput the request payload
    	 */
    	String CREATE_BULK_CONVIDADO = "createBulkConvidado";
    	/**
    	 * The success response primitive for createBulkConvidado.
    	 *
    	 * @see #CREATE_BULK_CONVIDADO the request primitive
    	 * @see CreateBulkConvidadoOutput the response payload
    	 */
    	String CREATE_BULK_CONVIDADO_RESPONSE = "createBulkConvidadoResponse";
    	/**
    	 * An error response primitive for createBulkConvidado.
    	 *
    	 * @see #CREATE_BULK_CONVIDADO the request primitive
    	 */
    	String CREATE_BULK_CONVIDADO_ERROR = "createBulkConvidadoError";
    	/**
    	 * The 'createMerge' request primitive for the Convidado entity.
    	 * @see Convidado the request payload
    	 */
    	String CREATE_MERGE_CONVIDADO = "createMergeConvidado";
    	/**
    	 * The success response primitive for createMergeConvidado.
    	 *
    	 * @see #CREATE_MERGE_CONVIDADO the request primitive
    	 */
    	String CREATE_MERGE_CONVIDADO_RESPONSE = "createMergeConvidadoResponse";
    	/**
    	 * An error response primitive for createMergeConvidado.
    	 *
    	 * @see #CREATE_MERGE_CONVIDADO the request primitive
    	 */
    	String CREATE_MERGE_CONVIDADO_ERROR = "createMergeConvidadoError";
    	/**
    	 * The 'retrieve' request primitive for the Convidado entity.
    	 * @see Convidado.GetRequest the request payload
    	 */
    	String RETRIEVE_CONVIDADO = "retrieveConvidado";
    	/**
    	 * The success response primitive for retrieveConvidado.
    	 *
    	 * @see #RETRIEVE_CONVIDADO the request primitive
    	 */
    	String RETRIEVE_CONVIDADO_RESPONSE = "retrieveConvidadoResponse";
    	/**
    	 * An error response primitive for retrieveConvidado.
    	 *
    	 * @see #RETRIEVE_CONVIDADO the request primitive
    	 */
    	String RETRIEVE_CONVIDADO_ERROR = "retrieveConvidadoError";
    	/**
    	 * The 'list' request primitive for the Convidado entity.
    	 * @see convidado.pageRequest the request payload
    	 */
    	String LIST_CONVIDADO = "listConvidado";
    	/**
    	 * The success response primitive for listConvidado.
    	 *
    	 * @see #LIST_CONVIDADO the request primitive
    	 * @see Convidado.PagedResults the response payload
    	 */
    	String LIST_CONVIDADO_RESPONSE = "listConvidadoResponse";
    	/**
    	 * An error response primitive for listConvidado.
    	 *
    	 * @see #LIST_CONVIDADO the request primitive
    	 */
    	String LIST_CONVIDADO_ERROR = "listConvidadoError";
    	/**
    	 * The 'update' request primitive for the Convidado entity.
    	 * @see Convidado the request payload
    	 */
    	String UPDATE_CONVIDADO = "updateConvidado";
    	/**
    	 * The success response primitive for updateConvidado.
    	 *
    	 * @see #UPDATE_CONVIDADO the request primitive
    	 */
    	String UPDATE_CONVIDADO_RESPONSE = "updateConvidadoResponse";
    	/**
    	 * An error response primitive for updateConvidado.
    	 *
    	 * @see #UPDATE_CONVIDADO the request primitive
    	 */
    	String UPDATE_CONVIDADO_ERROR = "updateConvidadoError";
    	/**
    	 * The 'updateMerge' request primitive for the Convidado entity.
    	 * @see Convidado the request payload
    	 */
    	String UPDATE_MERGE_CONVIDADO = "updateMergeConvidado";
    	/**
    	 * The success response primitive for updateMergeConvidado.
    	 *
    	 * @see #UPDATE_MERGE_CONVIDADO the request primitive
    	 */
    	String UPDATE_MERGE_CONVIDADO_RESPONSE = "updateMergeConvidadoResponse";
    	/**
    	 * An error response primitive for updateMergeConvidado.
    	 *
    	 * @see #UPDATE_MERGE_CONVIDADO the request primitive
    	 */
    	String UPDATE_MERGE_CONVIDADO_ERROR = "updateMergeConvidadoError";
    	/**
    	 * The 'delete' request primitive for the Convidado entity.
    	 * @see Convidado.Id the request payload
    	 */
    	String DELETE_CONVIDADO = "deleteConvidado";
    	/**
    	 * The success response primitive for deleteConvidado.
    	 *
    	 * @see #DELETE_CONVIDADO the request primitive
    	 */
    	String DELETE_CONVIDADO_RESPONSE = "deleteConvidadoResponse";
    	/**
    	 * An error response primitive for deleteConvidado.
    	 *
    	 * @see #DELETE_CONVIDADO the request primitive
    	 */
    	String DELETE_CONVIDADO_ERROR = "deleteConvidadoError";
    	/**
    	 * The 'create' request primitive for the Evento entity.
    	 * @see Evento the request payload
    	 */
    	String CREATE_EVENTO = "createEvento";
    	/**
    	 * The success response primitive for createEvento.
    	 *
    	 * @see #CREATE_EVENTO the request primitive
    	 */
    	String CREATE_EVENTO_RESPONSE = "createEventoResponse";
    	/**
    	 * An error response primitive for createEvento.
    	 *
    	 * @see #CREATE_EVENTO the request primitive
    	 */
    	String CREATE_EVENTO_ERROR = "createEventoError";
    	/**
    	 * The 'createBulk' request primitive for the Evento entity.
    	 * @see CreateBulkEventoInput the request payload
    	 */
    	String CREATE_BULK_EVENTO = "createBulkEvento";
    	/**
    	 * The success response primitive for createBulkEvento.
    	 *
    	 * @see #CREATE_BULK_EVENTO the request primitive
    	 * @see CreateBulkEventoOutput the response payload
    	 */
    	String CREATE_BULK_EVENTO_RESPONSE = "createBulkEventoResponse";
    	/**
    	 * An error response primitive for createBulkEvento.
    	 *
    	 * @see #CREATE_BULK_EVENTO the request primitive
    	 */
    	String CREATE_BULK_EVENTO_ERROR = "createBulkEventoError";
    	/**
    	 * The 'createMerge' request primitive for the Evento entity.
    	 * @see Evento the request payload
    	 */
    	String CREATE_MERGE_EVENTO = "createMergeEvento";
    	/**
    	 * The success response primitive for createMergeEvento.
    	 *
    	 * @see #CREATE_MERGE_EVENTO the request primitive
    	 */
    	String CREATE_MERGE_EVENTO_RESPONSE = "createMergeEventoResponse";
    	/**
    	 * An error response primitive for createMergeEvento.
    	 *
    	 * @see #CREATE_MERGE_EVENTO the request primitive
    	 */
    	String CREATE_MERGE_EVENTO_ERROR = "createMergeEventoError";
    	/**
    	 * The 'retrieve' request primitive for the Evento entity.
    	 * @see Evento.GetRequest the request payload
    	 */
    	String RETRIEVE_EVENTO = "retrieveEvento";
    	/**
    	 * The success response primitive for retrieveEvento.
    	 *
    	 * @see #RETRIEVE_EVENTO the request primitive
    	 */
    	String RETRIEVE_EVENTO_RESPONSE = "retrieveEventoResponse";
    	/**
    	 * An error response primitive for retrieveEvento.
    	 *
    	 * @see #RETRIEVE_EVENTO the request primitive
    	 */
    	String RETRIEVE_EVENTO_ERROR = "retrieveEventoError";
    	/**
    	 * The 'list' request primitive for the Evento entity.
    	 * @see evento.pageRequest the request payload
    	 */
    	String LIST_EVENTO = "listEvento";
    	/**
    	 * The success response primitive for listEvento.
    	 *
    	 * @see #LIST_EVENTO the request primitive
    	 * @see Evento.PagedResults the response payload
    	 */
    	String LIST_EVENTO_RESPONSE = "listEventoResponse";
    	/**
    	 * An error response primitive for listEvento.
    	 *
    	 * @see #LIST_EVENTO the request primitive
    	 */
    	String LIST_EVENTO_ERROR = "listEventoError";
    	/**
    	 * The 'update' request primitive for the Evento entity.
    	 * @see Evento the request payload
    	 */
    	String UPDATE_EVENTO = "updateEvento";
    	/**
    	 * The success response primitive for updateEvento.
    	 *
    	 * @see #UPDATE_EVENTO the request primitive
    	 */
    	String UPDATE_EVENTO_RESPONSE = "updateEventoResponse";
    	/**
    	 * An error response primitive for updateEvento.
    	 *
    	 * @see #UPDATE_EVENTO the request primitive
    	 */
    	String UPDATE_EVENTO_ERROR = "updateEventoError";
    	/**
    	 * The 'updateMerge' request primitive for the Evento entity.
    	 * @see Evento the request payload
    	 */
    	String UPDATE_MERGE_EVENTO = "updateMergeEvento";
    	/**
    	 * The success response primitive for updateMergeEvento.
    	 *
    	 * @see #UPDATE_MERGE_EVENTO the request primitive
    	 */
    	String UPDATE_MERGE_EVENTO_RESPONSE = "updateMergeEventoResponse";
    	/**
    	 * An error response primitive for updateMergeEvento.
    	 *
    	 * @see #UPDATE_MERGE_EVENTO the request primitive
    	 */
    	String UPDATE_MERGE_EVENTO_ERROR = "updateMergeEventoError";
    	/**
    	 * The 'delete' request primitive for the Evento entity.
    	 * @see Evento.Id the request payload
    	 */
    	String DELETE_EVENTO = "deleteEvento";
    	/**
    	 * The success response primitive for deleteEvento.
    	 *
    	 * @see #DELETE_EVENTO the request primitive
    	 */
    	String DELETE_EVENTO_RESPONSE = "deleteEventoResponse";
    	/**
    	 * An error response primitive for deleteEvento.
    	 *
    	 * @see #DELETE_EVENTO the request primitive
    	 */
    	String DELETE_EVENTO_ERROR = "deleteEventoError";
    	/**
    	 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
    	 * @see Ingresso the request payload
    	 */
    	String CREATE_EVENTO_INGRESSOS = "createEvento_Ingressos";
    	/**
    	 * The success response primitive for createEvento_Ingressos.
    	 *
    	 * @see #CREATE_EVENTO_INGRESSOS the request primitive
    	 */
    	String CREATE_EVENTO_INGRESSOS_RESPONSE = "createEvento_IngressosResponse";
    	/**
    	 * An error response primitive for createEvento_Ingressos.
    	 *
    	 * @see #CREATE_EVENTO_INGRESSOS the request primitive
    	 */
    	String CREATE_EVENTO_INGRESSOS_ERROR = "createEvento_IngressosError";
    	/**
    	 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
    	 * @see Ingresso the request payload
    	 */
    	String CREATE_MERGE_EVENTO_INGRESSOS = "createMergeEvento_Ingressos";
    	/**
    	 * The success response primitive for createMergeEvento_Ingressos.
    	 *
    	 * @see #CREATE_MERGE_EVENTO_INGRESSOS the request primitive
    	 */
    	String CREATE_MERGE_EVENTO_INGRESSOS_RESPONSE = "createMergeEvento_IngressosResponse";
    	/**
    	 * An error response primitive for createMergeEvento_Ingressos.
    	 *
    	 * @see #CREATE_MERGE_EVENTO_INGRESSOS the request primitive
    	 */
    	String CREATE_MERGE_EVENTO_INGRESSOS_ERROR = "createMergeEvento_IngressosError";
    	/**
    	 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
    	 * @see Ingresso the request payload
    	 */
    	String UPDATE_EVENTO_INGRESSOS = "updateEvento_Ingressos";
    	/**
    	 * The success response primitive for updateEvento_Ingressos.
    	 *
    	 * @see #UPDATE_EVENTO_INGRESSOS the request primitive
    	 */
    	String UPDATE_EVENTO_INGRESSOS_RESPONSE = "updateEvento_IngressosResponse";
    	/**
    	 * An error response primitive for updateEvento_Ingressos.
    	 *
    	 * @see #UPDATE_EVENTO_INGRESSOS the request primitive
    	 */
    	String UPDATE_EVENTO_INGRESSOS_ERROR = "updateEvento_IngressosError";
    	/**
    	 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
    	 * @see Ingresso the request payload
    	 */
    	String UPDATE_MERGE_EVENTO_INGRESSOS = "updateMergeEvento_Ingressos";
    	/**
    	 * The success response primitive for updateMergeEvento_Ingressos.
    	 *
    	 * @see #UPDATE_MERGE_EVENTO_INGRESSOS the request primitive
    	 */
    	String UPDATE_MERGE_EVENTO_INGRESSOS_RESPONSE = "updateMergeEvento_IngressosResponse";
    	/**
    	 * An error response primitive for updateMergeEvento_Ingressos.
    	 *
    	 * @see #UPDATE_MERGE_EVENTO_INGRESSOS the request primitive
    	 */
    	String UPDATE_MERGE_EVENTO_INGRESSOS_ERROR = "updateMergeEvento_IngressosError";
    	/**
    	 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
    	 * @see Ingresso.GetRequest the request payload
    	 */
    	String RETRIEVE_EVENTO_INGRESSOS = "retrieveEvento_Ingressos";
    	/**
    	 * The success response primitive for retrieveEvento_Ingressos.
    	 *
    	 * @see #RETRIEVE_EVENTO_INGRESSOS the request primitive
    	 */
    	String RETRIEVE_EVENTO_INGRESSOS_RESPONSE = "retrieveEvento_IngressosResponse";
    	/**
    	 * An error response primitive for retrieveEvento_Ingressos.
    	 *
    	 * @see #RETRIEVE_EVENTO_INGRESSOS the request primitive
    	 */
    	String RETRIEVE_EVENTO_INGRESSOS_ERROR = "retrieveEvento_IngressosError";
    	/**
    	 * The 'delete' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
    	 * @see Ingresso.Id the request payload
    	 */
    	String DELETE_EVENTO_INGRESSOS = "deleteEvento_Ingressos";
    	/**
    	 * The success response primitive for deleteEvento_Ingressos.
    	 *
    	 * @see #DELETE_EVENTO_INGRESSOS the request primitive
    	 */
    	String DELETE_EVENTO_INGRESSOS_RESPONSE = "deleteEvento_IngressosResponse";
    	/**
    	 * An error response primitive for deleteEvento_Ingressos.
    	 *
    	 * @see #DELETE_EVENTO_INGRESSOS the request primitive
    	 */
    	String DELETE_EVENTO_INGRESSOS_ERROR = "deleteEvento_IngressosError";
    	/**
    	 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
    	 * @see ingresso.pageRequest the request payload
    	 */
    	String LIST_EVENTO_INGRESSOS = "listEvento_Ingressos";
    	/**
    	 * The success response primitive for listEvento_Ingressos.
    	 *
    	 * @see #LIST_EVENTO_INGRESSOS the request primitive
    	 * @see Ingresso.PagedResults the response payload
    	 */
    	String LIST_EVENTO_INGRESSOS_RESPONSE = "listEvento_IngressosResponse";
    	/**
    	 * An error response primitive for listEvento_Ingressos.
    	 *
    	 * @see #LIST_EVENTO_INGRESSOS the request primitive
    	 */
    	String LIST_EVENTO_INGRESSOS_ERROR = "listEvento_IngressosError";
    	/**
    	 * The 'create' request primitive for the Ingresso entity.
    	 * @see Ingresso the request payload
    	 */
    	String CREATE_INGRESSO = "createIngresso";
    	/**
    	 * The success response primitive for createIngresso.
    	 *
    	 * @see #CREATE_INGRESSO the request primitive
    	 */
    	String CREATE_INGRESSO_RESPONSE = "createIngressoResponse";
    	/**
    	 * An error response primitive for createIngresso.
    	 *
    	 * @see #CREATE_INGRESSO the request primitive
    	 */
    	String CREATE_INGRESSO_ERROR = "createIngressoError";
    	/**
    	 * The 'createBulk' request primitive for the Ingresso entity.
    	 * @see CreateBulkIngressoInput the request payload
    	 */
    	String CREATE_BULK_INGRESSO = "createBulkIngresso";
    	/**
    	 * The success response primitive for createBulkIngresso.
    	 *
    	 * @see #CREATE_BULK_INGRESSO the request primitive
    	 * @see CreateBulkIngressoOutput the response payload
    	 */
    	String CREATE_BULK_INGRESSO_RESPONSE = "createBulkIngressoResponse";
    	/**
    	 * An error response primitive for createBulkIngresso.
    	 *
    	 * @see #CREATE_BULK_INGRESSO the request primitive
    	 */
    	String CREATE_BULK_INGRESSO_ERROR = "createBulkIngressoError";
    	/**
    	 * The 'createMerge' request primitive for the Ingresso entity.
    	 * @see Ingresso the request payload
    	 */
    	String CREATE_MERGE_INGRESSO = "createMergeIngresso";
    	/**
    	 * The success response primitive for createMergeIngresso.
    	 *
    	 * @see #CREATE_MERGE_INGRESSO the request primitive
    	 */
    	String CREATE_MERGE_INGRESSO_RESPONSE = "createMergeIngressoResponse";
    	/**
    	 * An error response primitive for createMergeIngresso.
    	 *
    	 * @see #CREATE_MERGE_INGRESSO the request primitive
    	 */
    	String CREATE_MERGE_INGRESSO_ERROR = "createMergeIngressoError";
    	/**
    	 * The 'retrieve' request primitive for the Ingresso entity.
    	 * @see Ingresso.GetRequest the request payload
    	 */
    	String RETRIEVE_INGRESSO = "retrieveIngresso";
    	/**
    	 * The success response primitive for retrieveIngresso.
    	 *
    	 * @see #RETRIEVE_INGRESSO the request primitive
    	 */
    	String RETRIEVE_INGRESSO_RESPONSE = "retrieveIngressoResponse";
    	/**
    	 * An error response primitive for retrieveIngresso.
    	 *
    	 * @see #RETRIEVE_INGRESSO the request primitive
    	 */
    	String RETRIEVE_INGRESSO_ERROR = "retrieveIngressoError";
    	/**
    	 * The 'list' request primitive for the Ingresso entity.
    	 * @see ingresso.pageRequest the request payload
    	 */
    	String LIST_INGRESSO = "listIngresso";
    	/**
    	 * The success response primitive for listIngresso.
    	 *
    	 * @see #LIST_INGRESSO the request primitive
    	 * @see Ingresso.PagedResults the response payload
    	 */
    	String LIST_INGRESSO_RESPONSE = "listIngressoResponse";
    	/**
    	 * An error response primitive for listIngresso.
    	 *
    	 * @see #LIST_INGRESSO the request primitive
    	 */
    	String LIST_INGRESSO_ERROR = "listIngressoError";
    	/**
    	 * The 'update' request primitive for the Ingresso entity.
    	 * @see Ingresso the request payload
    	 */
    	String UPDATE_INGRESSO = "updateIngresso";
    	/**
    	 * The success response primitive for updateIngresso.
    	 *
    	 * @see #UPDATE_INGRESSO the request primitive
    	 */
    	String UPDATE_INGRESSO_RESPONSE = "updateIngressoResponse";
    	/**
    	 * An error response primitive for updateIngresso.
    	 *
    	 * @see #UPDATE_INGRESSO the request primitive
    	 */
    	String UPDATE_INGRESSO_ERROR = "updateIngressoError";
    	/**
    	 * The 'updateMerge' request primitive for the Ingresso entity.
    	 * @see Ingresso the request payload
    	 */
    	String UPDATE_MERGE_INGRESSO = "updateMergeIngresso";
    	/**
    	 * The success response primitive for updateMergeIngresso.
    	 *
    	 * @see #UPDATE_MERGE_INGRESSO the request primitive
    	 */
    	String UPDATE_MERGE_INGRESSO_RESPONSE = "updateMergeIngressoResponse";
    	/**
    	 * An error response primitive for updateMergeIngresso.
    	 *
    	 * @see #UPDATE_MERGE_INGRESSO the request primitive
    	 */
    	String UPDATE_MERGE_INGRESSO_ERROR = "updateMergeIngressoError";
    	/**
    	 * The 'delete' request primitive for the Ingresso entity.
    	 * @see Ingresso.Id the request payload
    	 */
    	String DELETE_INGRESSO = "deleteIngresso";
    	/**
    	 * The success response primitive for deleteIngresso.
    	 *
    	 * @see #DELETE_INGRESSO the request primitive
    	 */
    	String DELETE_INGRESSO_RESPONSE = "deleteIngressoResponse";
    	/**
    	 * An error response primitive for deleteIngresso.
    	 *
    	 * @see #DELETE_INGRESSO the request primitive
    	 */
    	String DELETE_INGRESSO_ERROR = "deleteIngressoError";
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
    	String IMPORT_CONVIDADO_EVENT = "importConvidadoEvent";
    	String EXPORT_CONVIDADO_EVENT = "exportConvidadoEvent";
    	String IMPORT_EVENTO_EVENT = "importEventoEvent";
    	String EXPORT_EVENTO_EVENT = "exportEventoEvent";
    	String IMPORT_INGRESSO_EVENT = "importIngressoEvent";
    	String EXPORT_INGRESSO_EVENT = "exportIngressoEvent";
    }
    
}
