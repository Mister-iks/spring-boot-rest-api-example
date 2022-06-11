package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Mister__iks
 * @Twitter @Mister__iks
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundproductException extends RuntimeException{
    public NotFoundproductException(String message){
        super(message);
    }
}
