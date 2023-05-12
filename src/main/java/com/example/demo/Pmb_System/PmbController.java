package com.example.demo.Pmb_System;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pmbSystem")
public class PmbController {
    private final PmbService pmbService;

    public PmbController(PmbService pmbService) {
        this.pmbService = pmbService;
    }

    @GetMapping
    public List<Pmb> getPmbs(){

        return pmbService.getAllPmb();
    }

    @GetMapping("{pmbId}")
    public Pmb getPmb(
            @PathVariable("pmbId") Integer pmbId) {
        return pmbService.getPmb(pmbId);
    }
    @PostMapping
    public void registerPmb(
            @RequestBody PmbRegistrationRequest request){
        pmbService.addPmb(request);
    }
}
