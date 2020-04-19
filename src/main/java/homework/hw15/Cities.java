package homework.hw15;

import java.util.ArrayList;

public class Cities {
    private ArrayList<String> state1;
    private ArrayList<String> state2;

    public Cities(ArrayList<String> state1, ArrayList<String> state2) {
        this.state1 = state1;
        this.state2 = state2;
    }

    public ArrayList<String> getState1() {
        return state1;
    }

    public void setState1(ArrayList<String> state1) {
        this.state1 = state1;
    }

    public ArrayList<String> getState2() {
        return state2;
    }

    public void setState2(ArrayList<String> state2) {
        this.state2 = state2;
    }
}
