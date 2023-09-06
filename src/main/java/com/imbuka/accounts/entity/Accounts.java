package com.imbuka.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Accounts {

    @Column(name = "customer_id")
    private int customerId;
    @Id
    @Column(name = "account_number")
    private long accountNumber;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "branch_address")
    private String branchAddress;
    @Column(name = "create_dt")
    private LocalDate createDt;

    public int getCustomerId() {
        return this.customerId;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getBranchAddress() {
        return this.branchAddress;
    }

    public LocalDate getCreateDt() {
        return this.createDt;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public void setCreateDt(LocalDate createDt) {
        this.createDt = createDt;
    }

    public String toString() {
        return "Accounts(customerId=" + this.getCustomerId() + ", accountNumber=" + this.getAccountNumber() + ", accountType=" + this.getAccountType() + ", branchAddress=" + this.getBranchAddress() + ", createDt=" + this.getCreateDt() + ")";
    }
}
