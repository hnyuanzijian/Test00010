package com.yuanzijian07;

//ʵ�ֹ�ϵ�������ڲ���
interface Dao{

	public void add();
}


class Outer{

	public void print(){
		//����һ�������ڲ���Ķ���
		new Dao(){   //���ǽӿڲ��ܴ�����������ô�����ֿ����ˣ�
			 
			 public void add(){
				System.out.println("��ӳɹ�");
			 }
		}.add();
	}
}

class Demo7 
{
	public static void main(String[] args) 
	{
		test(new Dao(){
			
			public void add(){
				System.out.println("���Ա���ɹ�");
			}
		});
	}

	//�����������...
	public static void  test(Dao d){  //�β�������һ���ӿ�����..
		d.add();
	}
}

