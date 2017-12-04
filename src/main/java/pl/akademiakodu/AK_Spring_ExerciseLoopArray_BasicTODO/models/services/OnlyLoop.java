package pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OnlyLoop {

    private StringBuilder sb;

    //task1: print 5 times "hello world"
    public String print5TimesHelloWorld(){
        sb = new StringBuilder();
        //todo implement proper loop
        sb.append("Hello World, "); // adding String "hello world" like 'System.out.println("hello world")'
        return sb.toString();
    }


    // task2: from 15 to 8 without 10
    public String printDigitsFrom8To15Without10(){
        sb = new StringBuilder();
        int i = 0;
        //todo implement proper loop
        sb.append(i + ", ");
        return sb.toString();
    }

    //task3:
    public String printFirst12OddDigits(){
        sb = new StringBuilder();
        int i = 0;
        //todo implement proper loop
        sb.append(i + ", ");
        return sb.toString();
    }

    //task4: sos signal is" ***---***
    public String print3SOS(){
        sb = new StringBuilder();
        //todo implement proper loop
        sb.append("*");
        sb.append("-");
        return sb.toString();
    }

    //task5: factorial from 5
    public String factorialOf5(){
        sb = new StringBuilder();
        int result = 0;
        //todo implement proper loop
        sb.append(result);
        return sb.toString();
    }

    //task6: take 6 unique random digits (from 1 to 49)
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
