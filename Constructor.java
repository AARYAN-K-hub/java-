

class Constructor {
    String name;
    int id;

    Constructor(String name, int id){
        this.name=name;
        this.id=id;
    }
}

class Constructors{
    public static void main(String[] args){
        Constructor c1= new Constructor("Small ",68);
        System.out.println("Name:"  +c1.name+  "and id:" +c1.id);
    }
}
