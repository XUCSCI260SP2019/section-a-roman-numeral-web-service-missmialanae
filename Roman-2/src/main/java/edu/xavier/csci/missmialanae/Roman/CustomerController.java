package edu.xavier.csci.missmialanae.Roman;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("/decode/{id}")

    public ResponseSingleDecode encode(@PathVariable("id") String num) {

        RomanNumeral converter = new RomanNumeral();

        ResponseSingleDecode response = new ResponseSingleDecode();

        response.setNumber(converter.decode(num));

        return response;
    }


}// end Controller
