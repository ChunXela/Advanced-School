public class Person{

    public String name;
    public String address;
    
    public void person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address= address;
    }

    public String toString(){
        return "Person[name = " + name + ", address = " + address; 
    }

}