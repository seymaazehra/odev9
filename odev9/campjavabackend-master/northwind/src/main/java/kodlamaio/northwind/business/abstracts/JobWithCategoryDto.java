package kodlamaio.northwind.business.abstracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
	@AllArgsConstructor
	@NoArgsConstructor
public class JobWithCategoryDto {
	private int id;
	private String productName;
	private String categoryName;
}
