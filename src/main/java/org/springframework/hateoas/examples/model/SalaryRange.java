package org.springframework.hateoas.examples.model;

public class SalaryRange {

	private Integer localityId;
	private Integer lowerSalaryLimit;
	private Integer upperSalaryLimit;
	private Double salaryValue = 1212d;

	public SalaryRange(Integer l, int i, int j) {
		this.localityId = l;
		this.lowerSalaryLimit = i;
		this.upperSalaryLimit = j;
		
	}

	public Integer getLocalityId() {
		return localityId;
	}

	public void setLocalityId(Integer localityId) {
		this.localityId = localityId;
	}

	public Integer getLowerSalaryLimit() {
		return lowerSalaryLimit;
	}

	public void setLowerSalaryLimit(Integer lowerSalaryLimit) {
		this.lowerSalaryLimit = lowerSalaryLimit;
	}

	public Integer getUpperSalaryLimit() {
		return upperSalaryLimit;
	}

	public void setUpperSalaryLimit(Integer upperSalaryLimit) {
		this.upperSalaryLimit = upperSalaryLimit;
	}

	public Double getSalaryValue() {
		return salaryValue;
	}

	public void setSalaryValue(Double salaryValue) {
		this.salaryValue = salaryValue;
	}
	
	

}
