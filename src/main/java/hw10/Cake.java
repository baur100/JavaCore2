package hw10;

public class Cake {
    private String name;
    private String dough;
    private String cream;
    private double weight;
    private String[] ingredients;

    public Cake() {
    }

    public Cake(String name, String dough, String cream, double weight, String[] ingredients) {
        this.name = name;
        this.dough = dough;
        this.cream = cream;
        this.weight = weight;
        this.ingredients = ingredients;
    }

    public void printClass(){
        System.out.println(name+" "+weight+" lbs"+"\nDescription: "+dough+", "+cream);
        for(String ing:ingredients){
            System.out.println("Ingredients: "+ing+", ");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setCream(String cream) {
        this.cream = cream;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public double getWeight() {
        return weight;
    }

    public String getCream() {
        return cream;
    }

    public String[] getIngredients() {
        return ingredients;
    }
}

