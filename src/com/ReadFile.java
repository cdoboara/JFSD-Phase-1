package com;

import java.io.File;
import java.io.FileWriter;
public class ReadFile {
	public boolean findFile(String fileName) {
		boolean k;
		File path = new File("/home/calindoboara1vo/Desktop/Java_FSD/Phase1/files/");
		File ff = new File("/home/calindoboara1vo/Desktop/Java_FSD/Phase1/files/"+fileName);
		k=ff.exists();
		return k;
	}
public void addFile(String fileName)throws Exception {
	if(findFile(fileName)) {
		System.out.println("File already exists!");
		
	}else {
		FileWriter fw = new FileWriter("/home/calindoboara1vo/Desktop/Java_FSD/Phase1/files/"+fileName);
		fw.flush();
		System.out.println("File created ");
	}
		
	}
	
public void deleteFile(String fileName) {
	if(findFile(fileName)) {
		File ff = new File("/home/calindoboara1vo/Desktop/Java_FSD/Phase1/files/"+fileName);
		ff.delete();
		System.out.println("File deleted");
		
	}else System.out.println("File does not exist!");
	
}
	
	public void  ListFile() {
		File ff = new File("/home/calindoboara1vo/Desktop/Java_FSD/Phase1/files/");
		String s1[]=ff.list();
		int dim=s1.length;
		int k=0;
		int ord=0;
		SortFile sort1=new SortFile();
		
		do {
			k=0;
			for(int i=0;i<dim-1;i++) {
				
				ord=sort1.Sort(s1[i],s1[i+1]);
				
				if(ord==1) {
					String temp=s1[i];
					s1[i]=s1[i+1];
					s1[i+1]=temp;
					k=1;
					
				}
				else if(ord==2) { 
					//correct order - no action
				}
				else if(ord==0) {
					//correct order are equal  -- no action
				}
			}
			
			
		}while(k==1);
		
		System.out.println("The files are: ");
		for(int i=0;i<dim;i++) {
			System.out.println(s1[i]);
		
		}

		
	}

	public static void main(String[] args) {
		
	}

}
