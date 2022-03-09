package com.library.bean;

import java.io.Serializable;

public class ReaderCard implements Serializable {

    private long reader_id;
    private String reader_type;
    private String username;
    private String password;

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
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
