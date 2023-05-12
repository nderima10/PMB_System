package com.example.demo.Pmb_System;

import java.util.List;
import java.util.Optional;

public interface PmbDao {
    List<Pmb> selectAllPmb();
    Optional<Pmb> selectPmbById(int id);
    void insertPmb(Pmb pmb);
    boolean existPersonWithNoWa(String noWa);

}
