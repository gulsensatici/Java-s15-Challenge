package com.workintech.model;

public class MemberRecord {
    private String memberID;
    private int maxBookLimit=3;
    private String name;
    private String address;
    private String id;
    private String phone;

    public MemberRecord(String memberID, int maxBookLimit, String name, String address, String id, String phone) {
        this.memberID = memberID;
        this.maxBookLimit = maxBookLimit;
        this.name = name;
        this.address = address;
        this.id = id;
        this.phone = phone;
    }

    public String getMemberID() {
        return memberID;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }
    public void payBill(){
        System.out.println("Faturanız oluşturuldu: ");
    }
}
