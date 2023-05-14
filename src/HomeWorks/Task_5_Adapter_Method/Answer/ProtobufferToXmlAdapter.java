package HomeWorks.Task_5_Adapter_Method.Answer;

public class ProtobufferToXmlAdapter implements IAdapter<PROTOBUFFER, XML> {
    private PROTOBUFFER Protobuffer;

    public ProtobufferToXmlAdapter(PROTOBUFFER Protobuffer){
        this.Protobuffer =  Protobuffer;
    }

    @Override
    public XML convert(PROTOBUFFER PROTOBUFFER) {
        return this. Protobuffer.convertToXML();
    }
}
