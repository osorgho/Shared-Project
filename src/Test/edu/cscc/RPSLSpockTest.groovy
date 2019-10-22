package edu.cscc

import org.junit.Test

class RPSLSpockTest  {
    @Test
    void testIsValidPick() {
        RPSLSpock  pick = new RPSLSpock();
        String pickNull=null;
        String pickWell="rock";

        assertFalse(pick.isValidPick(pickNull));
        assertEquals("rock", pick.isValidPick(pickWell));
    }
    @Test
    void testGeneratePick() {
        RPSLSpock  pick = new RPSLSpock();
        String pickNull=null;
        assertThat(pick.isValidPick(pickNull), containsString("rock"||"paper"||"scissors"||"lizard"||"spock"));
    }
    @Test
    void testIsComputerWin() {
        RPSLSpock  pick = new RPSLSpock();
        String pickWell="rock";
        assertThat(pick.isComputerWin(pickWell), containsString("rock"||"paper"||"scissors"||"lizard"||"spock"));
    }

}
