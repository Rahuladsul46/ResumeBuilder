package com.te.resumebuilder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.resumebuilder.dto.UserDto;
import com.te.resumebuilder.dto.UserProfileDto;
import com.te.resumebuilder.response.AppResponse;
import com.te.resumebuilder.service.UserService;

@RestController
public class UserController {

	@Autowired
	private AppResponse appResponse;

	@Autowired
	private UserService userService;

	@PostMapping("/addUserResumeDetails")
	ResponseEntity<AppResponse> addUserResumeDetails(@RequestBody UserProfileDto userDto) {

		UserProfileDto resumeDetails = userService.addResumeDetails(userDto);

		if (resumeDetails != null) {
			appResponse.setSuccess(true);
			appResponse.setMessage("User Resume details saved Successfully !! ");
			appResponse.setListOfObj(resumeDetails);
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
		} else {
			appResponse.setSuccess(false);
			appResponse.setMessage("Unable to save User Resume details !! ");
			appResponse.setListOfObj(null);
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.BAD_REQUEST);

		}

	}

	@GetMapping("/showResume/{userId}")
	ResponseEntity<AppResponse> showResume(@PathVariable(name = "userId") Integer userId) {

		UserProfileDto userResume = userService.showResume(userId);

		if (userResume != null) {
			appResponse.setSuccess(true);
			appResponse.setMessage("Resume fetched successfully !!");
			appResponse.setListOfObj(userResume);
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
		} else {
			appResponse.setSuccess(false);
			appResponse.setMessage("Unable to fetch Resume !!");
			appResponse.setListOfObj(null);
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.BAD_REQUEST);
		}

	}

	@PutMapping("/updateResume/{userId}")
	public ResponseEntity<AppResponse> updateResume(@PathVariable(name = "userId") Integer userId,
			@RequestBody UserProfileDto userProfileDto) {

		UserProfileDto returnProfileDto = userService.updateResume(userId, userProfileDto);
		if (returnProfileDto != null) {
			appResponse.setSuccess(true);
			appResponse.setMessage("Resume Updated Successfully !!");
			appResponse.setListOfObj(returnProfileDto);
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
		} else {
			appResponse.setSuccess(false);
			appResponse.setMessage("Unable to update Resume !!");
			appResponse.setListOfObj(null);
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping(path = "/addUser")
	public ResponseEntity<AppResponse> addUser(@RequestBody UserDto userDto) {
		UserDto returnDto = userService.addUser(userDto);
		if (returnDto != null) {
			appResponse.setSuccess(true);
			appResponse.setMessage("User Saved Successfully");
			appResponse.setListOfObj(returnDto.getUserName() + " " + returnDto.getUserEmail());
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.OK);
		} else {
			appResponse.setSuccess(false);
			appResponse.setMessage("User not Saved Successfully");
			appResponse.setListOfObj(null);
			return new ResponseEntity<AppResponse>(appResponse, HttpStatus.NOT_FOUND);
		}

	}

}
