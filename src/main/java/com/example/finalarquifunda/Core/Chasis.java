package com.example.finalarquifunda.Core;

import java.io.Serializable;

public class Chasis implements Serializable {
    int cpus;
    Double mmax;
    Double mtotal;
    Double mfree;
    Double elapseTime;
    Double totalSpaceFreeC;
    Double freeSpace;

    public Double getElapseTime() {
        return elapseTime;
    }

    public void setElapseTime(Double elapseTime) {
        this.elapseTime = elapseTime;
    }

    public Double getTotalSpaceFreeC() {
        return totalSpaceFreeC;
    }

    public void setTotalSpaceFreeC(Double totalSpaceFreeC) {
        this.totalSpaceFreeC = totalSpaceFreeC;
    }

    public Double getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(Double freeSpace) {
        this.freeSpace = freeSpace;
    }

    public int getCpus() {
        return cpus;
    }

    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    public Double getMmax() {
        return mmax;
    }

    public void setMmax(Double mmax) {
        this.mmax = mmax;
    }

    public Double getMtotal() {
        return mtotal;
    }

    public void setMtotal(Double mtotal) {
        this.mtotal = mtotal;
    }

    public Double getMfree() {
        return mfree;
    }

    public void setMfree(Double mfree) {
        this.mfree = mfree;
    }
}
