package com.rogelioorts.training.spring.ddd.config;

//import java.util.logging.Logger;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rogelioorts.training.spring.ddd.entities.ErrorResponse;
import com.rogelioorts.training.spring.ddd.exceptions.BadRequestException;

//import lombok.extern.slf4j.Slf4j;

//@Slf4j
@ControllerAdvice
//@Slf4j
public class CustomExceptionHandler {

//	@Autowired
//	Logger log;
	
	@ExceptionHandler(BadRequestException.class)
	public @ResponseBody ErrorResponse badRequestException(BadRequestException exception) {
		return new ErrorResponse("BAD_REQUEST", exception.getMessage());
	}
	
	@ExceptionHandler
	public @ResponseBody ErrorResponse defaultHandler(Exception ex) {
//		log.error("Error handled in controller: " + ex.getMessage(), ex);
//		log.severe("Error handled in controller");
		return new ErrorResponse("INTERNAL_SERVER", ex.getMessage());
	}
	
}
