package com.imooc.proxy;
/**
 * ͨ���ۺϵķ�ʽʵ�ִ���
 * @author yangyuan
 *
 */
public class Car3 implements Moveable {
	private Car car;
	
	public Car3(Car car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ....");
		car.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ....  ������ʻʱ�䣺" 
				+ (endtime - starttime) + "���룡");
	}

}
