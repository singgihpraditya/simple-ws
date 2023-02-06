package id.co.ogya.soap.service;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class HelloServiceImpl {
	@WebMethod
	public String hello(@WebParam(name = "name") String name) {
		return "Hello " + name + "!";
	}

	@WebMethod
	public User getUser() {
		User user = new User();
		user.setBirthDate(new Date());
		user.setFirstName("singgih");
		user.setLastName("praditya");
		return user;
	}
}
