class Parent{
    int a=5;
}
class child extends Parent{
    int b = a+5;
}
class grandchild extends child{
    int c = b+8;
}

public class MultiLevelInheritance {
    public static void main(String[] args){
        grandchild gc1 = new grandchild();
        System.out.println(gc1.a);
        System.out.println(gc1.b);
        System.out.println(gc1.c);
    }
}
