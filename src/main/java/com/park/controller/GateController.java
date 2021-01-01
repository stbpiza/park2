package com.park.controller;

import com.park.model.Gate;
import com.park.model.InOutType;
import com.park.repository.GateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GateController {

    @Autowired
    private GateRepository gateRepository;

    @PostMapping("/in")
    public String incar(Gate gate) {
        System.out.println("/in");
        System.out.println(gate.toString());

        gate.setIn_out(InOutType.IN);
        gateRepository.save(gate);
        return "welcome";
    }

    @PostMapping("/out")
    public String outcar(Gate gate) {
        System.out.println("/out");
        System.out.println(gate.toString());

        gate.setIn_out(InOutType.OUT);
        gateRepository.save(gate);
        return "bye";
    }
}
