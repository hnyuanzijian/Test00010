package com.yuanzijian05;

/*
�ֲ��ڲ��ࣺ ��һ���� �ķ����ڲ���������һ���࣬��ô����һ����ͳ���Ϊ�ֲ��ڲ��ࡣ

�ֲ��ڲ���Ҫע���ϸ�ڣ�
	1. ����ֲ� �ڲ��������һ���ֲ���������ô�þֲ���������ʹ��final���Ρ�



*/
class  Outer{

	String name= "�ⲿ���name";

	public void test(){
		//�ֲ�����
		final	int y =100;  // y ʲôʱ����ڴ�����ʧ�� ����ִ�����֮��y��ʧ��

		//�ֲ��ڲ���
		class Inner{     /*
							��test����ִ�����֮����ôy���ϴ��ڴ�����ʧ����Inner�����ڷ���
							ִ����ϵ�ʱ��û�д��ڴ�����ʧ����inner�����print�������ڷ�����
							y��������ʱ���y�����Ѿ���ʧ�ˣ���ô�͸��˸о�y�����������Ѿ����ӳ���
							.

							��������� ���һ���ֲ��ڲ������һ���ֲ�������ʱ����ô���øþֲ��ڲ���
							��������ֲ� ���� �ĸ���Ʒ��				
						*/
			int x = 10;

			public void print(){
				System.out.println("����Ǿֲ��ڲ����print����.."+y);
			}	
		}
		
		Inner inner = new Inner();  //���inner����ʲôʱ����ʧ��  Inner������������ڱȾֲ�����y����������Ҫ����
		inner.print();
	}


}





class Demo5 
{
	public static void main(String[] args) 
	{
		Outer outer = new Outer();
		outer.test();
	}
}

