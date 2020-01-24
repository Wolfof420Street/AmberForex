package models;

import java.util.Objects;

public class user {
    int userId ;
    String name ;
    String email ;
    String password ;
    String confirm;
    String country ;
    String broker ;
    String account ;
    int login ;
    String tradepassword;

    public user(int userId, String name, String email, String password, String confirm, String country, String broker, String account, int login, String tradepassword) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirm = confirm;
        this.country = country;
        this.broker = broker;
        this.account = account;
        this.login = login;
        this.tradepassword = tradepassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof user)) return false;
        user user = (user) o;
        return getName() == user.getName() &&
                getUserId() == user.getUserId() && getPassword() == user.getPassword() && getConfirm() == user.getConfirm()
                && getAccount() == user.getAccount() && getBroker() == user.getBroker() && getLogin() == user.getLogin() && getTradepassword() == user.getTradepassword() &&
                Objects.equals(getEmail(), user.getEmail()
                );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getName(), getEmail(), getPassword(), getConfirm(), getCountry(), getBroker(), getAccount(), getLogin(), getTradepassword());
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getTradepassword() {
        return tradepassword;
    }

    public void setTradepassword(String tradepassword) {
        this.tradepassword = tradepassword;
    }
}
