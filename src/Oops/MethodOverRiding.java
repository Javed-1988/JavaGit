package Oops;

class parent
{
    //we can not override private static final method and cannot change return type
    public String get()
    {
        return "Parent";
    }
}
class child extends parent
{
    @Override
    public String get()
    {
        return "Child";
    }

}
public class MethodOverRiding {
}
