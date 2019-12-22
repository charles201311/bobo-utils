package com.bobo.common.utils;

import java.awt.geom.Point2D;

public class DistanceUtil {
	 private static final double EARTH_RADIUS = 6371393; // 平均半径,单位：m
	 //输入经纬度，计算两个坐标间的距离
	  public static double getDistance(double j1,double w1,double j2,double w2) {
	    	 Point2D pointDD = new Point2D.Double(j1, w1);
		     Point2D pointXD = new Point2D.Double(j2, w2);
			return calculate(pointDD, pointXD);
	    }
	    /**
	     * 通过AB点经纬度获取距离
	     * @param pointA A�?(经，�?)
	     * @param pointB B�?(经，�?)
	     * @return 距离(单位：米)
	     */
	    public static double calculate(Point2D pointA, Point2D pointB) {
	        // 经纬度（角度）转弧度。弧度用作参数，以调用Math.cos和Math.sin
	        double radiansAX = Math.toRadians(pointA.getX()); // A经弧�?
	        double radiansAY = Math.toRadians(pointA.getY()); // A纬弧�?
	        double radiansBX = Math.toRadians(pointB.getX()); // B经弧�?
	        double radiansBY = Math.toRadians(pointB.getY()); // B纬弧�?
	        double cos = Math.cos(radiansAY) * Math.cos(radiansBY) * Math.cos(radiansAX - radiansBX)
	                + Math.sin(radiansAY) * Math.sin(radiansBY);
	        double acos = Math.acos(cos); // 反余弦�??
	        return EARTH_RADIUS * acos; // �?终结�?
	    }
	    
	  
	    public static void main(String[] args) {
	        // 北京 东单地铁�?
	       // Point2D pointDD = new Point2D.Double(116.425249, 39.914504);
	        // 北京 西单地铁�?
	       // Point2D pointXD = new Point2D.Double(116.382001, 39.913329);
	    	double d = getDistance(116.425249, 39.914504,116.382001, 39.913329);
	        System.out.println("两点的距�?:"+d+"�?");
	    }
}
