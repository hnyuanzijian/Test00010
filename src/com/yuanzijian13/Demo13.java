package com.yuanzijian13;

/*
sun�ṩ�˺ܶ���쳣��������������������и��ֵĲ��������������sun ����
�ṩ�쳣�໹����������������ʵ���������в������������ô��ʱ�����Ǿ���Ҫ
�Զ����쳣�ࡣ

����: ģ��feiQ���ߵ�ʱ��,���û�в������ߣ���ô���׳�һ��û�в������ߵ��쳣��
����Ѿ����������ϣ���ô��������ʾ�����б�


�Զ����쳣��Ĳ��裺  �Զ���һ����̳�Exception���ɡ�
	


*/

//�Զ�����һ��û�����ߵ��쳣���ˡ�
class NoIpException extends Exception{


	public NoIpException(String message){
		super(message);  //������Exceptionһ�������Ĺ��캯����
	}

}



class Demo2 
{
	public static void main(String[] args) 
	{
		String ip = "192.168.10.100";
		ip = null;
		try{
			feiQ(ip);  // ���������һ�������׳��쳣���͵ķ�������ô�����߱���Ҫ����
		
		
		}catch(NoIpException e){
			e.printStackTrace();
			System.out.println("���ϲ������ߣ�");
		}
		

	}


	public static void feiQ(String ip) throws NoIpException{
		if(ip==null){
			throw new  NoIpException("û�в����߰���С�ף�");
		}
		System.out.println("������ʾ�����б�..");
	}


}

