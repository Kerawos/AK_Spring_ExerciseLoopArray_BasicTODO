package pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models.bags;

public class ArrayModel {

    int[] intArray;
    String[] stringArray;

    public ArrayModel() {
    }

    public ArrayModel(int[] intArray) {
        this.intArray = intArray;
    }

    public ArrayModel(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }
}
