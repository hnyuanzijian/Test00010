package com.yuanzijian17;

/*
fianlly�ͷ���Դ�Ĵ���


*/
import java.io.*;
class Demo6 
{
	public static void main(String[] args) 
	{
		FileReader fileReader = null;
		try{
			//�ҵ�Ŀ���ļ�
			File file = new File("f:\\a.txt");
			//�����������ļ�������ͨ��
			fileReader = new FileReader(file);
			//��ȡ�ļ�
			char[] buf = new char[1024];
			int length = 0; 
			length = fileReader.read(buf);
			System.out.println("��ȡ�������ݣ�"+ new String(buf,0,length));
		}catch(IOException e){
			System.out.println("��ȡ��Դ�ļ�ʧ��....");
		}finally{
			try{
				//�ر���Դ
				fileReader.close();
				System.out.println("�ͷ���Դ�ļ��ɹ�....");
			}catch(IOException e){
				System.out.println("�ͷ���Դ�ļ�ʧ��....");
			}
		}

	}
}
