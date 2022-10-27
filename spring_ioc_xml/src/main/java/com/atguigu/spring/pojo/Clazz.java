package com.atguigu.spring.pojo;

import java.util.List;

public class Clazz {
    private String cid;
    private String cname;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }

    public Clazz(String cid, String cname, List<Student> students) {
        this.cid = cid;
        this.cname = cname;
        this.students = students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Clazz() {
    }

    public Clazz(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
