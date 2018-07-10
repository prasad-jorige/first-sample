/**
 * 
 */
package com.pm.model;

import java.util.Date;

/**
 * @author prasadj
 *
 */
public class TxnInfo {

	private Long id;
	
	
	private Long txnId;
	
	private Double txnAmount;
	
	private Double feeAmount;
	
	private Double commissionAmount;
	
	private Double totalAmount;
	
	private Long currencyId;
	
	private Integer txnStatus;
	
	private Date txnStartDate;
	
	private Date txnEndDate;
	
	
	private String orderId;
	
	private String orderDetails;
	
	
	private String cardCategory;
	
	private String cardType;
	
	private String cardLastNums;
	
	private String cardIssuer;
	
	private String cardBin;
	
	private String cardNumber;
	
	private String cardExpiry;
	
	
	private String bank;
	
	private String bankIfsc;
	
	private String bankAccount;
	
	private String walletAccount;
	
	private String issuerCountry;
	
	
	private String settlementId;
	
	private Double settledAmount;
	
	private Date settledOn;
	
	private Integer settlementStatus;
	
	
	private String storeId;
	
	private String website;
	
	private String corporate;
	
	private String responseCode;
	
	private Integer paymentTypeId; //wallet/card/net banking etc
	
	private Long channelId; // paytm wallet/ mobiquick wallet/ paytm pg/razorpay pg etc
	
	public TxnInfo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTxnId() {
		return txnId;
	}

	public void setTxnId(Long txnId) {
		this.txnId = txnId;
	}

	public Double getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(Double txnAmount) {
		this.txnAmount = txnAmount;
	}

	public Double getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public Double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public Integer getTxnStatus() {
		return txnStatus;
	}

	public void setTxnStatus(Integer txnStatus) {
		this.txnStatus = txnStatus;
	}

	public Date getTxnStartDate() {
		return txnStartDate;
	}

	public void setTxnStartDate(Date txnStartDate) {
		this.txnStartDate = txnStartDate;
	}

	public Date getTxnEndDate() {
		return txnEndDate;
	}

	public void setTxnEndDate(Date txnEndDate) {
		this.txnEndDate = txnEndDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getCardCategory() {
		return cardCategory;
	}

	public void setCardCategory(String cardCategory) {
		this.cardCategory = cardCategory;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardLastNums() {
		return cardLastNums;
	}

	public void setCardLastNums(String cardLastNums) {
		this.cardLastNums = cardLastNums;
	}

	public String getCardIssuer() {
		return cardIssuer;
	}

	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}

	public String getCardBin() {
		return cardBin;
	}

	public void setCardBin(String cardBin) {
		this.cardBin = cardBin;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankIfsc() {
		return bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getWalletAccount() {
		return walletAccount;
	}

	public void setWalletAccount(String walletAccount) {
		this.walletAccount = walletAccount;
	}

	public String getIssuerCountry() {
		return issuerCountry;
	}

	public void setIssuerCountry(String issuerCountry) {
		this.issuerCountry = issuerCountry;
	}

	public String getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}

	public Double getSettledAmount() {
		return settledAmount;
	}

	public void setSettledAmount(Double settledAmount) {
		this.settledAmount = settledAmount;
	}

	public Date getSettledOn() {
		return settledOn;
	}

	public void setSettledOn(Date settledOn) {
		this.settledOn = settledOn;
	}

	public Integer getSettlementStatus() {
		return settlementStatus;
	}

	public void setSettlementStatus(Integer settlementStatus) {
		this.settlementStatus = settlementStatus;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCorporate() {
		return corporate;
	}

	public void setCorporate(String corporate) {
		this.corporate = corporate;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public Integer getPaymentTypeId() {
		return paymentTypeId;
	}

	public void setPaymentTypeId(Integer paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
}