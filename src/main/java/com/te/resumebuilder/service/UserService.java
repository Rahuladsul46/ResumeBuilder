package com.te.resumebuilder.service;

import com.te.resumebuilder.dto.UserDto;
import com.te.resumebuilder.dto.UserProfileDto;

public interface UserService {

	UserProfileDto addResumeDetails(UserProfileDto userDto);

	UserProfileDto showResume(Integer userId);

	UserDto addUser(UserDto userDto);

	UserProfileDto updateResume(Integer userId, UserProfileDto userProfileDto);

}
