package com.curso.mapper;

import com.curso.dto.UserDTO;
import com.curso.models.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "id", target = "identificador")
    @Mapping(source = "name", target = "nombreCompleto")
    @Mapping(source = "email", target = "correoElectronico")
    UserDTO toDTO(User user);

    @InheritInverseConfiguration(name="toDTO")
    User toEntity(UserDTO userDTO);
}
