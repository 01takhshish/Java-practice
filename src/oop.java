// public class oop{
//     public static void main(String[] args) {

//         Dog dog = new Dog("ROyal", 5);
//         Cat cat = new Cat("cutie", 3);
//         cat.details();
//         cat.speak();
//         dog.details();
//         dog.speak();
        // Car car = new Car("BMW", 1978);
        // MotorCycle bike = new MotorCycle("hero", 2018, "idk");
        // car.getDetail();
        // bike.getDetail("idk");
        // Circle round = new Circle("red", 23);
        // Rectangle box = new Rectangle("rellow", 012, 14);

        // System.out.println("Area of the Circle is "+ round.getArea() + "And color of the shape is " + round.getColor());
        // System.out.println("Area of the box is "+ box.getArea() + "And color of the shape is " + box.getColor());

        // // BankAccount account = new BankAccount("123456789", 1000.0, 0.05);

        // System.out.println("Account Number: " + account.getAccountNumber());
        // System.out.println("Initial Balance: " + account.getBalance());

        // account.deposit(500.0);
        // account.withdraw(200.0);

        // System.out.println("Updated Balance: " + account.getBalance());
        // System.out.println("Interest Earned: " + account.calculateInterest());
//     }
// }

// class Animal{
//     public String name;
//     public int age;

//     public Animal(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     public void details(){
//         System.out.println( "name : " +name+ "\nAge : " + age);
//     }

//     public void speak(){
//         System.out.println("Sound----");
//     }
// }

// class Dog extends Animal{
//     public Dog(String name, int age){
//         super(name, age);
//     }

//     public void speak(){
//         super.speak();
//         System.out.println("Dog make sound like woof");
//     }
// }

// class Cat extends Animal{
//     public Cat(String name,  int age){
//         super(name, age);
//     }

//     public void speak(){
//         super.speak();
//         System.out.println("Cat make sound like meow");
//     }
// }

// // class Vehicle{
// //     public String brand;
// //     public int year;

// //     public Vehicle(String brand, int year){
// //         this.brand = brand;
// //         this.year = year;
// //     }

// //     public void getDetail(String brand, int year){
// //         System.out.println("The brand of the vehicle is " + brand + " and the manufactured date is " + year);
// //     }
// // }

// // class Car extends Vehicle{
// //     public Car(String  brand,  int year){
// //         super(brand, year);
// //     }
// //     public void getDetail(){
// //       super.getDetail(brand, year);
// //       System.out.println("Its has 4 doors");
// //     }
// // }

// // class MotorCycle extends Vehicle{
// //     public String type;

// //     public MotorCycle(String brand, int year, String type){
// //         super(brand, year);
// //         this.type = type;
// //     }

// //     public void getDetail(){
// //       super.getDetail(brand, year); 
// //       System.out.println(type);;
// //     }
// // }

// // class Shape{
// //     public String color;

// //     public Shape(String color){
// //         this.color = color;
// //     }

// //     public String getColor(){
// //         return color;
// //     }
// // }

// // class Circle extends Shape{
// //     public double radius;

// //     public Circle(String color, double radius){
// //         super(color); //super is used to refer to the superclass and allows you to access and utilize its members in the subclass. 
// //         // It is commonly used to invoke superclass constructors or to access overridden methods or hidden fields.
// //         // In Java, the super keyword is used to refer to the parent class or superclass. 
// //         // It is used to access or call the members (fields, methods, and constructors) of the superclass from within a subclass.
// // // In the context of class inheritance, when you create a subclass, it inherits the attributes and behaviors of its parent class. 
// // // The super keyword allows you to explicitly reference and use those inherited members.
// //         this.radius = radius;
// //     }

// //     public double getArea(){
// //         return 3.14 * radius * radius;
// //     }
// // }
 
// // class Rectangle extends Shape{
// //     public double length;
// //     public double width;
    
// //     public Rectangle(String color, double length, double width){
// //         super(color);
// //         this.length = length;
// //         this.width = width;
// //     }
    
// //     public double getArea(){
// //         return width *length;
// //     }

// // }
// // class BankAccount {
// //     private String accountNumber;
// //     private double balance;
// //     private double interestRate;

// //     // Constructor
// //     public BankAccount(String accountNumber, double balance, double interestRate) {
// //         this.accountNumber = accountNumber;
// //         this.balance = balance;
// //         this.interestRate = interestRate;
// //     }

// //     // Getters
// //     public String getAccountNumber() {
// //         return accountNumber;
// //     }

// //     public double getBalance() {
// //         return balance;
// //     }

// //     public double getInterestRate() {
// //         return interestRate;
// //     }

// //     // Behaviors
// //     public void deposit(double amount) {
// //         balance += amount;
// //     }

// //     public void withdraw(double amount) {
// //         if (amount <= balance) {
// //             balance -= amount;
// //         } else {
// //             System.out.println("Insufficient balance");
// //         }
// //     }

// //     public double calculateInterest() {
// //         return balance * interestRate;
// //     }
// // }

// public class oop{
//     public static void main(String[] args){
//     Person human = new Person("Aniya", 23, "H no.123, Street no.4, Royal Buillding");
//     human.getDetail();
//     System.out.println("\n update");
//     human.setDetail(22, "H no.103, Street no.03, Royal&Rock Buillding");
//     human.getDetail();
//     }
// }
 
// class Person{
//     private String name;
//     private int age;
//     private String address;

//     public Person(String name, int age, String address){
//         this.name = name;
//         this.age = age;
//         this.address = address;
//     }

//     public void getDetail(){
//         System.out.println("Name : " +name+ "\nAge : "+age+"\nAddress : " +address);
//     }

//     public void setDetail(int new_age,String new_address){
//        age = new_age;
//        address = new_address;
//     }  
// }




