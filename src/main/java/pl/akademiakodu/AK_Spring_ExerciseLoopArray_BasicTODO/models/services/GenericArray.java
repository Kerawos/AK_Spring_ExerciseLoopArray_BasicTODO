package pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models.services;

public class GenericArray<type>{

    private type[] array;

    public GenericArray(type[] array) {
        this.array = array;
    }

    public GenericArray() {
    }

    public type[] getArray() {
        return array;
    }

    public void setArray(type[] array) {
        this.array = array;
    }


}
