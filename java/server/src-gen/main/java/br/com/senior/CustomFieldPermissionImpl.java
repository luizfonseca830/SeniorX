/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.senior.messaging.customspringdata.CustomFieldPermission;
import br.com.senior.messaging.authorization.AuthorizationService;
import br.com.senior.messaging.authorization.CheckedPermission;
import br.com.senior.messaging.authorization.Permission;
import br.com.senior.messaging.customspringdata.CustomEntity;
import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.model.SpringContext;

@Service
@Profile(SpringContext.PROD_PROFILE)
public class CustomFieldPermissionImpl implements CustomFieldPermission {
    
    private static final String EDIT_ACTION = "Editar";
    private static final String VIEW_ACTION = "Visualizar";
    private static final String CUSTOM_FIELD_RESOURCE_BASE_URI = "res://%s/custom/entity/%s/%s/%s/%s";
    
    private AuthorizationService serviceModelAuthorizationService;
        
    public CustomFieldPermissionImpl(@Qualifier("serviceModelAuthorizationService") AuthorizationService serviceModelAuthorizationService) {
    	this.serviceModelAuthorizationService = serviceModelAuthorizationService;
    }
    
    private String buildResourceURI(CustomEntity entity, String field, ServiceContext sc) {
    	return String.format(CUSTOM_FIELD_RESOURCE_BASE_URI, sc.getCurrentMessage().getSelectorDomain(), sc.getCurrentService().getDomain(), sc.getCurrentService().getName(), entity.getServiceEntityName(), field);
    }
    
    @Override
    public boolean canEdit(CustomEntity entity, String field) {
    	ServiceContext sc = ServiceContext.get();
    	Permission permission = new Permission(buildResourceURI(entity, field, sc), EDIT_ACTION);
    	CheckedPermission checkedPermission =  serviceModelAuthorizationService.checkAccess(permission);
    	return checkedPermission != null && checkedPermission.isAuthorized();
    }
    
    @Override
    public boolean canView(CustomEntity entity, String field) {
    	ServiceContext sc = ServiceContext.get();
    	Permission permission = new Permission(buildResourceURI(entity, field, sc), VIEW_ACTION);
    	CheckedPermission checkedPermission =  serviceModelAuthorizationService.checkAccess(permission);
    	return checkedPermission != null && checkedPermission.isAuthorized();
    }
	
}
