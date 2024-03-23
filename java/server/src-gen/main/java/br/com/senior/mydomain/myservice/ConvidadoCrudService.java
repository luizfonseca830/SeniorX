/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Convidado.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface ConvidadoCrudService extends CrudService<ConvidadoEntity> {
	
	public ConvidadoEntity createConvidado(ConvidadoEntity toCreate);
	
	@Deprecated
	public ConvidadoEntity createMergeConvidado(ConvidadoEntity toCreateMerge);
	
	public ConvidadoEntity updateConvidado(ConvidadoEntity toUpdate);
	
	@Deprecated
	public ConvidadoEntity updateMergeConvidado(ConvidadoEntity toUpdateMerge);
	
	public void deleteConvidado(Id id);
	
	public ConvidadoEntity retrieveConvidado(Id id);
	
	@Deprecated
	public List<ConvidadoEntity> listConvidado(int skip, int top);
	
	public Page<ConvidadoEntity> listConvidadoPageable(int skip, int top);
	
	public Page<ConvidadoEntity> listConvidadoPageable(int skip, int top, String orderBy);
	
	public Page<ConvidadoEntity> listConvidadoPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkConvidado(List<ConvidadoEntity> entities);

	public ConvidadoBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
