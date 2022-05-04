package com.demo.compareabledemo;

public class Laptop1  {

    private int ram;
    private int rom;
    private String Lname;

    public Laptop1(int ram, int rom, String lname) {
        this.ram = ram;
        this.rom = rom;
        Lname = lname;
    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    @Override
    public String toString() {
        return "com.demo.compareabledemo.Laptop{" +
                "ram=" + ram +
                ", rom=" + rom +
                ", Lname='" + Lname + '\'' +
                '}';
    }



}
