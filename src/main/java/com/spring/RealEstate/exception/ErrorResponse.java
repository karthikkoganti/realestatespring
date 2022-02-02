package com.spring.RealEstate.exception;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
 
@XmlRootElement(name = "error")
@Getter
@Setter
public class ErrorResponse 
{
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
 
   
    private String message;
 
    //Specific errors in API request processing
    private List<String> details;
 
    
}