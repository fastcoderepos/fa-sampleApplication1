package com.fastcode.example.application.extended.staff;

import org.springframework.stereotype.Service;
import com.fastcode.example.application.core.staff.StaffAppService;

import com.fastcode.example.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.example.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.example.commons.logging.LoggingHelper;

@Service("staffAppServiceExtended")
public class StaffAppServiceExtended extends StaffAppService implements IStaffAppServiceExtended {

	public StaffAppServiceExtended(IStaffRepositoryExtended staffRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,IStaffMapperExtended mapper,LoggingHelper logHelper) {

		super(staffRepositoryExtended,
		addressRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

