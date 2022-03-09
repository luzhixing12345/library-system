package com.library.bean;

import java.io.Serializable;
import java.util.Date;

public class ReaderInfo implements Serializable {

    private long reader_id;
    private String name;
    private String reader_type;
    private String sex;
    private Date birth;
    private String address;
    private String phone;

    public long getReaderId() {
        return reader_id;
    }

    public void setReaderId(long reader_id) {
        this.reader_id = reader_id;
    }
    public String getReaderType(){
        return reader_type;
    }
    public void setReaderType(String reader_type){
        this.reader_type = reader_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
