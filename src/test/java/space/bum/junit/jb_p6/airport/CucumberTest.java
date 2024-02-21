package space.bum.junit.jb_p6.airport;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * JUnit 으로 오이 시험을 실행할 때 진입점.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, features = "classpath:features")
public class CucumberTest {

  /**
   * 이 클래스는 빈 클래스인 것이 정상이다. 
   * 단계 정의는 다른 클래스(예, PassengersPolicy)에 들어있어야 된다.
   */
}
