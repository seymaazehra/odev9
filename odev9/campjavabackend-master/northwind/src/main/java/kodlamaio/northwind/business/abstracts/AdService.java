package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.api.controllers.StudenttWithCategoryDto;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Student;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface AdService {
      DataResult<List<Student>> getAll();
      DataResult<List<Student>> getAllSorted();
      //DataResult<List<Ogrenci>> getAll(int pageNo, int pageSize);
      Result add(Student ogrenci);
     
      DataResult<Student> getByJobName(String OgrenciName);
	  
      DataResult<Student> getByJobNameAndCategoryId(String productName, int categoryId);
	  
      DataResult<List<Student>> getByJobNameOrCategoryId(String productName, int categoryId);
	  
      DataResult<List<Student>> getByCategoryIdIn(List<Integer> categories);
	  
      DataResult<List<Student>> getByJobNameContains(String productName);
	  
      DataResult<List<Student>> getByJobNameStartsWith(String productName);

      
      
     
	DataResult<List<Student>> getByStudentNameContains(String studentName);
	DataResult<Student> getByProductNameAndCategoryId(String studentName, int categoryId);
	DataResult<Student> getByStudentName(String studentName);
	DataResult<List<StudenttWithCategoryDto>> getProductWithCategoryDetails();
      
      
}
