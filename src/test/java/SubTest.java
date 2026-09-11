import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SubTest {
    @Test
    public void testSub() {
        Sub calcul = new Sub();
        int resultat = calcul.sub(10, 4);
        assertEquals(6, resultat);
    }
}
