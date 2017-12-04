package pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models.services;
/**
 * Import section
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Responsible for array calculations
 */
@Service
public class OnlyArray {

    /**
     * Services declaration
     */
    @Autowired ArrayIndicator arrayIndicator;
    @Autowired ArrayConverter arrayConverter;

    /**
     * Method calculating maximum integer in given integer array
     * @param intArray
     * @return maximum element of array
     */
    public int maxOf(int[] intArray){
        //todo implement method
        return 0;
    }

    /**
     * Method calculating minimum integer in given integer array
     * @param ints
     * @return maximum element of array
     */
    public int minOf(int... ints){
        //todo implement method
        return 0;
    }

    /**
     * Method calculating average integer in given integer array
     * @param ints
     * @return average element of array
     */
    public double averageOf(int... ints){
        //todo implement method
        return 0;
    }

    /**
     * Method calculating longest word in given string array
     * @param strings
     * @return longest element of array
     */
    public String longestOf (String... strings){
        //todo implement method
        return null;
    }

    /**
     * Method sort listed int array from lowest value up to maximum value
     * @param nonSortedArray
     * @return ascending order sorted int array
     */
    public int[] sortAsc(int[] nonSortedArray){
        //todo implement method
        return null;
    }

    /**
     * Method remove all odd integers from given int array
     * @param ints
     * @return only even integers
     */
    //nieparzyste
    public int[] removeOdd (int... ints){
        //todo implement method
        return null;
    }

    /**
     * Method generate string array from int array
     * @param intArray
     * @return string array
     */
    public String[] convertToStringArray(int[] intArray){
        //todo implement method
        return null;
    }

    /**
     * Method generate string array from string, every single word will be separated element of array
     * @param textArray
     * @return string array
     */
    public String[] stringToArray(String textArray){
        //todo implement method
        return null;
    }

}
