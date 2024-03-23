/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Ingresso.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface IngressoCrudService extends CrudService<IngressoEntity> {
	
	public IngressoEntity createIngresso(IngressoEntity toCreate);
	
	@Deprecated
	public IngressoEntity createMergeIngresso(IngressoEntity toCreateMerge);
	
	public IngressoEntity updateIngresso(IngressoEntity toUpdate);
	
	@Deprecated
	public IngressoEntity updateMergeIngresso(IngressoEntity toUpdateMerge);
	
	public void deleteIngresso(Id id);
	
	public IngressoEntity retrieveIngresso(Id id);
	
	@Deprecated
	public List<IngressoEntity> listIngresso(int skip, int top);
	
	public Page<IngressoEntity> listIngressoPageable(int skip, int top);
	
	public Page<IngressoEntity> listIngressoPageable(int skip, int top, String orderBy);
	
	public Page<IngressoEntity> listIngressoPageable(int skip, int top, String orderBy, String filter);
	
	public Page<IngressoEntity> listIngressoPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkIngresso(List<IngressoEntity> entities);

	public IngressoBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
