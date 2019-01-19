package com.project.admin.arkamilkproject.model;

public class ModelDescriptionMilk {
     int pimage;
     String pname;
     String pml;
     String pcost;

    public ModelDescriptionMilk(int pimage, String pname, String pml, String pcost) {
        this.pimage = pimage;
        this.pname = pname;
        this.pml = pml;
        this.pcost = pcost;
    }

    public int getPimage() {
        return pimage;
    }

    public void setPimage(int pimage) {
        this.pimage = pimage;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPml() {
        return pml;
    }

    public void setPml(String pml) {
        this.pml = pml;
    }

    public String getPcost() {
        return pcost;
    }

    public void setPcost(String pcost) {
        this.pcost = pcost;
    }
}
