package com.wisencrazy.common;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@ApplicationScoped
public class SidGenerator {
	
//	private static UUID uuid = UUID.randomUUID(); 
	
	public String getUUID(){
		return UUID.randomUUID().toString().replace("-","") + UUID.randomUUID().toString().replace("-","");
	}
	
	public String get32CharacterUUID(){
		return UUID.randomUUID().toString().replace("-","") ;
	}
	
	@Produces @SidQualifier String next(){
		return getUUID();
	}
	
	@Produces @SessionId String get32bitUUID(){
		return get32CharacterUUID();
	}
	
	public static void main(String[] args) {
		for(int i =0; i< 80; i++ ){
			SidGenerator sidGenerator = new SidGenerator();
			System.out.println(sidGenerator.getUUID());
		}
	}
}
