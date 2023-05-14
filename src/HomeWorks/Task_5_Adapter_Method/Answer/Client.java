package HomeWorks.Task_5_Adapter_Method.Answer;

public class Client {
    JSON json = new JSON("json data");
    IAdapter<JSON, XML> iAdapter1 = new JsonToXmlAdapter(json);
    XML xml1 = iAdapter1.convert(json);


    PROTOBUFFER Protobuffer = new PROTOBUFFER("Protobuffer data");
    IAdapter<PROTOBUFFER,XML> iAdapter2 = new ProtobufferToXmlAdapter(Protobuffer);
    XML xml2 = iAdapter2.convert(Protobuffer);

}
