package kodlamaio.northwind.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.api.controllers.StudenttWithCategoryDto;
import kodlamaio.northwind.business.abstracts.AdService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Student;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@Service
public class AdManager implements AdService{

	private ProductDao productDao;
	
	@Autowired
	public AdManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Student>> getAll() {
		    
			return new SuccessDataResult<List<Student>>
			(this.productDao.findAll(),"Data listelendi");			
				
	}

	@Override
	public Result add(Student product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

	

	@Override
	public DataResult<Student> getByProductNameAndCategoryId(String productName, int categoryId) {
		//business codes
		
		return new SuccessDataResult<Student>
		(this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"Data listelendi");
	}

	@Override
	public DataResult<List<Student>> getByCategoryIdIn(List<Integer> categories) {
		return new SuccessDataResult<List<Student>>
		(this.productDao.getByCategoryIn(categories),"Data listelendi");
	}


	

	

	@Override
	public DataResult<List<Student>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"productName");
		return new SuccessDataResult<List<Student>>
		(this.productDao.findAll(sort),"Başarılı");
	}

	
	@Override
	public DataResult<Student> getByJobName(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Student> getByJobNameAndCategoryId(String studentName, int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Student>> getByJobNameOrCategoryId(String studentName, int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Student>> getByJobNameContains(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Student>> getByJobNameStartsWith(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Student>> getByStudentNameContains(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Student> getByStudentName(String studentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<StudenttWithCategoryDto>> getProductWithCategoryDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
