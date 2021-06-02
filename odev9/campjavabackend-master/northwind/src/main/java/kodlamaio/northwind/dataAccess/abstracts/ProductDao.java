package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Student;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Student,Integer>{
	  Student getByProductName(String productName);
	  
	  Student getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	  
	  List<Student> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	  
	  List<Student> getByCategoryIn(List<Integer> categories);
	  
	  List<Student> getByProductNameContains(String productName);
	  
	  List<Student> getByProductNameStartsWith(String productName);
	  
	  @Query("From Product where productName=:productName and category.categoryId=:categoryId")
	  List<Student> getByNameAndCategory(String productName, int categoryId);
	  
	  @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto"
	  		+ "(p.id, p.productName, c.categoryName) "
	  		+ "From Category c Inner Join c.products p")
	  List<ProductWithCategoryDto> getProductWithCategoryDetails();
	  
	  //select p.productId,p.productName, c.categoryName  from Category c inner join Product p
	  //on c.categoryId = p.categoryId
	  
	 
}
