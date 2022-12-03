package com.example.finalarquifunda.Controller;

import com.example.finalarquifunda.Core.Chasis;
import com.example.finalarquifunda.Service.ChasisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ChasisController {
    ChasisService chasisService;
    ChasisController(ChasisService chasisService){
        this.chasisService = chasisService;
    }
    String data = "Data : ";
    Map<String, Chasis> empData = new HashMap<String, Chasis>();
    @GetMapping(value = "Info")
    public ResponseEntity<?>  getData() {
        Chasis emp = chasisService.getData();
        empData.put(data,emp);
        return new ResponseEntity<>(
                empData,  HttpStatus.OK);
    }
}
