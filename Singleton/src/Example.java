public class Example {
    static Example obj = new Example();

    //The constructor of the class is hide in Singleton method
    //only one istance of class is available for the class
    private Example(){

    }

    public static Example getExample(){
        return obj;
    }
}
