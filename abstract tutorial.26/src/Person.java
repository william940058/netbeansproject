//Abstract class: is a restricted class that cannot be used to create objects
//Abstract method: can only be used in an abstract class, and it does not have a body. 
//The body is provided by the subclass (inherited from).
//Ex of abstract method: public abstract void animalSound();
//Reason of using abstract method: forcing subclasses to have a custom implementation 
public abstract class Person {
    public void sayHello()
    {
        System.out.println("Hi, I am a person.");
    }
    
    
}