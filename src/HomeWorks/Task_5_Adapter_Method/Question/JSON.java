package HomeWorks.Task_5_Adapter_Method.Question;



public class JSON {

    public JSON(){};
    public JSON(String data){}
    XML convertToXML(){
        // logic to convert the data to XML
        return new XML("Stringified JSON data");
    }
}