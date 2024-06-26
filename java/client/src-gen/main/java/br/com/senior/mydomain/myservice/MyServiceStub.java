/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.concurrent.CompletableFuture;


/**
* 
*/
public interface MyServiceStub {

	/**
	 * This is a public operation
	 * 
	         Primitiva que retorna uma mensagem de olá com o nome do requisitante
	         Normalmente no campo who é informado seu próprio nome
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	HelloWorldOutput helloWorld(HelloWorldInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	         Primitiva que retorna uma mensagem de olá com o nome do requisitante
	         Normalmente no campo who é informado seu próprio nome
	 * Chamada assíncrona
	 */
	void helloWorld(HelloWorldInput input);
	
	/**
	 * This is a public operation
	 * 
	         Primitiva que retorna uma mensagem de olá com o nome do requisitante
	         Normalmente no campo who é informado seu próprio nome
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input);
	
	/**
	 * This is a public operation
	 * 
	         Primitiva que retorna uma mensagem de olá com o nome do requisitante
	         Normalmente no campo who é informado seu próprio nome
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input, long timeout);
	/**
	 * This is a public operation
	 * Realiza a operação matematica de adição
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	FieldResultadoCalculadora calculadoraAdicao(FieldCalculadora input, long timeout);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de adição
	 * Chamada assíncrona
	 */
	void calculadoraAdicao(FieldCalculadora input);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de adição
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FieldResultadoCalculadora> calculadoraAdicaoRequest(FieldCalculadora input);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de adição
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FieldResultadoCalculadora> calculadoraAdicaoRequest(FieldCalculadora input, long timeout);
	/**
	 * This is a public operation
	 * Realiza a operação matematica de subtração
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	FieldResultadoCalculadora calculadoraSubtracao(FieldCalculadora input, long timeout);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de subtração
	 * Chamada assíncrona
	 */
	void calculadoraSubtracao(FieldCalculadora input);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de subtração
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FieldResultadoCalculadora> calculadoraSubtracaoRequest(FieldCalculadora input);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de subtração
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FieldResultadoCalculadora> calculadoraSubtracaoRequest(FieldCalculadora input, long timeout);
	/**
	 * This is a public operation
	 * Realiza a operação matematica de multiplicação
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	FieldResultadoCalculadora calculadoraMultiplicacao(FieldCalculadora input, long timeout);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de multiplicação
	 * Chamada assíncrona
	 */
	void calculadoraMultiplicacao(FieldCalculadora input);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de multiplicação
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FieldResultadoCalculadora> calculadoraMultiplicacaoRequest(FieldCalculadora input);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de multiplicação
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FieldResultadoCalculadora> calculadoraMultiplicacaoRequest(FieldCalculadora input, long timeout);
	/**
	 * This is a public operation
	 * Realiza a operação matematica de divisão
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	FieldResultadoCalculadora calculadoraDivisao(FieldCalculadora input, long timeout);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de divisão
	 * Chamada assíncrona
	 */
	void calculadoraDivisao(FieldCalculadora input);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de divisão
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FieldResultadoCalculadora> calculadoraDivisaoRequest(FieldCalculadora input);
	
