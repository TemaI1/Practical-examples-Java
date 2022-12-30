package Serialization;

import java.io.Serializable;

public class Person implements Serializable{
    private int id;
    private String name;
    
    // private transient int idTransient; transient, поле не должно быть сериализовано, выдаст 0
    // private transient String nameTransient; transient, поле не должно быть сериализовано, выдаст null

    // private static final long serialVersionUID = .....; SerialVersionUID используется для указании версии сериализованных данных

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
