package pl.akademiakodu.AK_Spring_ExerciseLoopArray_BasicTODO.models;

/**
 * Storage for user inputs
 */
public class UserInputModel {

    private String userInput;

    public UserInputModel() {
    }

    public UserInputModel(String userInput) {
        this.userInput = userInput;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
