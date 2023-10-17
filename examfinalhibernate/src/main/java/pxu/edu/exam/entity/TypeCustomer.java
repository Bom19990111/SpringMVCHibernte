package pxu.edu.exam.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "type_customer")
public class TypeCustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	@NotEmpty(message = "Vui lòng nhập tên loại khách hàng!")
	private String name;

	@OneToMany(mappedBy = "type")
	private List<Customer> customers;

	public TypeCustomer(long id, @NotEmpty(message = "Vui lòng nhập tên loại khách hàng!") String name,
			List<Customer> customers) {
		this.id = id;
		this.name = name;
		this.customers = customers;
	}

	public TypeCustomer() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
