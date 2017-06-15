package com.bums.src.mapper;

import com.bums.src.dto.UserDTO;

public interface BaseMapper {

	// add user by UserDTO
	public void insertUser(UserDTO user);
}
