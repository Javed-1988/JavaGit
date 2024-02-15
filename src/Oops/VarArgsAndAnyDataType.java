package Oops;

public class VarArgsAndAnyDataType {

    public <T> T getData(T data)//accept any datatype
    {
        System.out.println("data:"+data);
        return data;
    }

    public int  getInt(int... data)//accept any number of parameter with same type
    {
        int k=0;
       for(int i=0;i<data.length;i++)
       {
           //System.out.println("data:"+data[i]);
           k=k+data[i];
       }
       return k;
    }

    public static void main(String[]args)
    {
        VarArgsAndAnyDataType var =new VarArgsAndAnyDataType();
        var.getData("javed");
        var.getData(4.5);
        int a=var.getInt(3,6,8);
        var.getData(a);
        int b=var.getInt(3,6,8,9,2,12);
        var.getData(b);
    }

}
