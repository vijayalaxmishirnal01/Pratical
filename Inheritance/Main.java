package Inheritance;

//Base class A
class A {
 public void display() {
     System.out.println("  GOAT Cristiano.");
 }
}

//Derived class B extends A
class B extends A {
 public void show() {
     System.out.println("  GOAT Virat.");
 }
}

//Derived class C extends B
class C extends B {
 public void print() {
     System.out.println("  Rest my case.");
 }
}


class Main {
 public static void main(String[] args) {
     C Obj = new C();
     Obj.display(); 
     Obj.show();    
     Obj.print();  
 }
}