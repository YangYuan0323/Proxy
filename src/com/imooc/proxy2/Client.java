package com.imooc.proxy2;

public class Client {

	/**
	 * 聚合代理比基础代理更合适
	 */
	public static void main(String[] args) {
//		//先记录时间再记录日志
//		Car car = new Car();
//		CarTimeProxy ctp = new CarTimeProxy(car);
//		CarLogProxy clp =new CarLogProxy(ctp);
//		clp.move();
		
		//先记录日志再记录时间
		Car car = new Car();
		CarLogProxy clp =new CarLogProxy(car);
		CarTimeProxy ctp = new CarTimeProxy(clp);
		ctp.move();
	}

}
