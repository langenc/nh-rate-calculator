package model;

public class RateRequest {
	
	public int months;
	public Double amount;
	public Boolean roundFirstRate;
	

	public RateRequest() {
		
	};

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Boolean getRoundFirstRate() {
		return roundFirstRate;
	}

	public void setRoundFirstRate(Boolean roundFirstRate) {
		this.roundFirstRate = roundFirstRate;
	}

}
