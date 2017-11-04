import com.bazyl.credits.Model;
import org.junit.Assert;
import org.junit.Test;

public class CorrectStringTest {

  @Test
  public void testCorrectnessOfStrings() {
    Model model = new Model();
    model.setHelloString("Hello");
    model.setWorldString("world");
    Assert.assertTrue(model.isReadyToPrint());
  }

}
