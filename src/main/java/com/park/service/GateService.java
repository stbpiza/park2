package com.park.service;

import com.park.dto.GateDto;
import com.park.model.Gate;
import com.park.model.InOutType;
import com.park.repository.GateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GateService {

    @Autowired
    private GateRepository gateRepository;

    @Transactional(readOnly = false)
    public int incarS(Gate gate){
        try{
            InOutType inoutCheck;

            Gate gateCheck = gateRepository.check(gate.getCar_num());
            System.out.println(gateCheck);
            if(gateCheck==null) { inoutCheck=InOutType.OUT; }
            else if (gateCheck.getIn_out().equals(InOutType.OUT)) { inoutCheck=InOutType.OUT; }
            else { inoutCheck=InOutType.IN; }

            System.out.println("inoutCheck: "+inoutCheck);
            if( inoutCheck==InOutType.OUT){
                gate.setIn_out(InOutType.IN);
                gateRepository.save(gate);
                return 1;
            }

            return -2;
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("입차에러"+e.getMessage());
            return -1;
        }
    }
}
