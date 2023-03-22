package adder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class adderTest {


        private static final double DELTA = 1e-15;
        Adder Adder = new Adder();

        @Test
        public void testAdderTruePositive() {
            assertEquals("Finding addition for True Positive", 15, Adder.add(7 , 8), DELTA);
            assertEquals("Finding addition for True Positive", -17, Adder.add(-3, -14), DELTA);
        }

        @Test
        public void adderTrueNegative() {
            assertNotEquals("Finding addition for True Negative", 30, Adder.add(21 , 3), DELTA);
            assertNotEquals("Finding addition for True Negative", -50 , Adder.add(12 , -31), DELTA);
        }

}