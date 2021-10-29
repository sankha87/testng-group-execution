package example;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmokeTest {
  @Test(groups={"smoke","reg"})
  public void smoke1() {
	  Reporter.log("smoke test and regression test", true);
  }
  @Test(groups="smoke")
  public void smoke2() {
	  Reporter.log("smoke test 2", true);
  }
}
