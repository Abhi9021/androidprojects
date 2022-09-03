package com.example.firebase;

public class model {
    String questions;
    String opA;
    String opB;
    String opC;
    String opD;
    String Ans;

    public model(String questions, String opA, String opB, String opC, String opD, String ans) {
        this.questions = questions;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC;
        this.opD = opD;
        Ans = ans;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getOpA() {
        return opA;
    }

    public void setOpA(String opA) {
        this.opA = opA;
    }

    public String getOpB() {
        return opB;
    }

    public void setOpB(String opB) {
        this.opB = opB;
    }

    public String getOpC() {
        return opC;
    }

    public void setOpC(String opC) {
        this.opC = opC;
    }

    public String getOpD() {
        return opD;
    }

    public void setOpD(String opD) {
        this.opD = opD;
    }

    public String getAns() {
        return Ans;
    }

    public void setAns(String ans) {
        Ans = ans;
    }
}
