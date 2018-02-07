package Lab2Pkg;


public class Person {

    private static int nextId;

    private String name, address, telephoneNumber;
    //private string telephone;

    private int id;


    public Person(){
        this.id = getNextId() ;
        // TODO:implement getNextID() method
    }

    public Person(String name, String address, String telephoneNumber){

        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;

        this.id = getNextId() ;
        // TODO:implement getNextID() method
    }

    public int getNextId() {
        return nextId++;
    }

    public String toString(){
        return  "Name:              " + name + "\n" +
                "ID:                " + name + "\n" +
                "Address:           " + address+ "\n" +
                "telephone Number:  " + telephoneNumber+ "\n" +
                "+++++++++++++++++++\n";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephoneNumber;
    }
}
