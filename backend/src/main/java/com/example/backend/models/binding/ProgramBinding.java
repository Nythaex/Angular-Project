package com.example.backend.models.binding;

public class ProgramBinding {
    private Long activity1;
    private Long activity2;
    private Long activity3;
    private Long activity4;
    private Long activity5;
    private Long activity6;

    public ProgramBinding() {
    }

    public ProgramBinding(Long activity1, Long activity2, Long activity3, Long activity4, Long activity5, Long activity6) {
        this.activity1 = activity1;
        this.activity2 = activity2;
        this.activity3 = activity3;
        this.activity4 = activity4;
        this.activity5 = activity5;
        this.activity6 = activity6;
    }

    public Long getActivity1() {
        return activity1;
    }

    public ProgramBinding setActivity1(Long activity1) {
        this.activity1 = activity1;
        return this;
    }

    public Long getActivity2() {
        return activity2;
    }

    public ProgramBinding setActivity2(Long activity2) {
        this.activity2 = activity2;
        return this;
    }

    public Long getActivity3() {
        return activity3;
    }

    public ProgramBinding setActivity3(Long activity3) {
        this.activity3 = activity3;
        return this;
    }

    public Long getActivity4() {
        return activity4;
    }

    public ProgramBinding setActivity4(Long activity4) {
        this.activity4 = activity4;
        return this;
    }

    public Long getActivity5() {
        return activity5;
    }

    public ProgramBinding setActivity5(Long activity5) {
        this.activity5 = activity5;
        return this;
    }

    public Long getActivity6() {
        return activity6;
    }

    public ProgramBinding setActivity6(Long activity6) {
        this.activity6 = activity6;
        return this;
    }
}
