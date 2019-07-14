package zhuanzhang;

public class pople {
    public String name;
    public double code;

    public String getname() {
        return this.name;
    }

    public void setname(String name) {

    }

    public double getcode(double code) {
        return this.code =this.code - code;
    }

    public void setcode(double code) {
        this.code = this.code + code;
        return;
    }

}