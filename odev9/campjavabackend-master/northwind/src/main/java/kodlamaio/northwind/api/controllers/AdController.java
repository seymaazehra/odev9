package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.AdService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Student;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
@Service
@RestController
@RequestMapping("/api/students")
public class AdController {
	
	
	private AdService adService;
	
	
	@Autowired
	public AdController(AdService adService) {
		super();
		this.adService = adService;
	}


	@GetMapping("/getall")
	public DataResult<List<Student>> getAll(){
		return this.adService.getAll();
	}
	
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult<List<StudenttWithCategoryDto>> getProductWithCategoryDetails(){
		return this.adService.getProductWithCategoryDetails();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Student product) {
		return this.adService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Student> getByProductName(@RequestParam String StudentName){
		return this.adService.getByStudentName(StudentName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Student> 
	getByProductNameAndCategoryId(@RequestParam("productName") String studentName,@RequestParam("categoryId") int categoryId){
		System.out.println(studentName);
		System.out.println(categoryId);
		
		return this.adService.getByProductNameAndCategoryId
				(studentName, categoryId);
	}
	
	@GetMapping("/getByStudentNameContains")
	public DataResult<List<Student>> getByProductNameContains(@RequestParam String studentName){
		return this.adService.getByStudentNameContains(studentName);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Student>> getAllSorted() {
		return this.adService.getAllSorted();
	}
	
	
}
