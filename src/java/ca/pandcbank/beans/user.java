
package ca.pandcbank.beans;

import java.io.Serializable;

public class user implements Serializable {

private int userId;
private String username;
private String cardNo;
private String password;

    public user() {
    }

    public user(int userId, String username, String cardNo, String password) {
        this.userId = userId;
        this.username = username;
        this.cardNo = cardNo;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
