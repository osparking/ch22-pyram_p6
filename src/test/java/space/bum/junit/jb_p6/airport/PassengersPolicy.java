package space.bum.junit.jb_p6.airport;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PassengersPolicy {

  @Given("^한 항공편 - 번호는 \"([^\"]*)\" 좌석은 (\\d+)개, \"([^\"]*)\"에 승객 정보가 있다$")
  public void 한_항공편_번호는_좌석은_개_에_승객_정보가_있다(
      String arg1, int arg2, String arg3) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @When("^일반 승객이 여러 명 있다$")
  public void 일반_승객이_여러_명_있다() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @Then("^우리는 일반 승객들을 항공편에서 제거할 수 있다$")
  public void 우리는_일반_승객들을_항공편에서_제거할_수_있다() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @Then("^일반 승객들을 다른 항공편에 넣을 수 있다$")
  public void 일반_승객들을_다른_항공편에_넣을_수_있다() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @When("^VIP 승객이 여러 명 있다$")
  public void vip_승객이_여러_명_있다() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @Then("^우리는 VIP 승객들을 항공편에서 제거할 수 없다$")
  public void 우리는_VIP_승객들을_항공편에서_제거할_수_없다() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

}
