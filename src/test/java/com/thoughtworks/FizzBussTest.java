import com.thoughtworks.FizzBuss;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBussTest {
    @Test
    public void should_return_1_when_fizzbuss_given_1(){
        //Give
        int number = 1;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("1"));
    }

    @Test
    public void should_return_fizz_when_fizzbuss_given_3(){
        //Give
        int number = 3;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("fizz"));
    }

    @Test
    public void should_return_buss_when_fizzbuss_given_5(){
        //Give
        int number = 5;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("buss"));
    }

    @Test
    public void should_return_fizzbuss_when_fizzbuss_given_15(){
        //Give
        int number = 15;
        FizzBuss fizzBuss = new FizzBuss();

        //When
        String word = fizzBuss.fizzBussGame(number);

        //Then
        assertThat(word, is("fizzbuss"));
    }
}