	/**
	 * This is a public operation
	 * Realiza a operação matematica de divisão
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FieldResultadoCalculadora> calculadoraDivisaoRequest(FieldCalculadora input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	FindBynomeOutput findBynome(FindBynomeInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void findBynome(FindBynomeInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindBynomeOutput> findBynomeRequest(FindBynomeInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindBynomeOutput> findBynomeRequest(FindBynomeInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	FindIngressoBynomeConvidadoOutput findIngressoBynomeConvidado(FindIngressoBynomeConvidadoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void findIngressoBynomeConvidado(FindIngressoBynomeConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindIngressoBynomeConvidadoOutput> findIngressoBynomeConvidadoRequest(FindIngressoBynomeConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindIngressoBynomeConvidadoOutput> findIngressoBynomeConvidadoRequest(FindIngressoBynomeConvidadoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	FindNomeByIdCustomOutput findNomeByIdCustom(FindNomeByIdCustomInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void findNomeByIdCustom(FindNomeByIdCustomInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindNomeByIdCustomOutput> findNomeByIdCustomRequest(FindNomeByIdCustomInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<FindNomeByIdCustomOutput> findNomeByIdCustomRequest(FindNomeByIdCustomInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetAllConvidadosOutput getAllConvidados(GetAllConvidadosInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void getAllConvidados(GetAllConvidadosInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetAllConvidadosOutput> getAllConvidadosRequest(GetAllConvidadosInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetAllConvidadosOutput> getAllConvidadosRequest(GetAllConvidadosInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetConvidadosByCpfOutput getConvidadosByCpf(GetConvidadosByCpfInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void getConvidadosByCpf(GetConvidadosByCpfInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetConvidadosByCpfOutput> getConvidadosByCpfRequest(GetConvidadosByCpfInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetConvidadosByCpfOutput> getConvidadosByCpfRequest(GetConvidadosByCpfInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetIdsByNomeConvidadoOutput getIdsByNomeConvidado(GetIdsByNomeConvidadoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void getIdsByNomeConvidado(GetIdsByNomeConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetIdsByNomeConvidadoOutput> getIdsByNomeConvidadoRequest(GetIdsByNomeConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetIdsByNomeConvidadoOutput> getIdsByNomeConvidadoRequest(GetIdsByNomeConvidadoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetAtracaoByNomeEventoOutput getAtracaoByNomeEvento(GetAtracaoByNomeEventoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void getAtracaoByNomeEvento(GetAtracaoByNomeEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetAtracaoByNomeEventoOutput> getAtracaoByNomeEventoRequest(GetAtracaoByNomeEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetAtracaoByNomeEventoOutput> getAtracaoByNomeEventoRequest(GetAtracaoByNomeEventoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	UpdateConvidadoNomeByIdOutput updateConvidadoNomeById(UpdateConvidadoNomeByIdInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void updateConvidadoNomeById(UpdateConvidadoNomeByIdInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<UpdateConvidadoNomeByIdOutput> updateConvidadoNomeByIdRequest(UpdateConvidadoNomeByIdInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<UpdateConvidadoNomeByIdOutput> updateConvidadoNomeByIdRequest(UpdateConvidadoNomeByIdInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	UpdateConvidadoNomeSocialByNomeOutput updateConvidadoNomeSocialByNome(UpdateConvidadoNomeSocialByNomeInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void updateConvidadoNomeSocialByNome(UpdateConvidadoNomeSocialByNomeInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<UpdateConvidadoNomeSocialByNomeOutput> updateConvidadoNomeSocialByNomeRequest(UpdateConvidadoNomeSocialByNomeInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<UpdateConvidadoNomeSocialByNomeOutput> updateConvidadoNomeSocialByNomeRequest(UpdateConvidadoNomeSocialByNomeInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastra um novo evento (ex: SeniorTec, Casamento, Aniversário, etc)
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	RetornoCadastrarEvento cadastrarEvento(CadastrarEventoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastra um novo evento (ex: SeniorTec, Casamento, Aniversário, etc)
	 * Chamada assíncrona
	 */
	void cadastrarEvento(CadastrarEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastra um novo evento (ex: SeniorTec, Casamento, Aniversário, etc)
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<RetornoCadastrarEvento> cadastrarEventoRequest(CadastrarEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastra um novo evento (ex: SeniorTec, Casamento, Aniversário, etc)
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<RetornoCadastrarEvento> cadastrarEventoRequest(CadastrarEventoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastrar um novo convidado e acompanhantes
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CadastrarConvidadoOutput cadastrarConvidado(CadastrarConvidadoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastrar um novo convidado e acompanhantes
	 * Chamada assíncrona
	 */
	void cadastrarConvidado(CadastrarConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastrar um novo convidado e acompanhantes
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CadastrarConvidadoOutput> cadastrarConvidadoRequest(CadastrarConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Cadastrar um novo convidado e acompanhantes
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CadastrarConvidadoOutput> cadastrarConvidadoRequest(CadastrarConvidadoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ComprarIngressoOutput comprarIngresso(ComprarIngressoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void comprarIngresso(ComprarIngressoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ComprarIngressoOutput> comprarIngressoRequest(ComprarIngressoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ComprarIngressoOutput> comprarIngressoRequest(ComprarIngressoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona
	 */
	void getMetadata(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportConvidadoOutput importConvidado(ImportConvidadoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void importConvidado(ImportConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportConvidadoOutput> importConvidadoRequest(ImportConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportConvidadoOutput> importConvidadoRequest(ImportConvidadoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportConvidadoOutput exportConvidado(ExportConvidadoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void exportConvidado(ExportConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportConvidadoOutput> exportConvidadoRequest(ExportConvidadoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportConvidadoOutput> exportConvidadoRequest(ExportConvidadoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportEventoOutput importEvento(ImportEventoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void importEvento(ImportEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportEventoOutput> importEventoRequest(ImportEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportEventoOutput> importEventoRequest(ImportEventoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportEventoOutput exportEvento(ExportEventoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void exportEvento(ExportEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportEventoOutput> exportEventoRequest(ExportEventoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportEventoOutput> exportEventoRequest(ExportEventoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportAtracaoOutput importAtracao(ImportAtracaoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void importAtracao(ImportAtracaoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportAtracaoOutput> importAtracaoRequest(ImportAtracaoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportAtracaoOutput> importAtracaoRequest(ImportAtracaoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportAtracaoOutput exportAtracao(ExportAtracaoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void exportAtracao(ExportAtracaoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportAtracaoOutput> exportAtracaoRequest(ExportAtracaoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportAtracaoOutput> exportAtracaoRequest(ExportAtracaoInput input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona
	 */
	void getDependencies();
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest(long timeout);
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Convidado entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Convidado createConvidado(Convidado input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Convidado entity.
	 * Chamada assíncrona
	 */
	void createConvidado(Convidado input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> createConvidadoRequest(Convidado input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> createConvidadoRequest(Convidado input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Convidado entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkConvidadoOutput createBulkConvidado(CreateBulkConvidadoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Convidado entity.
	 * Chamada assíncrona
	 */
	void createBulkConvidado(CreateBulkConvidadoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkConvidadoOutput> createBulkConvidadoRequest(CreateBulkConvidadoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkConvidadoOutput> createBulkConvidadoRequest(CreateBulkConvidadoInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Convidado entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Convidado createMergeConvidado(Convidado input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Convidado entity.
	 * Chamada assíncrona
	 */
	void createMergeConvidado(Convidado input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> createMergeConvidadoRequest(Convidado input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> createMergeConvidadoRequest(Convidado input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Convidado entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Convidado retrieveConvidado(Convidado.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Convidado entity.
	 * Chamada assíncrona
	 */
	void retrieveConvidado(Convidado.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> retrieveConvidadoRequest(Convidado.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> retrieveConvidadoRequest(Convidado.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Convidado entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Convidado.PagedResults listConvidado(Convidado.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Convidado entity.
	 * Chamada assíncrona
	 */
	void listConvidado(Convidado.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado.PagedResults> listConvidadoRequest(Convidado.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado.PagedResults> listConvidadoRequest(Convidado.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Convidado entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Convidado updateConvidado(Convidado input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Convidado entity.
	 * Chamada assíncrona
	 */
	void updateConvidado(Convidado input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> updateConvidadoRequest(Convidado input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> updateConvidadoRequest(Convidado input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Convidado entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Convidado updateMergeConvidado(Convidado input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Convidado entity.
	 * Chamada assíncrona
	 */
	void updateMergeConvidado(Convidado input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> updateMergeConvidadoRequest(Convidado input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Convidado entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Convidado> updateMergeConvidadoRequest(Convidado input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Convidado entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteConvidado(Convidado.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Convidado entity.
	 * Chamada assíncrona
	 */
	void deleteConvidado(Convidado.Id input);
	
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento createEvento(Evento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void createEvento(Evento input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> createEventoRequest(Evento input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> createEventoRequest(Evento input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkEventoOutput createBulkEvento(CreateBulkEventoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void createBulkEvento(CreateBulkEventoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkEventoOutput> createBulkEventoRequest(CreateBulkEventoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkEventoOutput> createBulkEventoRequest(CreateBulkEventoInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento createMergeEvento(Evento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void createMergeEvento(Evento input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> createMergeEventoRequest(Evento input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> createMergeEventoRequest(Evento input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento retrieveEvento(Evento.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void retrieveEvento(Evento.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> retrieveEventoRequest(Evento.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> retrieveEventoRequest(Evento.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento.PagedResults listEvento(Evento.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void listEvento(Evento.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento.PagedResults> listEventoRequest(Evento.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento.PagedResults> listEventoRequest(Evento.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento updateEvento(Evento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void updateEvento(Evento input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> updateEventoRequest(Evento input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> updateEventoRequest(Evento input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Evento updateMergeEvento(Evento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void updateMergeEvento(Evento input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> updateMergeEventoRequest(Evento input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Evento> updateMergeEventoRequest(Evento input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteEvento(Evento.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Evento entity.
	 * Chamada assíncrona
	 */
	void deleteEvento(Evento.Id input);
	
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso createEvento_Ingressos(Evento.Id parentId, Ingresso input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona
	 */
	void createEvento_Ingressos(Evento.Id parentId, Ingresso input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> createEvento_IngressosRequest(Evento.Id parentId, Ingresso input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'create' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> createEvento_IngressosRequest(Evento.Id parentId, Ingresso input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso createMergeEvento_Ingressos(Evento.Id parentId, Ingresso input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona
	 */
	void createMergeEvento_Ingressos(Evento.Id parentId, Ingresso input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> createMergeEvento_IngressosRequest(Evento.Id parentId, Ingresso input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'createMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> createMergeEvento_IngressosRequest(Evento.Id parentId, Ingresso input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso updateEvento_Ingressos(Evento.Id parentId, Ingresso input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona
	 */
	void updateEvento_Ingressos(Evento.Id parentId, Ingresso input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> updateEvento_IngressosRequest(Evento.Id parentId, Ingresso input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'update' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> updateEvento_IngressosRequest(Evento.Id parentId, Ingresso input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso updateMergeEvento_Ingressos(Evento.Id parentId, Ingresso input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona
	 */
	void updateMergeEvento_Ingressos(Evento.Id parentId, Ingresso input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> updateMergeEvento_IngressosRequest(Evento.Id parentId, Ingresso input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'updateMerge' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> updateMergeEvento_IngressosRequest(Evento.Id parentId, Ingresso input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso retrieveEvento_Ingressos(Evento.Id parentId, Ingresso.GetRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona
	 */
	void retrieveEvento_Ingressos(Evento.Id parentId, Ingresso.GetRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> retrieveEvento_IngressosRequest(Evento.Id parentId, Ingresso.GetRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'retrieve' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> retrieveEvento_IngressosRequest(Evento.Id parentId, Ingresso.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteEvento_Ingressos(Evento.Id parentId, Ingresso.Id input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'delete' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona
	 */
	void deleteEvento_Ingressos(Evento.Id parentId, Ingresso.Id input);
	
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso.PagedResults listEvento_Ingressos(Evento.Id parentId, Ingresso.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona
	 */
	void listEvento_Ingressos(Evento.Id parentId, Ingresso.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso.PagedResults> listEvento_IngressosRequest(Evento.Id parentId, Ingresso.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso.PagedResults> listEvento_IngressosRequest(Evento.Id parentId, Ingresso.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Ingresso entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso createIngresso(Ingresso input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Ingresso entity.
	 * Chamada assíncrona
	 */
	void createIngresso(Ingresso input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> createIngressoRequest(Ingresso input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> createIngressoRequest(Ingresso input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ingresso entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkIngressoOutput createBulkIngresso(CreateBulkIngressoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ingresso entity.
	 * Chamada assíncrona
	 */
	void createBulkIngresso(CreateBulkIngressoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkIngressoOutput> createBulkIngressoRequest(CreateBulkIngressoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkIngressoOutput> createBulkIngressoRequest(CreateBulkIngressoInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ingresso entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso createMergeIngresso(Ingresso input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ingresso entity.
	 * Chamada assíncrona
	 */
	void createMergeIngresso(Ingresso input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> createMergeIngressoRequest(Ingresso input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> createMergeIngressoRequest(Ingresso input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ingresso entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso retrieveIngresso(Ingresso.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ingresso entity.
	 * Chamada assíncrona
	 */
	void retrieveIngresso(Ingresso.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> retrieveIngressoRequest(Ingresso.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> retrieveIngressoRequest(Ingresso.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Ingresso entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso.PagedResults listIngresso(Ingresso.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Ingresso entity.
	 * Chamada assíncrona
	 */
	void listIngresso(Ingresso.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso.PagedResults> listIngressoRequest(Ingresso.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso.PagedResults> listIngressoRequest(Ingresso.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Ingresso entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso updateIngresso(Ingresso input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Ingresso entity.
	 * Chamada assíncrona
	 */
	void updateIngresso(Ingresso input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> updateIngressoRequest(Ingresso input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> updateIngressoRequest(Ingresso input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ingresso entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Ingresso updateMergeIngresso(Ingresso input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ingresso entity.
	 * Chamada assíncrona
	 */
	void updateMergeIngresso(Ingresso input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> updateMergeIngressoRequest(Ingresso input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Ingresso entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Ingresso> updateMergeIngressoRequest(Ingresso input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Ingresso entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteIngresso(Ingresso.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Ingresso entity.
	 * Chamada assíncrona
	 */
	void deleteIngresso(Ingresso.Id input);
	
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Atracao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atracao createAtracao(Atracao input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Atracao entity.
	 * Chamada assíncrona
	 */
	void createAtracao(Atracao input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> createAtracaoRequest(Atracao input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> createAtracaoRequest(Atracao input, long timeout);
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atracao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkAtracaoOutput createBulkAtracao(CreateBulkAtracaoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atracao entity.
	 * Chamada assíncrona
	 */
	void createBulkAtracao(CreateBulkAtracaoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkAtracaoOutput> createBulkAtracaoRequest(CreateBulkAtracaoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkAtracaoOutput> createBulkAtracaoRequest(CreateBulkAtracaoInput input, long timeout);
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atracao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atracao createMergeAtracao(Atracao input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atracao entity.
	 * Chamada assíncrona
	 */
	void createMergeAtracao(Atracao input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> createMergeAtracaoRequest(Atracao input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> createMergeAtracaoRequest(Atracao input, long timeout);
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atracao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atracao retrieveAtracao(Atracao.GetRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atracao entity.
	 * Chamada assíncrona
	 */
	void retrieveAtracao(Atracao.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> retrieveAtracaoRequest(Atracao.GetRequest input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> retrieveAtracaoRequest(Atracao.GetRequest input, long timeout);
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Atracao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atracao.PagedResults listAtracao(Atracao.PageRequest input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Atracao entity.
	 * Chamada assíncrona
	 */
	void listAtracao(Atracao.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao.PagedResults> listAtracaoRequest(Atracao.PageRequest input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * The 'list' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao.PagedResults> listAtracaoRequest(Atracao.PageRequest input, long timeout);
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Atracao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atracao updateAtracao(Atracao input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Atracao entity.
	 * Chamada assíncrona
	 */
	void updateAtracao(Atracao input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> updateAtracaoRequest(Atracao input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> updateAtracaoRequest(Atracao input, long timeout);
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atracao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atracao updateMergeAtracao(Atracao input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atracao entity.
	 * Chamada assíncrona
	 */
	void updateMergeAtracao(Atracao input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> updateMergeAtracaoRequest(Atracao input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atracao entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atracao> updateMergeAtracaoRequest(Atracao input, long timeout);
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Atracao entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteAtracao(Atracao.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Atracao entity.
	 * Chamada assíncrona
	 */
	void deleteAtracao(Atracao.Id input);
	
	

	/**
	 * Chamada assíncrona para o método cancelarEvento
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void cancelarEvento(CancelarEventoInput input);
	/**
	 * Chamada assíncrona para o método estornarPagamentos
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void estornarPagamentos(EstornarPagamentosInput input);

	/**
	 * Chamada assíncrona para o método publishIngressoComprado 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishIngressoComprado( IngressoCompradoPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishPagamentoEstornado 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishPagamentoEstornado( PagamentoEstornadoPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishServiceStarted 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishNotifyUserEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportConvidadoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportConvidadoEvent( ImportConvidadoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportConvidadoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportConvidadoEvent( ExportConvidadoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportEventoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportEventoEvent( ImportEventoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportEventoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportEventoEvent( ExportEventoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportIngressoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportIngressoEvent( ImportIngressoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportIngressoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportIngressoEvent( ExportIngressoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishImportAtracaoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishImportAtracaoEvent( ImportAtracaoEventPayload input );
			
	
	/**
	 * Chamada assíncrona para o método publishExportAtracaoEvent 
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 */
	void publishExportAtracaoEvent( ExportAtracaoEventPayload input );
			
	

}
