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

}
