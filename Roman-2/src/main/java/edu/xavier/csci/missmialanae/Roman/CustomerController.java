package edu.xavier.csci.missmialanae.Roman;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/decode/{id}")
    public ResponseSingleDecode encode(@PathVariable("id") String num) {

        ResponseSingleDecode response = new ResponseSingleDecode();
        RomanNumeral converter = new RomanNumeral();
        response.setNumber(converter.decode(num));
        return response;
    }

    @GetMapping("/encode/{number}")
    public ResponseSingleEncode decode(@PathVariable("number")Integer num){
        ResponseSingleEncode response = new ResponseSingleEncode();
        RomanNumeral converter = new RomanNumeral();
        response.setString(converter.encode(num));
        return response;
    }

    @PostMapping("/decode")
    public ResponseMultipleDecode encode(@PathVariable("id")List s){
        ResponseMultipleDecode response = new ResponseMultipleDecode();
        RomanNumeral converter = new RomanNumeral();
        response.setNum(converter.decode(s));
        return response;
    }

    @PostMapping("/encode")
    public ResponseMultipleEncode decode(@PathVariable("number")List num){
        ResponseMultipleEncode response = new ResponseMultipleEncode();
        RomanNumeral converter = new RomanNumeral();
        response.setS(converter.encode(num));
        return response;
    }

}// end Controller
