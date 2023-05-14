package HomeWorks.Task_5_Adapter_Method.Question;



public class Client {
    JSON json = new JSON("json data");
    IAdapter iAdapter = new JsonToXmlAdapter(json);
    XML xml = iAdapter.convert(json);


}
