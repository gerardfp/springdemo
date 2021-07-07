//package com.example.springdemo.http_errors;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import javax.security.auth.login.AccountNotFoundException;
//
//@ControllerAdvice
//public class ApiExceptionHandler {
//
////    @ResponseStatus(HttpStatus.UNAUTHORIZED)
////    @ExceptionHandler({
////            org.springframework.security.access.AccessDeniedException.class
////    })
////    @ResponseBody
////    public void unauthorizedRequest() {
////        //Empty. Nothing to do
////    }
//
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler({
//            AccountNotFoundException.class
//    })
//    @ResponseBody
//    public String badRequest() {
//        return "Cuenta no encontrada";
//    }
//
//}