//Object Class equal toString hashcode in Java

class Laptop{
    String model;
    int price;

    // public String toString(){
    //     return "Hey";
    // }
    // public boolean equals(Laptop that){
    //     // if(this.model.equals(that.model) &&  this.price ==that.price){
    //     //     return true;
    //     // }
    //     // else
    //     //    return false;

     
    //     return this.model.equals(that.model) &&  this.price ==that.price;
    // }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
        
}

public class Tut58 {
    public static void main(String a[]){

        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;
        
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;

        boolean result = obj.equals(obj1);
        System.out.println(result);
        System.out.println(obj);   //by default it called toString()
    }
}
