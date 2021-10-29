package example;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegressionTest {
  @Test(groups={"reg","e2e"})
  public void reg1() {
	  Reporter.log("regression test and e2e test", true);
  }
  @Test(groups="reg")
  public void reg2() {
	  Reporter.log("regression test 2", true);
  }
  @Test(groups="reg")
  public void reg3() {
	  Reporter.log("regression test 3", true);
  }
}
