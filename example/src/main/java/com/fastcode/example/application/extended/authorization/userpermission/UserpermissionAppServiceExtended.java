package com.fastcode.example.application.extended.authorization.userpermission;

import org.springframework.stereotype.Service;
import com.fastcode.example.application.core.authorization.userpermission.UserpermissionAppService;

import com.fastcode.example.domain.extended.authorization.userpermission.IUserpermissionRepositoryExtended;
import com.fastcode.example.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.example.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.example.commons.logging.LoggingHelper;

@Service("userpermissionAppServiceExtended")
public class UserpermissionAppServiceExtended extends UserpermissionAppService implements IUserpermissionAppServiceExtended {

	public UserpermissionAppServiceExtended(IUserpermissionRepositoryExtended userpermissionRepositoryExtended,
				IPermissionRepositoryExtended permissionRepositoryExtended,IUserRepositoryExtended userRepositoryExtended,IUserpermissionMapperExtended mapper,LoggingHelper logHelper) {

		super(userpermissionRepositoryExtended,
		permissionRepositoryExtended,userRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

