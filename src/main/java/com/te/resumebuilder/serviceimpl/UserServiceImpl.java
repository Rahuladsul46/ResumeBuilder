package com.te.resumebuilder.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.dto.UserDto;
import com.te.resumebuilder.dto.UserProfileDto;
import com.te.resumebuilder.entity.User;
import com.te.resumebuilder.entity.UserProfile;
import com.te.resumebuilder.repository.UserProfileRepository;
import com.te.resumebuilder.repository.UserRepository;
import com.te.resumebuilder.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserProfileRepository profileRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserProfileDto addResumeDetails(UserProfileDto userProfileDto) {

		ModelMapper modelMapper = new ModelMapper();
		UserProfile userProfile = modelMapper.map(userProfileDto, UserProfile.class);
		profileRepository.save(userProfile);

		UserProfileDto userDtoReturn = modelMapper.map(userProfile, UserProfileDto.class);
		return userDtoReturn;
	}

	@Override
	public UserProfileDto showResume(Integer userId) {

		ModelMapper modelMapper = new ModelMapper();
		UserProfile userProfile = profileRepository.findById(userId).get();
		UserProfileDto userDto = modelMapper.map(userProfile, UserProfileDto.class);

		return userDto;
	}
	
	@Override
	public UserProfileDto updateResume(Integer userId, UserProfileDto userProfileDto) {
		
		ModelMapper modelMapper = new ModelMapper();
		UserProfile userProfile = profileRepository.findById(userId).get();
		UserProfileDto userDto = modelMapper.map(userProfile, UserProfileDto.class);
		
		return userDto;
	}

	@Override
	public UserDto addUser(UserDto userDto) {

		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		userRepository.save(user);

		return userDto;
	}

}
