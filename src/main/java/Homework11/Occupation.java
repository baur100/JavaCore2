package Homework11;

public class Occupation {
    private String name;
    private String education;
    private String industry;

    public Occupation(){}

    public Occupation(String name, String education, String industry) {
        this.name = name;
        this.education = education;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }
    public String getEducation() {
        return education;
    }
    public String getIndustry() {
        return industry;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", industry='" + industry + '\'' +
                '}';
    }
}
