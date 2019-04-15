package ORG.Brujula;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void checkDamage(){



//        (5, 4)
//        (5, -1)
//        (5, 0)
//        (5, null)
//        (5, "s")
//        (5, [5])

    }



    @Test
    public void comprobacionFinal()
    {
        assertEquals("Lew", App.declareWinner(new Fighter("Lew", 10, 2),
                                                        new Fighter("Harry", 5, 4 ), "Lew"));

        assertEquals("Harry", App.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4 ), "Harry"));

        assertEquals("Harald", App.declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4 ), "Harry"));

        assertEquals("Harald", App.declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4 ), "Harald"));

        assertEquals("Harald", App.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5 ), "Harald"));

        assertEquals("Harald", App.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5 ), "Jerry"));



    }

}
