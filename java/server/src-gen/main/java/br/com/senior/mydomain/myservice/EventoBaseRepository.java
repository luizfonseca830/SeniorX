/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import org.springframework.data.jpa.repository.Query;
import br.com.senior.messaging.customspringdata.CustomRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EventoBaseRepository extends CustomRepository<EventoEntity, java.util.UUID> {
	
	@Query("select d from my_domain.my_service.EventoEntity p left join p.ingressos d where p.id = ?1 and d.id = ?2")
	IngressoEntity findIngressosByEventoIdAndIngressoId(java.util.UUID EventoId, java.util.UUID IngressoId);
	
}
