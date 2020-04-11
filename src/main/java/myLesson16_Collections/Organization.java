package myLesson16_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Organization {
    private String name;
    private String address;
    private List<Branch> branches;

    public Organization(String name, String address) {
        this.name = name;
        this.address = address;
        branches = new ArrayList<Branch>();
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Branch> getBranches() {
        return branches;
    }
}
