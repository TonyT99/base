import hu.bme.mit.train.tachograph.Tachograph;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TachographTest {
    Tachograph tachograph = new Tachograph();

    /*@Before
    public void before() {
        tachograph = new Tachograph();
    }*/

    @Test
    public void TestCollectionElementNotEmpty() {
        tachograph.addNewElement(new Date(), 2, 45);
        Assertions.assertFalse(tachograph.getTable().isEmpty());

    }
}