package HW10;

public class Garden {

    private String tree;
    private String flower;
    private int temperature;

    public Garden(String tree, String flower, int temp) {
        this.tree = tree;
        this.flower = flower;
        this.temperature = temp;
    }

    public Garden () {};

    public void printGardenInfo() {
        System.out.println(tree+" "+flower+" "+temperature);
    }


        public String getTree() {
            return tree;
        }
        public String getFlower () {
            return flower;
        }
        public int getTemperature () {
            return temperature;
        }
        public void setTree(String tree) {
            this.tree = tree;

        }
        public void setFlower(String flower) {
            this.flower = flower;
        }
        public void setTemperature (int temp) {
            this.temperature = temp;
        }
    }

