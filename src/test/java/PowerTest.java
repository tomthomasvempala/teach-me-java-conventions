import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

public class PowerTest {
    @Test
    public void OneRaisedToOneIsOne() {
        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void TwoRaisedToOneIsTwo() {
        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void TwoRaisedToTwoIsFour() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void ThreeRaisedToTwoIsNine() {
        assert PowerFinder.of(3, 2) == 3*3;
    }

}
