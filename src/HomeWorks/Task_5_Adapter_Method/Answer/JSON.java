package HomeWorks.Task_5_Adapter_Method.Answer;

public class JSON {

    public JSON(){};
    public JSON(String data){}
    XML convertToXML(){
        // logic to convert the data to XML
        return new XML("Stringified JSON data");
    }
}