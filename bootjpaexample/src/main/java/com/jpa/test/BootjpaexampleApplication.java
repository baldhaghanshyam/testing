package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		
		//delet method
		
		userRepository.deleteById(5);
		//get data method
//		Iterable<User> optional= userRepository.findAll();
//		optional.forEach(re ->{System.out.println(re);});
//		
//		Iterator<User> iterator=optional.iterator();
//		while(iterator.hasNext())
//		{
//			User user=iterator.next();
//			System.out.println(user);
//		}
			
			
//		});

		
		//update data
//		Optional<User> optional = userRepository.findById(5);
//		User user=optional.get();
//		user.setName("updated name");
//		User result=userRepository.save(user);
//		System.out.println(result);
		
		

		// save multiple data method
//		User user = new User();
//		user.setName("ghanshya");
//		user.setCity("surat");
//		user.setStatus("java");
//
//		User user1 = new User();
//		user1.setName("ghanshya");
//		user1.setCity("surat");
//		user1.setStatus("java");
//
//		User user2 = new User();
//		user2.setName("ghanshya");
//		user2.setCity("surat");
//		user2.setStatus("java");
//
//		List<User> users = List.of(user, user1, user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(results -> {
//			System.out.println(results);
//		});
	}

}
