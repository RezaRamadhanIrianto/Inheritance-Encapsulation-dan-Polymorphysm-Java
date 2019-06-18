package polymorphysm;

class Animal{
    protected void hello(){
        System.out.println("Hello");
    }
               
    protected void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    @Override
    public void move(){
         System.out.println("Dogs can walk and run");  }
        public void bark(){
            System.out.println("Dogs can bark");
        }
}

public class Override_Test{
   public static void main(String args[]){
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object
        a.move();
        b.move();
        System.out.println();
        a.hello();
   }
}
