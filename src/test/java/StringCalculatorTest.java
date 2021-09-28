import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

//    @Test
//    public void sum(){
//        int[] numbers = {1, 2, 3};
//        assertThat(StringCalculator.sum(numbers)).isEqualTo(6);
//    }

//    @Test
//    public void toInts(){
//        String[] numbers = {"1", "2", "3"};
//        assertThat(StringCalculator.toInts(numbers)).containsExactly(1, 2, 3);
//    }

    @Test
    public void split(){
        String text = "1,2:3";
        assertThat(StringCalculator.split(text)).containsExactly("1", "2", "3");
    }

    @Test
    public void isBlank(){
        assertThat(StringCalculator.isBlank(null)).isEqualTo(true);
        assertThat(StringCalculator.isBlank("")).isEqualTo(true);
    }

    @Test
    public void splitAndSum(){
        assertThat(StringCalculator.splitAndSum("1,2:3")).isEqualTo(6);
    }

    @Test(expected=RuntimeException.class)
    public void 음수값(){
        StringCalculator.splitAndSum("-1,2:3");
    }

}
