package com.bj.xnbb.domain;

public class Request {

    //精度 维度 频率 功率 发射站挂高 接收站挂高 ...
    private double sourceLon, sourceLat,freqMHz,percentTime,power, antHeight_Center,antH2, targetLat,targetLon;

    public double getSourceLon() {
        return sourceLon;
    }

    public void setSourceLon(double sourceLon) {
        this.sourceLon = sourceLon;
    }

    public double getSourceLat() {
        return sourceLat;
    }

    public void setSourceLat(double sourceLat) {
        this.sourceLat = sourceLat;
    }

    public double getFreqMHz() {
        return freqMHz;
    }

    public void setFreqMHz(double freqMHz) {
        this.freqMHz = freqMHz;
    }

    public double getPercentTime() {
        return percentTime;
    }

    public void setPercentTime(double percentTime) {
        this.percentTime = percentTime;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getAntHeight_Center() {
        return antHeight_Center;
    }

    public void setAntHeight_Center(double antHeight_Center) {
        this.antHeight_Center = antHeight_Center;
    }

    public double getAntH2() {
        return antH2;
    }

    public void setAntH2(double antH2) {
        this.antH2 = antH2;
    }

    public double getTargetLat() {
        return targetLat;
    }

    public void setTargetLat(double targetLat) {
        this.targetLat = targetLat;
    }

    public double getTargetLon() {
        return targetLon;
    }

    public void setTargetLon(double targetLon) {
        this.targetLon = targetLon;
    }
}
