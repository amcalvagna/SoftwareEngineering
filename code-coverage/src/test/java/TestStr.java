import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestStr {
    Str str;

    @Before
    public void init() {
        str = new Str();
    }

    @Test
    public void shouldGiveOkWhenBothTrue() {
        assertEquals("OK", str.foo(true, true));
    }

    @Test
    public void shouldGiveKoWhenBothFalse() {
        assertEquals("KO", str.foo(false, false));
    }

   @Test
    public void shouldGiveKoWhenLastFalse() {
        assertEquals("KO", str.foo(true, false));
    }


}
