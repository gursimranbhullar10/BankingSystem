
package ca.pandcbank.beans;

import java.io.Serializable;


public class accounts implements Serializable {

private long userId;
private long savingNo;
private long chequingNo;
private long creditNo;
private long investmentNo;

    public accounts() {
    }

    public accounts (long userId, long savingNo, long chequingNo, long creditNo, long investmentNo) {
        this.userId = userId;
        this.savingNo = savingNo;
        this.chequingNo = chequingNo;
        this.creditNo = creditNo;
        this.investmentNo = investmentNo;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getSavingNo() {
        return savingNo;
    }

    public void setSavingNo(long savingNo) {
        this.savingNo = savingNo;
    }

    public long getChequingNo() {
        return chequingNo;
    }

    public void setChequingNo(long chequingNo) {
        this.chequingNo = chequingNo;
    }

    public long getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(long creditNo) {
        this.creditNo = creditNo;
    }

    public long getInvestmentNo() {
        return investmentNo;
    }

    public void setInvestmentNo(long investmentNo) {
        this.investmentNo = investmentNo;
    }


}
