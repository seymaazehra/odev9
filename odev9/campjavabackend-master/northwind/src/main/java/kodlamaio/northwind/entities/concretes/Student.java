package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="students")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    
	    //@Column(name="category_id")
		//private int categoryId;
	    
	    @Column(name="student_name")
		private String ogrenciName;
	    
	    
	    @Column(name="student_dil")
		private String ogrenciDil;
	    
	    @Column(name="student_okul")
		private String ogrenciOkul;
	  
	    @ManyToOne()
	    @JoinColumn(name="student_yetenek")
	    private String studentYetenek;
	    
	    
	   
	    
	    
	
}
