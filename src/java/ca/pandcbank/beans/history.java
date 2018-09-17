
package ca.pandcbank.beans;

import java.io.Serializable;

public class history implements Serializable {

private long accountNo;
private String date;
private String purchase;
private double amount;
private long transactionId;

    public history() {
    }

    public history(long accountNo, String date, String purchase, double amount, long transactionId) {
        this.accountNo = accountNo;
        this.date = date;
        this.purchase = purchase;
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }


}
