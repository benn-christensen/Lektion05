import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercixe01Tests {
    @Test
    @DisplayName("Summen af alle lige tal op til 100")
    public void SumOfEvenNumbersUpTo100() {
      int actual = SumOf.EvenNumbers();
      assertEquals(2450, actual, "Summen af alle lige tal op til 100, er 2450");
    }

    @Test
    @DisplayName("Summen af alle kvaddrattal mindre end 100")
    public void SumOfQubicNumbersLessThan100() {
        int actual = SumOf.QubicNumbers();
        assertEquals(385, actual, "Summen af alle kvaddrattal der er mindre end 100, er 385");
    }
}
