import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;


    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Tony","Cabin Manager");
    }

    @Test
    public void hasName() {
        assertEquals("Tony", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals( "Cabin Manager", cabinCrewMember.getRank());
    }

    @Test
    public void canGiveMessages(){
        assertEquals("Please be seated",cabinCrewMember.giveMessage());
    }

}
