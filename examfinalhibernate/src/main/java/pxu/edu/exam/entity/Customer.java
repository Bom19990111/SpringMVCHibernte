package pxu.edu.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "fullname")
	@NotEmpty(message = "Vui lòng nhập họ tên!")
	private String fullName;

	@Column(name = "birtdate")
	@NotEmpty(message = "Vui lòng nhập ngày sinh!")
	private String birthDate;

	@Column(name = "sex")
	private String sex;

	@Column(name = "phone")
	@Pattern(regexp = "/^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$/", message = "Số điện thoại sai định dạng!")
	private String phone;

	@Column(name = "number_card")
	@NotEmpty(message = "Vui lòng nhập số CMND!")
	private String numberCard;

	@Column(name = "email")
	@Pattern(regexp = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$", message = "email sai định dạng!")
	private String email;

	@Column(name = "address")
	@NotEmpty(message = "Vui lòng nhập địa chỉ!")
	private String address;

	@ManyToOne
	@JoinColumn(name = "type_id")
	private TypeCustomer type;

	public Customer(long id, @NotEmpty(message = "Vui lòng nhập họ tên!") String fullName,
			@NotEmpty(message = "Vui lòng nhập ngày sinh!") String birthDate, String sex,
			@NotEmpty(message = "Vui lòng nhập số điện thoại!") String phone,
			@NotEmpty(message = "Vui lòng nhập số CMND!") String numberCard,
			@NotEmpty(message = "Vui lòng nhập email!") String email,
			@NotEmpty(message = "Vui lòng nhập địa chỉ!") String address, TypeCustomer type) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.sex = sex;
		this.phone = phone;
		this.numberCard = numberCard;
		this.email = email;
		this.address = address;
		this.type = type;
	}

	public Customer() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TypeCustomer getType() {
		return type;
	}

	public void setType(TypeCustomer type) {
		this.type = type;
	}

}
