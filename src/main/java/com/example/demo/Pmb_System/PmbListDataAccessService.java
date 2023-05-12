package com.example.demo.Pmb_System;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("ListPmb")
public class PmbListDataAccessService implements PmbDao {
    private static List<Pmb> pmbs;
    static {
        pmbs = new ArrayList<>();
        Pmb RimaF = new Pmb(
                1,
                "Rima Farniamul Munaimah",
                "089453422",
                123
        );
        pmbs.add(RimaF);

        Pmb halimah = new Pmb(
                2,
                "Halimatus Sya'diyah",
                "08945377897",
                456
        );
        pmbs.add(halimah);

        Pmb vira = new Pmb(
                3,
                "Vira Al Firqotun Najiah",
                "089453422",
                789
        );
        pmbs.add(vira);

        Pmb nayla = new Pmb(
                4,
                "Nayla Sahidah",
                "0894524356",
                987
        );
        pmbs.add(nayla);

        Pmb anggun = new Pmb(
                5,
                "Anggun Agustina",
                "08945476543",
                765
        );
        pmbs.add(anggun);
    }

    @Override
    public List<Pmb> selectAllPmb()
    {
        return pmbs;
    }

    @Override
    public Optional<Pmb> selectPmbById(int id) {
        return pmbs.stream()
                .filter(pmb -> pmb.getId().equals(id))
                .findFirst();
    }


    @Override
    public void insertPmb(Pmb pmb) {
        pmbs.add(pmb);
    }

    @Override
    public boolean existPersonWithNoWa(String noWa) {
        return false;
    }
}
