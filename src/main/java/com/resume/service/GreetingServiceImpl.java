package com.resume.service;




import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.Set;



import com.resume.entity.Greeting;
import com.resume.utility.Constant;



public class GreetingServiceImpl implements GreetingService{

	Set<StringBuffer> set= new LinkedHashSet<StringBuffer>();
	
	
	

	public String greet(String greet) {
		
	String name="";
		
		// validation 
		
	if (greet==null || greet.equals(Constant.EMPTY)){
		return greet="Hello Heand Hunter";
	}
	if(greet.length()>1){
		
		String [] wordArray=greet.split(" ");
		
		for(String word:wordArray) {
			
			char first=Character.toUpperCase(word.charAt(0));
			StringBuffer tempName=new StringBuffer(first+word.substring(1));
			set.add(tempName);
			
			
		}
		
		Iterator<StringBuffer> iterator= set.iterator();
		
		while(iterator.hasNext()){
			
			name+=iterator.next()+Constant.SPACE;
			}
		
		
	}
	
		return Constant.HELLO+Constant.SPACE+name.trim();
	}

	@Override
	public Greeting greet() {
		Greeting greetings= new Greeting();
		greetings.setGreet("Hello");
		greetings.setFirstName("Sourav");
		greetings.setLastName("Pati");
		
		return  greetings;
	}

	

	@Override
	public String greetStri() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
