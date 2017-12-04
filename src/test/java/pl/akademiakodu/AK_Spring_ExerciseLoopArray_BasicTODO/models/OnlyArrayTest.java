package pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models;

/**
 * imports section
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models.services.ArrayConverter;
import pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models.services.ArrayIndicator;
import pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models.services.OnlyArray;


import static org.junit.Assert.*;

/**
 * Testing array services
 */
public class OnlyArrayTest {

    /**
     * Declaration of services
     */
    private static OnlyArray onlyArray;
    private static ArrayIndicator arrayIndicator;
    private static ArrayConverter arrayConverter;

    @BeforeClass public static void start(){
        onlyArray = new OnlyArray();
        arrayIndicator = new ArrayIndicator();
        arrayConverter = new ArrayConverter();
    }

    @AfterClass public static void stop(){
        onlyArray = null;
        arrayIndicator = null;
        arrayIndicator = null;
    }

    /**
     * This method test all usable array services
     */
    @Test public void testingArrayServices(){
        String sampleUserInput1 = "sample,2,Oskar,test";
        assertEquals(4, arrayConverter.toArray(sampleUserInput1).length);
        assertFalse(arrayIndicator.isIntArray(arrayConverter.toArray(sampleUserInput1)));
        assertEquals("sample", onlyArray.longestOf(arrayConverter.toArray(sampleUserInput1)));

        String sampleUserInput2 = "1,5,-2,0,1";
        assertEquals(5, arrayConverter.toArray(sampleUserInput2).length);
        assertTrue(arrayIndicator.isIntArray(arrayConverter.toArray(sampleUserInput2)));
        assertEquals(5, onlyArray.maxOf(arrayConverter.generateIntArray(arrayConverter.toArray(sampleUserInput2))));
        assertEquals(-2, onlyArray.minOf(arrayConverter.generateIntArray(arrayConverter.toArray(sampleUserInput2))));
        assertEquals(1, onlyArray.averageOf(arrayConverter.generateIntArray(arrayConverter.toArray(sampleUserInput2))),0);
        assertArrayEquals(new int[]{-2,0,1,1,5}, onlyArray.sortAsc(arrayConverter.generateIntArray(arrayConverter.toArray(sampleUserInput2))));
        assertArrayEquals(new int[]{-2,0,}, onlyArray.removeOdd(arrayConverter.generateIntArray(arrayConverter.toArray(sampleUserInput2))));

        String sampleUserInput3 = "1,2,3,4,2";
        assertArrayEquals(new int[]{1,2,2,3,4}, onlyArray.sortAsc(arrayConverter.generateIntArray(arrayConverter.toArray(sampleUserInput3))));
    }

}