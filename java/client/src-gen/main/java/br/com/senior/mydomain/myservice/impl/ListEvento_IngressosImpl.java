/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice.impl;

import java.util.function.Supplier;

import br.com.senior.messaging.*;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;			

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.model.ServiceRunner;

import br.com.senior.mydomain.myservice.Ingresso;
import br.com.senior.mydomain.myservice.Evento;
import br.com.senior.mydomain.myservice.MyServiceConstants;
import br.com.senior.mydomain.myservice.MyServiceException;
import br.com.senior.mydomain.myservice.MyServiceMessageException;

/**
 * 
 */
public class ListEvento_IngressosImpl {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	public ListEvento_IngressosImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	private Message createMessage(Ingresso.PageRequest input) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				userId.getTenant(), //
				MyServiceConstants.DOMAIN, //
				MyServiceConstants.SERVICE, //
				MyServiceConstants.Commands.LIST_EVENTO_INGRESSOS, //
				DtoJsonConverter.toJSON(input));
		}
		return new Message(userId.getTenant(), //
			MyServiceConstants.DOMAIN, //
			MyServiceConstants.SERVICE, //
			MyServiceConstants.Commands.LIST_EVENTO_INGRESSOS, //
			DtoJsonConverter.toJSON(input));
	}
	
	/**
	* Chamada síncrona para o método listEvento_Ingressos
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity. 
	* @throws MyServiceMessageException quando um erro com payload for retornado pela mensageria
	*/
	public Ingresso.PagedResults listEvento_Ingressos(Evento.Id parentId, Ingresso.PageRequest input, long timeout) {
		Message message = createMessage(input);
		Message resultMessage; 
		try {
			addMessageHeaders(message);
			message.addHeader("entity_parent_id", parentId.id);
			resultMessage = messengerSupplier.get().requestSync(message, timeout);
			messengerSupplier.get().ack(resultMessage);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
		
		if (resultMessage == null) {
			throw new MyServiceException("Retorno inválido");
		}
		
		if (resultMessage.isError()) {
			ErrorPayload error = DtoJsonConverter.toDTO(resultMessage.getContent(), ErrorPayload.class);
			throw new MyServiceMessageException(resultMessage.getErrorCategory(), error.getMessage(), error.getErrorCode());
		}
		Ingresso.PagedResults output = DtoJsonConverter.toDTO(resultMessage.getContent(), Ingresso.PagedResults.class);
		if (output == null) {
			throw new MyServiceException("Contéudo do retorno inválido");
		}
		return output;
	}
	
	/**
	* Chamada assíncrona para o método listEvento_Ingressos
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	*/
	public void listEvento_Ingressos(Evento.Id parentId, Ingresso.PageRequest input) {
		Message message = createMessage(input);
		try {
			message.addHeader("entity_parent_id", parentId.id);
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new MyServiceException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método listEvento_Ingressos
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	*/
	@Deprecated
	public CompletableFuture<Ingresso.PagedResults> listEvento_IngressosRequest(Evento.Id parentId, Ingresso.PageRequest input) {
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		message.addHeader("entity_parent_id", parentId.id);
		return serviceRunner.request(message, Ingresso.PagedResults.class);
	}
	
	/**
	* Chamada assíncrona para o método listEvento_Ingressos
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* The 'list' request primitive for the ingressos attribute of evento entity.\nThis primitive requires the header 'entity_parent_id' with id of parent evento entity.
	*/
	public CompletableFuture<Ingresso.PagedResults> listEvento_IngressosRequest(Evento.Id parentId, Ingresso.PageRequest input, long timeout, TimeUnit unit) {
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		message.addHeader("entity_parent_id", parentId.id);
		return serviceRunner.request(message, Ingresso.PagedResults.class, TimeUnit.MILLISECONDS.convert(timeout, unit));
	}
	
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
