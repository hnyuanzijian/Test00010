package com.yuanzijian15;

/*

�쳣��ϵ��
--------| Throwable  ���д�������쳣�ĸ���
--------------| Error������
--------------| Exception(�쳣) �쳣һ�㶼ͨ�����봦�� 

------------------| ����ʱ�쳣: ���һ�������ڲ��׳���һ������ʱ�쳣����ô������ ��������Ҳ���Բ� �����������߿����Դ���Ҳ���Բ�����
------------------| ����ʱ�쳣(������ʱ�쳣���ܼ��쳣):  ���һ�������ڲ��׳���һ������ʱ�쳣������ô�����Ͼͱ���Ҫ���������ҵ�����Ҳ����Ҫ����

����ʱ�쳣�� RuntimeException�Լ�RuntimeException���� ������������ʱ�쳣��

����ʱ�쳣�� ��������ʱ�쳣���Ǳ����쳣��


���ʣ� Ϊʲôjava������������ϸ�Ҫ�����ʱ�쳣��������ʱ�쳣��˿��ɣ�

	����ʱ�쳣���ǿ���ͨ������Ա���õı��ϰ��ȥ���⣬����java��������û���ϸ�Ҫ��������ʱ�쳣��


*/
import java.security.acl.*;
class Demo4 
{
	public static void main(String[] args) throws InterruptedException
	{
			int[] arr = null;
			div(4,0,arr);
		
		 Object o = new Object();
		 o.wait();
	}


	public static void div(int a , int b ,int[] arr) {
		if(b==0){
			return;
		}
		int c = a/b;
		System.out.println("c = "+c);

		if(arr!=null){
			System.out.println("����ĳ��ȣ� "+arr.length);
		}
	}
}

