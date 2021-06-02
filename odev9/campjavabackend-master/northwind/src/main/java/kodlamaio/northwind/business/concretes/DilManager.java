package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.DilService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.entities.concretes.Student;

@Service
public class DilManager implements DilService{

	private UserDao userDao;

	@Autowired
	public DilManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	
	public Result add1(Student student) {
		this.userDao.save(student);
		return new SuccessResult("Öğrenci eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email)
				,"Öğrenci bulundu");
	}

	@Override
	public Result add(Student ogrenci) {
		// TODO Auto-generated method stub
		return null;
	}

}
