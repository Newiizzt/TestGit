package th.co.orcsoft.training.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import th.co.orcsoft.training.model.UserDTO;


//Crudrepo or repo for connect DB
@Repository
public class UserRepo {
	public List<UserDTO> getUser(){
		List<UserDTO> userList = new ArrayList<>();
		for(int i = 1; i<10; i++) {
			UserDTO user = new UserDTO();
			user.setName("name"+i);
			userList.add(user);
		}
		return userList;
		
	}
}
