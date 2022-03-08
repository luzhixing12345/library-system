package com.library.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Paper implements Serializable {

    private long paper_id;
    private String name;
    private String author;
    private String publish;
    private String year;
    private String page;
    private String introduction;
    private String no;
    private String vol;

    private String doi;
    

    public long getPaperId() {
        return paper_id;
    }

    public void setPaperId(long paper_id) {
        this.paper_id = paper_id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish=publish;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

}
