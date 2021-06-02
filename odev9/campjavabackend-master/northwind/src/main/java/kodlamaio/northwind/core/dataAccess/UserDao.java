package kodlamaio.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.entities.concretes.Student;

public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(String email);

	void save(Student student);
}
