package org.springframework.hateoas.examples;

import java.time.LocalDateTime;

public class Quotation {

	private Integer id;
	private String name;
	private String cpf;
	private String email;
	private String phone;
	private String latitude;
	private String longitude;
	private LocalDateTime plantingDate;
	private Integer salaryQuantity;
	private Integer rangeChosen;
	private Double insurancePremium;
	private Double is;
	private LocalDateTime effectiveDate;
	private LocalDateTime createdDate;
	private String summary;

	public Quotation(int id, String name, String cpf, String email, String phone, String latitude, String longitude,
			LocalDateTime plantingDate, Integer salaryQuantity, Integer rangeChosen, Double insurancePremium,
			Double is, LocalDateTime effectiveDate, LocalDateTime createdDate, String summary) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.phone = phone;
		this.latitude = latitude;
		this.longitude = longitude;
		this.plantingDate = plantingDate;
		this.salaryQuantity = salaryQuantity;
		this.rangeChosen = rangeChosen;
		this.insurancePremium = insurancePremium;
		this.is = is;
		this.effectiveDate = effectiveDate;
		this.createdDate = createdDate;
		this.summary = summary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public LocalDateTime getPlantingDate() {
		return plantingDate;
	}

	public void setPlantingDate(LocalDateTime plantingDate) {
		this.plantingDate = plantingDate;
	}

	public Integer getSalaryQuantity() {
		return salaryQuantity;
	}

	public void setSalaryQuantity(Integer salaryQuantity) {
		this.salaryQuantity = salaryQuantity;
	}

	public Integer getRangeChosen() {
		return rangeChosen;
	}

	public void setRangeChosen(Integer rangeChosen) {
		this.rangeChosen = rangeChosen;
	}

	public Double getInsurancePremium() {
		return insurancePremium;
	}

	public void setInsurancePremium(Double insurancePremium) {
		this.insurancePremium = insurancePremium;
	}

	public Double getIs() {
		return is;
	}

	public void setIs(Double is) {
		this.is = is;
	}

	public LocalDateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Quotation [id=" + id + ", name=" + name + ", cpf=" + cpf + ", email=" + email + ", phone=" + phone
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", plantingDate=" + plantingDate
				+ ", salaryQuantity=" + salaryQuantity + ", rangeChosen=" + rangeChosen + ", insurancePremium="
				+ insurancePremium + ", is=" + is + ", effectiveDate=" + effectiveDate + ", createdDate=" + createdDate
				+ ", summary=" + summary + "]";
	}

}
