package org.springframework.hateoas.examples.model;

public class Range {

	private Integer id;
	private Double insurancePremium;
	private Long idSixtyPercentRange;
	private Double insurancePremiumSixtyPercentRange;
	private Long idFortyPercentRange;
	private Double insurancePremiumFortyPercentRange;

	public Range() {
	}

	public Range(Integer id, Double insurancePremium, Long idSixtyPercentRange, Double insurancePremiumSixtyPercentRange,
			Long idFortyPercentRange, Double insurancePremiumFortyPercentRange) {
		super();
		this.id = id;
		this.insurancePremium = insurancePremium;
		this.idSixtyPercentRange = idSixtyPercentRange;
		this.insurancePremiumSixtyPercentRange = insurancePremiumSixtyPercentRange;
		this.idFortyPercentRange = idFortyPercentRange;
		this.insurancePremiumFortyPercentRange = insurancePremiumFortyPercentRange;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getInsurancePremium() {
		return insurancePremium;
	}

	public void setInsurancePremium(Double insurancePremium) {
		this.insurancePremium = insurancePremium;
	}

	public Long getIdSixtyPercentRange() {
		return idSixtyPercentRange;
	}

	public void setIdSixtyPercentRange(Long idSixtyPercentRange) {
		this.idSixtyPercentRange = idSixtyPercentRange;
	}

	public Double getInsurancePremiumSixtyPercentRange() {
		return insurancePremiumSixtyPercentRange;
	}

	public void setInsurancePremiumSixtyPercentRange(Double insurancePremiumSixtyPercentRange) {
		this.insurancePremiumSixtyPercentRange = insurancePremiumSixtyPercentRange;
	}

	public Long getIdFortyPercentRange() {
		return idFortyPercentRange;
	}

	public void setIdFortyPercentRange(Long idFortyPercentRange) {
		this.idFortyPercentRange = idFortyPercentRange;
	}

	public Double getInsurancePremiumFortyPercentRange() {
		return insurancePremiumFortyPercentRange;
	}

	public void setInsurancePremiumFortyPercentRange(Double insurancePremiumFortyPercentRange) {
		this.insurancePremiumFortyPercentRange = insurancePremiumFortyPercentRange;
	}

}
