package com.fastcode.example.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.example.restcontrollers.core.PermissionController;
import com.fastcode.example.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.example.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.example.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.example.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/permission/extended")
public class PermissionControllerExtended extends PermissionController {

		public PermissionControllerExtended(IPermissionAppServiceExtended permissionAppServiceExtended, IRolepermissionAppServiceExtended rolepermissionAppServiceExtended, IUserpermissionAppServiceExtended userpermissionAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		permissionAppServiceExtended,
    	rolepermissionAppServiceExtended,
    	userpermissionAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

