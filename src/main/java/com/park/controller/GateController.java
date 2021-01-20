package com.park.controller;

import com.park.dto.ResponseDto;
import com.park.model.Gate;
import com.park.model.InOutType;
import com.park.repository.GateRepository;
import com.park.service.GateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateController {

    @Autowired
    private GateService gateService;

    @PostMapping("/api/in")
    public ResponseDto<Integer> incar(@RequestBody Gate gate) {
        System.out.println("/in");
        System.out.println(gate.toString());


        int result = gateService.incarS(gate);
        return new ResponseDto<Integer>(HttpStatus.OK.value(),result);
    }

    @PostMapping("/api/out")
    public ResponseDto<Integer> outcar(@RequestBody Gate gate) {
        System.out.println("/out");
        System.out.println(gate.toString());

        int result = gateService.outcarS(gate);
        return new ResponseDto<Integer>(HttpStatus.OK.value(),result);
    }
}
