package Types;

public class Plane {
    public String name;

<<<<<<< HEAD
    public String getInfo() {
      return name;
=======
    @Override
    public String toString() {
        return "name=" + name;
    }

    public String getInfo(){
        return name;
>>>>>>> 7688eb0... L12
    }
}
