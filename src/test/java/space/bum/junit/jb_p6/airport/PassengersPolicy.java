package space.bum.junit.jb_p6.airport;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PassengersPolicy {
  private Flight flight;
  private List<Passenger> regularPassengers = new ArrayList<>();
  private List<Passenger> vipPassengers = new ArrayList<>();
  private Flight anotherFlight = new Flight("AA7890", 48);

  @Given("^한 항공편 - 번호는 \"([^\"]*)\" 좌석은 (\\d+)개, \"([^\"]*)\"에 승객 정보가 있다$")
  public void 한_항공편_번호는_좌석은_개_에_승객_정보가_있다(
      String flightNumber, int seats, String filename) throws Throwable {
    flight = FlightBuilderUtil.buildFlightFromCsv(flightNumber, seats,
        "src/test/resources/" + filename);
  }

  @When("^일반 승객이 여러 명 있다$")
  public void 일반_승객이_여러_명_있다() throws Throwable {
    flight.getPassengers().stream().filter(p -> !p.isVip())
        .forEach(p -> regularPassengers.add(p));
  }

  @Then("^우리는 일반 승객들을 항공편에서 제거할 수 있다$")
  public void 우리는_일반_승객들을_항공편에서_제거할_수_있다() throws Throwable {
    regularPassengers.forEach(p -> assertTrue(flight.removePassenger(p)));
  }

  @Then("^일반 승객들을 다른 항공편에 넣을 수 있다$")
  public void 일반_승객들을_다른_항공편에_넣을_수_있다() throws Throwable {
    regularPassengers.forEach(p -> assertTrue(anotherFlight.addPassenger(p)));
  }
}
