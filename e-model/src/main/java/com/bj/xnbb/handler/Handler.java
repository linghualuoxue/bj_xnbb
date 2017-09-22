package com.bj.xnbb.handler;

import com.bj.xnbb.domain.Request;
import com.bj.xnbb.domain.RequestDomain;
import com.bj.xnbb.util.DistanceUtil;

public class Handler {

    public static void handler(Request request) {

        RequestDomain requestDomain = wrap(request);
        double h1 =  getH1(requestDomain);  // 计算发射/基站天线到接收站的有效高度heff
        double e = getE(h1,requestDomain);  //获取对应点上的场强值
                  //待做, 去除干扰后的场强值
    }

    //对request请求进行包裹
    private static RequestDomain wrap(Request request) {
        RequestDomain requestDomain = new RequestDomain();
        requestDomain.setFreqMHz(request.getFreqMHz());
        requestDomain.setPercentTime(request.getPercentTime());
        requestDomain.setPower(request.getPower());
        doHeightAndLow(requestDomain,request);
        return requestDomain;
    }

    //获取场强
    private static double getE(double h1, RequestDomain request) {
        return 0;
    }


    //获取h1高度
    private static double getH1(RequestDomain request) {
        double h1 = 0;
        double d = getD(request);//获取两点之间的距离
        if(d<=3){
            //h1 = ha
            h1 = request.getSourcePointer().getHight();
        }else if(3<d && d<15){
            //h1 =ha +(heff −ha )(d −3)/12
            double heff = getHeff(request);
            h1 = request.getSourcePointer().getHight()+(heff-request.getSourcePointer().getHight())*(d-3)/12;
        }else {
            //h1 = heff
            double heff = getHeff(request);
            h1 = heff;
        }
        return h1;
    }

    /**
     * 将高的天线值赋值给发送基站
     * @param requestDomain
     * @param request
     */
    private static void doHeightAndLow(RequestDomain requestDomain, Request request) {
        RequestDomain.PointerStation sourcePointer =   new RequestDomain.PointerStation();
        RequestDomain.PointerStation targetPointer =   new RequestDomain.PointerStation();
        if (request.getAntHeight_Center() >= request.getAntH2()){
            sourcePointer.setLat(request.getSourceLat());
            sourcePointer.setLon(request.getSourceLon());
            sourcePointer.setHight(request.getAntHeight_Center());
            targetPointer.setLat(request.getTargetLat());
            targetPointer.setLon(request.getTargetLon());
            targetPointer.setHight(request.getAntH2());
        }else{
            sourcePointer.setLat(request.getTargetLat());
            sourcePointer.setLon(request.getTargetLon());
            sourcePointer.setHight(request.getAntH2());
            targetPointer.setLat(request.getSourceLat());
            targetPointer.setLon(request.getSourceLon());
            targetPointer.setHight(request.getAntHeight_Center());
        }
        requestDomain.setSourcePointer(sourcePointer);
        requestDomain.setTargetPointer(targetPointer);
    }

    private static double getHeff(RequestDomain request) {


        return 0;
    }

    /**
     * 获取两个经纬度之间的距离
     * @param request
     * @return
     */
    private static double getD(RequestDomain request) {

       return   DistanceUtil.getDistance(request.getSourcePointer().getLat(),request.getSourcePointer().getLon(),
                                request.getTargetPointer().getLat(),request.getTargetPointer().getLon());
    }
}
