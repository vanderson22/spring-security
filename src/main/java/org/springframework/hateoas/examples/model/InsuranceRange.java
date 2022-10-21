package org.springframework.hateoas.examples.model;

public class InsuranceRange {

	private String localityId;
	private Range[] range;

	public InsuranceRange(String localityId, Range[]  range) {
		this.localityId = localityId;
		this.range = range;
	}

	public String getLocalityId() {
		return localityId;
	}

	public void setLocalityId(String localityId) {
		this.localityId = localityId;
	}

	public Range[] getRange() {
		return range;
	}

	public void setRange(Range[] range) {
		this.range = range;
	}

}
