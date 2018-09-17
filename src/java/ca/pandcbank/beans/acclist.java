package ca.pandcbank.beans;

import java.io.Serializable;

public class acclist implements Serializable {

private String accountName;
private long accountNo;

    public acclist() {
    }

    public acclist(String accountName, long accountNo) {
        this.accountName = accountName;
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

}
