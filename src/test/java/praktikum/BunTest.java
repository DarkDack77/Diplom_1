package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class BunTest {

    @Test
    public void shouldReturnCorrectName() {
        Bun bun = new Bun("black bun", 100.0f);

        assertEquals("black bun", bun.getName());
    }

    @Test
    public void shouldReturnCorrectPrice() {
        Bun bun = new Bun("black bun", 100.0f);

        assertEquals(100.0f, bun.getPrice(), 0.001f);
    }
}