import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
        public void testSomething() {
            Upper u = new Upper();
            assertEquals("HELLO",u.MakeUpperCase("hello"));
        }

        private static class Upper {
            public String MakeUpperCase(String str) {
                return str.toUpperCase();
            }
        }
    }

