/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll;

/**
 *
 * @author Abhi
 */
public class Bean {
    private String id;
    private String name;
    private String dob;
    private String addr;
    private String aadhar;
    private String pan;
    private String acc;
    private String ifsc;
    private String salary;

    public Bean(String id, String name, String dob, String addr, String aadhar, String pan, String acc, String ifsc, String salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.addr = addr;
        this.aadhar = aadhar;
        this.pan = pan;
        this.acc = acc;
        this.ifsc = ifsc;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
}
