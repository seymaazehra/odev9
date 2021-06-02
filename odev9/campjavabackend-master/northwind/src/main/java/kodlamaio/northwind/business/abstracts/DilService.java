package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Student;

public interface DilService {
	Result add(Student ogrenci);
	DataResult<User> findByEmail(String email);
	Result add1(Student student);
}
