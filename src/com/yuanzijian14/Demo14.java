package com.yuanzijian14;

/*
����ģ����ȥ��ľͰ���������Ǯ������10�飬��ô���׳�һ��û�д���Ǯ���쳣����
��������ˣ���ô�Ϳ��Գ���������ĵع���ľͰ��.

*/

//����ûǮ���쳣
class NoMoneyException extends Exception {

	public NoMoneyException(String message){
		super(message);
	}

}



class Demo3 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		try{
			eat(9);

		}catch(NoMoneyException e){
			e.printStackTrace();
			System.out.println("����ϴ��һ���£���");
		}
	}


	public static void eat(int money) throws NoMoneyException{
		if(money<10){
			throw new NoMoneyException("�԰�����");
		}
		System.out.println("������������ĵع���ľͰ��!!");
	}
}

