package com.yuanzijian16;

/*
finally �飻

finally��� ʹ��ǰ���Ǳ���Ҫ����try�����ʹ�á�

finally��Ĵ������κ�����¶���ִ�еģ�����jvm�˳��������

finally�ǳ��ʺ�����Դ�ͷŵĹ����������ӿ��Ա�֤��Դ�ļ����κ�����¶� �ᱻ�ͷš�



try���������Ϸ�ʽ��


��һ�֣� �Ƚ����������쳣Ҫ��������û����ԴҪ�ͷŵġ�
		 try{

			���ܷ����쳣�Ĵ���
	
			}catch(������쳣���� ������){
				�����쳣�Ĵ���
			}

�ڶ��֣��Ƚ������ڼ����쳣Ҫ������Ҫ�ͷ���Դ�Ĵ��롣
		
		try{

			���ܷ����쳣�Ĵ���
	
			}catch(������쳣���� ������){
				�����쳣�Ĵ���
			}finally{ 
				�ͷ���Դ�Ĵ���;
			}

�����֣� �Ƚ��������ڲ��׳���������ʱ�쳣����������ԴҪ���ͷš�
		   try{

			���ܷ����쳣�Ĵ���
	
			}finally{ 
				�ͷ���Դ�Ĵ���;
			}
	
*/


class Demo5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		div(4,0);
	}


	public static void div(int a, int b){
		try{
			if(b==0){
				System.exit(0);//�˳�jvm
			}
			int c = a/b;
			System.out.println("c="+ c);

		}catch(Exception e){
			System.out.println("���˳���Ϊ0���쳣...");
			throw e;
		}finally{
			System.out.println("finall��Ĵ���ִ����..");
		}
	}
}

