import myLesson10.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestExample {
    @Test
    public void testResultFromPerson() {
        // Arrange
        Person person = new Person("Ivan", "Krotov");

        // Act
        String res = person.result(2, 1, 1);

        // Assert
        Assert.assertEquals(res, "Ivan4");
    }

    @Test
    public void testLastResultMethodFromPersonInLesson10() {
        // Arrange
        Person doris = new Person("Dorris", "Sun");

        //Act
        String res = doris.lastResult(8, "Finish");

        //Assert
        Assert.assertEquals(res, "Sun8Finis h");
    }
}
