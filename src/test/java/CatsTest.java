import com.dashaqaguru.Cats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatsTest {
    @Test
    public void checkCountCats() {
        Cats cat = new Cats("Barsik", (byte) 5, "black", false);
        assertEquals(Cats.getCatCount(),1);

    }
}

