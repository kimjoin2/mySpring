package com.bums.src.mapper;

import com.bums.src.dto.UserDTO;

public interface BaseMapper {

	// add user by UserDTO
	public void insertUser(UserDTO user);
	
	// check for login
	public String canLogin(UserDTO user);
	
	// delete user
	public void deleteUser(UserDTO user);
	
	// change info of user
	public void changePw(UserDTO user);
}
