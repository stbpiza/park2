package com.park.service;

import com.park.model.Gate;
import com.park.model.InOutType;
import com.park.repository.GateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GateService {

    @Autowired
    private GateRepository gateRepository;

    @Transactional
    public int incarS(Gate gate){
        try{
            gate.setIn_out(InOutType.IN);
            gateRepository.save(gate);
            return 1;
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("입차에러"+e.getMessage());
            return -1;
        }
    }
}
