package com.src.ryouji.victim.RyoujiVictimClub.AppConfig;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class ApplicationConfig extends Application{
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(com.src.ryouji.victim.RyoujiVictimClub.Resources.RyoujiVictimResources.class);
		return classes;
	}

}
