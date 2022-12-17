package com.example.backend.models.entitie;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Program extends BasicEntity{
    public Program() {

    }

    public Program(String current, Long activity1, Long activity2, Long activity3, Long activity4, Long activity5, Long activity6) {
        this.current = current;
        this.activity1 = activity1;
        this.activity2 = activity2;
        this.activity3 = activity3;
        this.activity4 = activity4;
        this.activity5 = activity5;
        this.activity6 = activity6;
    }

    @Column
    private String current;

    @Column
    private Long activity1;


    @Column
    private Long activity2;

    @Column
    private Long activity3;

    @Column
    private Long activity4;

    @Column
    private Long activity5;

    @Column
    private Long activity6;

    public String getCurrent() {
        return current;
    }

    public Program setCurrent(String current) {
        this.current = current;
        return this;
    }

    public Long getActivity2() {
        return activity2;
    }

    public Program setActivity2(Long activity2) {
        this.activity2 = activity2;
        return this;
    }

    public Long getActivity3() {
        return activity3;
    }

    public Program setActivity3(Long activity3) {
        this.activity3 = activity3;
        return this;
    }

    public Long getActivity4() {
        return activity4;
    }

    public Program setActivity4(Long activity4) {
        this.activity4 = activity4;
        return this;
    }

    public Long getActivity5() {
        return activity5;
    }

    public Program setActivity5(Long activity5) {
        this.activity5 = activity5;
        return this;
    }

    public Long getActivity6() {
        return activity6;
    }

    public Program setActivity6(Long activity6) {
        this.activity6 = activity6;
        return this;
    }

    public Long getActivity1() {
        return activity1;
    }

    public Program setActivity1(Long activity1) {
        this.activity1 = activity1;
        return this;
    }
}
