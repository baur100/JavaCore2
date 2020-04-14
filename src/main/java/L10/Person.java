package L10;

public class Person {
    public String name;
    public String lastname;
    public Person(String n, String l){
        this.name = n;
        this.lastname=l;
    }
    public String result(int a, int b, int c){
        return name+(a+b+c);
    }

    public String lastResult(int a,String b){
        return lastname+a+b;
    }


}
