package com.example.demo.Pmb_System;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("jpaPmb")
public class PmbJPADataAccessService implements PmbDao {
    public PmbJPADataAccessService(PmbRepository pmbRepository){
        this.pmbRepository = pmbRepository;
    }
    private final PmbRepository pmbRepository;

    @Override
    public List<Pmb> selectAllPmb(){
        return pmbRepository.findAll();
    }
    @Override
    public Optional<Pmb> selectPmbById(int id){
        return pmbRepository.findById(id);
    }

    @Override
    public void insertPmb(Pmb pmb) {
        pmbRepository.save(pmb);
    }

    @Override
    public boolean existPersonWithNoWa(String noWa) {
        return false;
    }

}
