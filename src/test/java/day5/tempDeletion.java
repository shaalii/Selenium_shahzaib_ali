package day5;

import java.io.File;

public class tempDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\shaali13\\AppData\\Local\\Temp");
		File f1=new File("C:\\Windows\\Temp");
		String list1[]=f.list();
		String list[]=f1.list();
		System.out.println(list1.length);
		System.out.println(list.length);
		for(int i=0;i<list1.length;i++) {
		System.out.println(list1[0]);
			File k=new File("C:\\Users\\shaali13\\AppData\\Local\\Temp\\"+list1[0]);
			System.out.println("C:\\Users\\shaali13\\AppData\\Local\\Temp"+list1[0]);
			k.delete();
		}
		//}
		/*for(int i=0;i<list.length;i++) {
		    File k=new File("C:\\Windows\\Temp"+list[i]);
		    k.delete();
		}*/
		

	}

}
