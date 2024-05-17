package com.liveasy.roop.demo;

import com.liveasy.roop.demo.repository.loadrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo{

	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}
	@Autowired
	public loadrepo repo;
	public void run(String... args)throws Exception
	{
//		/*todo t1=new todo("tunday kebab","up","lko");
//		tr.save(t1);
//		todo t2=new todo("nihari raheem ","up","lko");
//		tr.save(t2);*/

	}
}