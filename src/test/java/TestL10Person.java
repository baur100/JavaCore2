import HW10.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestL10Person {
    @Test
public void testResultFromL10Person (){
        // Arrange
        Person person = new Person("Ivan", "Krotov");

        //Act
        String result = person.result(2,1,1);

        //Assert
        Assert.assertEquals(result, "Ivan4");
    }


    @Test
    public void testLastResultMethodFromL10Person () {
        //Arrange
        Person doris = new Person("Doris", "Sun");

        //Act
        String res = doris.lastResult(8,"finish");

        //Assert
        Assert.assertEquals(res, "Sun8finish");

    }





}

