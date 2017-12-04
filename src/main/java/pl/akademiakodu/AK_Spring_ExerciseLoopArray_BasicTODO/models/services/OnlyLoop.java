package pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models.services;

/**
 * Import section
 */
import org.springframework.stereotype.Service;
import java.util.Random;

/**
 * Responsible for loop calculations and exercise
 */
@Service
public class OnlyLoop {

    private StringBuilder sb;

    /**
     * Method adding 5 times listed word
     * @return result of 5 listed word
     */
    public String print5TimesHelloWorld(){
        sb = new StringBuilder();
        //todo implement proper loop
        sb.append("Hello World, "); // adding String "hello world" like 'System.out.println("hello world")'
        return sb.toString();
    }

    /**
     * Method gathering all digits from 15 to 8 (all included) without digit 10.
     * @return string output '15, 14, 13, 12, 11, 9, 8'
     */
    public String printDigitsFrom8To15Without10(){
        sb = new StringBuilder();
        int i = 0;
        //todo implement proper loop
        sb.append(i + ", ");
        return sb.toString();
    }

    /**
     * Method will gather first 12 odd digits
     * @return string output '0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22'
     */
    public String printFirst12OddDigits(){
        sb = new StringBuilder();
        int i = 0;
        //todo implement proper loop
        sb.append(i + ", ");
        return sb.toString();
    }

    /**
     * Method will gather proper SOS signal. One part of signal is: '***---***'
     * @return string as signal: '***---******---******---***'
     */
    public String print3SOS(){
        sb = new StringBuilder();
        //todo implement proper loop
        sb.append("*");
        sb.append("-");
        return sb.toString();
    }

    /**
     * Method will calculate factorial of digit 5
     * @return digit: 120
     */
    public String factorialOf5(){
        sb = new StringBuilder();
        int result = 0;
        //todo implement proper loop
        sb.append(result);
        return sb.toString();
    }

    /**
     * Method generate 6 times random unique digit between 1-49
     * @return random 6 digit
     */
    public String generate6LottoDigits(){
        sb = new StringBuilder();
        Random random = new Random();
        //todo implement proper loop
        int rnd = 0;
        sb.append(rnd + ", ");
        sb = new StringBuilder();
        return sb.toString();
    }

}
