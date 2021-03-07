
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChallengesTest {
    @Test
    void should_return_0_when_there_is_no_remained(){
        double a = 2.00;
        double b = 1.00;
        double output = Challenges.modulo(a,b);
        assertEquals(0, output);
    }
    @Test
    void should_return_1_when_the_remainder_is_one(){
        double a = 7.00;
        double b = 2.00;
        double output = Challenges.modulo(a,b);
        assertEquals(1, output);
    }
    @Test
    void should_return_2_when_root_4(){
        int n = 4;
        int output = Challenges.squareRoot(n);
        assertEquals(2, output);
    }
    @Test
    void should_return_4_when_root_16(){
        int n = 16;
        int output = Challenges.squareRoot(n);
        assertEquals(4, output);
    }
    @Test
    void should_return_8_when_raiseToPower_is_passed_2_3(){
        double output = Challenges.raiseToPower(2,3);
        assertEquals(8, output);
    }
    @Test
    void should_format_money_into_a_string(){
        double money = 3.45;
        String output = Challenges.formatMoney(money);
        assertEquals("£3.45", output);
    }
    @Test
    void should_calculate_area_of_a_circle(){
        int radius = 1;
        double output = Challenges.calculateCircleArea(radius);
        assertEquals(3.142, output);
    }
}
