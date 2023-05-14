package HomeWorks.Task_5_Adapter_Method.Answer;

public interface IAdapter<TypeA , TypeB> {
    TypeB convert(TypeA source);
}
