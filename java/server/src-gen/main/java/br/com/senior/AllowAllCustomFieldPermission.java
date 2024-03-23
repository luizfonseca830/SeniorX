/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.senior.messaging.customspringdata.CustomEntity;
import br.com.senior.messaging.customspringdata.CustomFieldPermission;
import br.com.senior.messaging.model.SpringContext;

@Service
@Profile(SpringContext.DEV_PROFILE)
public class AllowAllCustomFieldPermission implements CustomFieldPermission {

	@Override
	public boolean canEdit(CustomEntity entity, String field) {
	    return true;
	}

	@Override
    public boolean canView(CustomEntity entity, String field) {
	    return true;
	}
}
