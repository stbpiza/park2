package com.park.controller;

import com.park.model.Gate;
import com.park.model.InOutType;
import com.park.repository.GateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateController {

    @Autowired
    private GateRepository gateRepository;

    @PostMapping("/api/in")
    public int incar(@RequestBody Gate gate) {
        System.out.println("/in");
        System.out.println(gate.toString());

        gate.setIn_out(InOutType.IN);
        gateRepository.save(gate);
        return 1;
    }

    @PostMapping("/api/out")
    public int outcar(@RequestBody Gate gate) {
        System.out.println("/out");
        System.out.println(gate.toString());

        gate.setIn_out(InOutType.OUT);
        gateRepository.save(gate);
        return 1;
    }
}
