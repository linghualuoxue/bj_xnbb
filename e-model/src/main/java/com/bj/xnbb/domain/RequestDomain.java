package com.bj.xnbb.domain;

public class RequestDomain {

    private PointerStation sourcePointer; //根据收发站挂高比计算出的发送站
    private PointerStation targetPointer; //根据收发站挂高比计算出的接收站

    private double freqMHz,percentTime,power;//频率, 时间比, 功率

    public PointerStation getSourcePointer() {
        return sourcePointer;
    }

    public void setSourcePointer(PointerStation sourcePointer) {
        this.sourcePointer = sourcePointer;
    }

    public PointerStation getTargetPointer() {
        return targetPointer;
    }

    public void setTargetPointer(PointerStation targetPointer) {
        this.targetPointer = targetPointer;
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


 public static class PointerStation{

    //精度 维度 挂高
    private double lon,lat, hight;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

  }
}