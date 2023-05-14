package HomeWorks.Task_5_Adapter_Method.Question;



public class JsonToXmlAdapter implements IAdapter {
    private JSON json;

    public JsonToXmlAdapter(JSON json){
        this.json = json;
    }

    @Override
    public XML convert(JSON json) {
        return this.json.convertToXML();
    }
}