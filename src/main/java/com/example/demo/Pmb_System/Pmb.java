package com.example.demo.Pmb_System;

import jakarta.persistence.*;

import java.util.Objects;

@Table
@Entity
public class Pmb {
    @Id
    @SequenceGenerator(
            name = "pmb_id_sequence",
            sequenceName = "pmb_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pmb_id_sequence"
    )
    private int id;
    @Column(
            nullable = false
    )
    private String nama;
    @Column(
            nullable = false
    )
    private String noWa;



    @Column(
    nullable = false
    )
    private double password;

    public Pmb(){
    }

    public Pmb(int id, String nama, String noWa, double password) {
        this.id = id;
        this.nama = nama;
        this.noWa = noWa;
        this.password = password;
    }

    public Pmb(String nama, String noWa, double password) {
        this.nama = nama;
        this.noWa = noWa;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoWa() {
        return noWa;
    }

    public void setNoWa(String noWa) {
        this.noWa = noWa;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pmb pmb = (Pmb) o;
        return Objects.equals(id, pmb.id) &&
                Objects.equals(nama, pmb.nama) &&
                Objects.equals(noWa, pmb.noWa)&&
                Objects.equals(password, pmb.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return "...PMB System..." +
                "id \t\t\t\t: " + id +
                "Nama Lengkap\t: " + nama +
                "No Wa\t\t\t: " + noWa +
                "Password\t\t: " + password;
    }
}
