package com.example.demo.Pmb_System;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.DuplicateFormatFlagsException;
import java.util.List;

@Service
public class PmbService {
    private final PmbDao pmbDao;
    public PmbService(@Qualifier("jpaPmb")PmbDao pmbDao){

        this.pmbDao = pmbDao;
    }
    public List<Pmb> getAllPmb(){
        return pmbDao.selectAllPmb();
    }
    public Pmb getPmb(Integer id){
        return pmbDao.selectPmbById(id).orElseThrow(
                () -> new ResourceNotFoundException(
                        "pmb with id [%s] already exist".formatted(id)));
    }
    public void addPmb(PmbRegistrationRequest pmbRegistrationRequest){
        String noWa = pmbRegistrationRequest.noWa();
        if (pmbDao.existPersonWithNoWa(pmbRegistrationRequest.noWa())){
            throw new DuplicateFormatFlagsException(
                    "pmb with noWa [%s] already exist".formatted(noWa));
        }
        Pmb pmb  = new Pmb(
                pmbRegistrationRequest.nama(),
                pmbRegistrationRequest.noWa(),
                pmbRegistrationRequest.password());
        pmbDao.insertPmb(pmb);
    }
}

