import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ForEachTest {
@Test
    public void test1 () {
    final String original = "Cat Dog";
    assertThrows(NullPointerException.class, () -> {
        original.concat(null);
    });
  }
}