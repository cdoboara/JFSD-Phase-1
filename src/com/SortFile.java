package com;

public class SortFile {

	public int Sort(String s3,String s4) {
		//compare two strings
		int k=0;
		char c1,c2;
		String s1=s3.toLowerCase();
		String s2=s4.toLowerCase();
		int l1=s1.length();
		int l2=s2.length();
		int i=0;
	    
		do { 
			
			c1=s1.charAt(i);
			c2=s2.charAt(i);
			
			if(c1>c2){
				k=1; 
			}else if(c2>c1){
				k=2; 
				}else if(i+1==l1&&i+1<l2) {
					k=1;
					}else if(i+1==l2&&i+1<l1) {
						k=2;
					}else i++;
			
		} while(i<l1&&i<l2&&k==0);
		return k;

	}

}
