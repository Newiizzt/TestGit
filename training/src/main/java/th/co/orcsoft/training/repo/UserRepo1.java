package th.co.orcsoft.training.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th.co.orcsoft.training.model.UserDTO;

@Repository
public interface UserRepo1 extends CrudRepository<UserDTO, Long> {
	
	//query type 1
	@Query(value="select * from user", nativeQuery=true)
	public List<UserDTO> getUser();
	
	//query type2 JPA
	@Query(value="select user from UserDTO user")
	public List<UserDTO> getUser1();

}
