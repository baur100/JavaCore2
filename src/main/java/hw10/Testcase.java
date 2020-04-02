package hw10;

public class Testcase {
    private String name;
    private int totalTC;
    private int totalPass;
    private int totalFail;

    public Testcase() {
    }

    public Testcase(String name, int totalPass, int totalFail, int totalTC) {
        this.name = name;
        this.totalTC = totalTC;
        this.totalPass = totalPass;
        this.totalFail = totalFail;
    }

    public String getName() {
        return name;
    }

    public int getTotalTC() {
        return totalTC;
    }

    public int getTotalPass() {
        return totalPass;
    }

    public int getTotalFail() {
        return totalFail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalTC() {
        this.totalTC = totalTC;
    }

    public void setTotalPass(int totalPass) {
        this.totalPass = totalPass;
    }

    public void setTotalFail(int totalFail) {
        this.totalFail = totalFail;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("\tName - " + this.name +
                "\n\tTotal Pass - " + this.totalPass +
                "\n\tTotal Fail - " + this.totalFail +
                "\n\tTotal executed test cases - " + this.totalTC);
    }
}

