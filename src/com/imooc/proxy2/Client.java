package com.imooc.proxy2;

public class Client {

	/**
	 * �ۺϴ���Ȼ������������
	 */
	public static void main(String[] args) {
//		//�ȼ�¼ʱ���ټ�¼��־
//		Car car = new Car();
//		CarTimeProxy ctp = new CarTimeProxy(car);
//		CarLogProxy clp =new CarLogProxy(ctp);
//		clp.move();
		
		//�ȼ�¼��־�ټ�¼ʱ��
		Car car = new Car();
		CarLogProxy clp =new CarLogProxy(car);
		CarTimeProxy ctp = new CarTimeProxy(clp);
		ctp.move();
	}

}
