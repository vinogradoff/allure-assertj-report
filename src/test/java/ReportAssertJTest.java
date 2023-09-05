import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReportAssertJTest {

  @Test
  void logAssertions(){
    Assertions.assertThat("value").as("My variable").isEqualTo("value");
  }
}
