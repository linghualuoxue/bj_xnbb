package com.bj.xnbb.util;

public class DistanceUtil {

    private static double EARTH_RADIUS = 6371.393;
    private static double rad(double d)
    {
        return d * Math.PI / 180.0;
    }

    /**
     *
     * @param sourceLat 源维度
     * @param sourceLon 源精度
     * @param targetLat 目标维度
     * @param targetLon 目标精度
     * @return
     */
    public static Double getDistance(double sourceLat,double sourceLon,
                                     double targetLat, double targetLon){

        double radLat1 = rad(sourceLat);
        double radLat2 = rad(targetLat);
        double a = radLat1 - radLat2;
        double b = rad(sourceLon) - rad(targetLon);
        double distance = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) +
                Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
        distance = distance * EARTH_RADIUS;
        distance = Math.round(distance * 1000);
        return distance;
    }

}
