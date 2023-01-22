import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

   Pilot pilot;


    @Before
    public void before() {
        pilot = new Pilot("Ian","Captain", 12345);
    }

    @Test
    public void hasName() {
        assertEquals("Ian", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals( "Captain", pilot.getRank());
    }

    @Test
    public void hasLicenseNum(){
        assertEquals(12345, pilot.getLicenseNum());
    }

    @Test
    public void canFly(){
        assertEquals("I can fly", pilot.allowedToFly());
    }

}
