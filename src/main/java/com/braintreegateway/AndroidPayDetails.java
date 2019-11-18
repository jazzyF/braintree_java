package com.braintreegateway;

import com.braintreegateway.util.NodeWrapper;

public class AndroidPayDetails {
    private String cardType;
    private String last4;
    private String sourceCardType;
    private String sourceCardLast4;
    private String sourceDescription;
    private String virtualCardType;
    private String virtualCardLast4;
    private String expirationMonth;
    private String expirationYear;
    private String token;
    private String googleTransactionId;
    private String bin;
    private String imageUrl;
    private String prepaid;
    private String healthcare;
    private String debit;
    private String durbinRegulated;
    private String commercial;
    private String payroll;
    private String issuingBank;
    private String countryOfIssuance;
    private String productId;
    private String globalId;

    public AndroidPayDetails(NodeWrapper node) {
        this.sourceCardType = node.findString("source-card-type");
        this.sourceCardLast4 = node.findString("source-card-last-4");
        this.sourceDescription = node.findString("source-description");
        this.virtualCardType = node.findString("virtual-card-type");
        this.virtualCardLast4 = node.findString("virtual-card-last-4");
        this.cardType = this.virtualCardType;
        this.last4 = this.virtualCardLast4;
        this.expirationMonth = node.findString("expiration-month");
        this.expirationYear = node.findString("expiration-year");
        this.token = node.findString("token");
        this.googleTransactionId = node.findString("google-transaction-id");
        this.bin = node.findString("bin");
        this.imageUrl = node.findString("image-url");
        this.prepaid = node.findString("prepaid");
        this.healthcare = node.findString("healthcare");
        this.debit = node.findString("debit");
        this.durbinRegulated = node.findString("durbin-regulated");
        this.commercial = node.findString("commercial");
        this.payroll = node.findString("payroll");
        this.issuingBank = node.findString("issuing-bank");
        this.countryOfIssuance = node.findString("country-of-issuance");
        this.productId = node.findString("product-id");
        this.globalId = node.findString("global-id");
    }

    public String getCardType() {
        return cardType;
    }

    public String getLast4() {
        return last4;
    }

    public String getSourceCardType() {
        return sourceCardType;
    }

    public String getSourceCardLast4() {
        return sourceCardLast4;
    }

    public String getSourceDescription() {
        return sourceDescription;
    }

    public String getVirtualCardType() {
        return virtualCardType;
    }

    public String getVirtualCardLast4() {
        return virtualCardLast4;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public String getToken() {
        return token;
    }

    public String getGoogleTransactionId() {
        return googleTransactionId;
    }

    public String getBin() {
        return bin;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    
    public String getPrepaid() {
        return prepaid;
    }

    public String getHealthcare() {
        return healthcare;
    }

    public String getDebit() {
        return debit;
    }

    public String getDurbinRegulated() {
        return durbinRegulated;
    }

    public String getCommercial() {
        return commercial;
    }

    public String getPayroll() {
        return payroll;
    }

    public String getIssuingBank() {
        return issuingBank;
    }

    public String getCountryOfIssuance() {
        return countryOfIssuance;
    }

    public String getProductId() {
        return productId;
    }

    public String getGlobalId() {
        return globalId;
    }
}
