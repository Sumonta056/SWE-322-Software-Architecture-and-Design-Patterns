package HomeWorks.Task_5_Adapter_Method.Answer;

public class JsonToXmlAdapter implements IAdapter<JSON, XML> {
    private JSON json;

    public JsonToXmlAdapter(JSON json){
        this.json = json;
    }

    @Override
    public XML convert(JSON json) {
        return this.json.convertToXML();
    }
}