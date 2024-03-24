/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.List;
import br.com.senior.mydomain.myservice.Atracao.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import br.com.senior.messaging.customspringdata.CustomOrder;
import java.util.Set;
import br.com.senior.messaging.customspringdata.Join;
import org.springframework.data.domain.Page;

public interface AtracaoCrudService extends CrudService<AtracaoEntity> {
	
	public AtracaoEntity createAtracao(AtracaoEntity toCreate);
	
	@Deprecated
	public AtracaoEntity createMergeAtracao(AtracaoEntity toCreateMerge);
	
	public AtracaoEntity updateAtracao(AtracaoEntity toUpdate);
	
	@Deprecated
	public AtracaoEntity updateMergeAtracao(AtracaoEntity toUpdateMerge);
	
	public void deleteAtracao(Id id);
	
	public AtracaoEntity retrieveAtracao(Id id);
	
	@Deprecated
	public List<AtracaoEntity> listAtracao(int skip, int top);
	
	public Page<AtracaoEntity> listAtracaoPageable(int skip, int top);
	
	public Page<AtracaoEntity> listAtracaoPageable(int skip, int top, String orderBy);
	
	public Page<AtracaoEntity> listAtracaoPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkAtracao(List<AtracaoEntity> entities);

	public AtracaoBaseRepository getRepository();
	
	public void validateFilterColumns(Set<String> columns, List<Join> joinFields, String lastPath);
	
	public void validateCustomOrders(List<CustomOrder> customOrders);
	
}
