package services;

import model.Programmer;

public class ProgrammerService {

	public String SayHi(String name){
		Programmer programmer=new Programmer(name);
		return String.format("Hi, I'm a programmer and my name is %s", programmer.getName());
	}
}
