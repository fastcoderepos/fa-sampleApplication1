package com.fastcode.example.application.core.authorization.role;

import org.mapstruct.Mapper;
import com.fastcode.example.application.core.authorization.role.dto.*;
import com.fastcode.example.domain.core.authorization.role.RoleEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IRoleMapper {

   RoleEntity createRoleInputToRoleEntity(CreateRoleInput roleDto);
   
   
   CreateRoleOutput roleEntityToCreateRoleOutput(RoleEntity entity);
   
    RoleEntity updateRoleInputToRoleEntity(UpdateRoleInput roleDto);
    
   	UpdateRoleOutput roleEntityToUpdateRoleOutput(RoleEntity entity);

   	FindRoleByIdOutput roleEntityToFindRoleByIdOutput(RoleEntity entity);


 	FindRoleByNameOutput roleEntityToFindRoleByNameOutput(RoleEntity entity);
 	
}

