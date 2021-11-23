package com.cg.pension.management.system.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "pension_details")
public class PensionDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pensionid;
	private Double amount;
	 private Double charges;
	 private String bankType;
	 private int statusCode;
	 
	 @OneToOne
	 @JoinColumn(name="paymentId")
	 private PaymentDetails paymentDetails;

	public PensionDetails() {
		super();
	}

	public PensionDetails(int pensionid, Double amount, Double charges, String bankType, int statusCode,
			PaymentDetails paymentDetails) {
		super();
		this.pensionid = pensionid;
		this.amount = amount;
		this.charges = charges;
		this.bankType = bankType;
		this.statusCode = statusCode;
		this.paymentDetails = paymentDetails;
	}

	public int getPensionid() {
		return pensionid;
	}

	public void setPensionid(int pensionid) {
		this.pensionid = pensionid;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getCharges() {
		return charges;
	}

	public void setCharges(Double charges) {
		this.charges = charges;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@Override
	public String toString() {
		return "PensionDetails [pensionid=" + pensionid + ", amount=" + amount + ", charges=" + charges + ", bankType="
				+ bankType + ", statusCode=" + statusCode + ", paymentDetails=" + paymentDetails + "]";
	}
	
}
