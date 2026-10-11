// File name: Q17_InheritanceConceptMain.java
public class InheritanceConceptMain {
    public static void main(String[] args) {
        System.out.println("Multiple and hybrid inheritance are explained in comments.");
        System.out.println("Java classes cannot extend two classes directly.");
    }
}

/*
Multiple inheritance of classes means one child class inherits from two parent classes.
Java does not allow this because it can create ambiguity (for example, the diamond problem).
Invalid idea (comment only; do not uncomment):
    class C extends A, B { }

Hybrid inheritance combines two or more inheritance forms, such as hierarchical and
multilevel inheritance. Java commonly uses interfaces when a class needs to inherit
multiple types/behaviors. This lab question asks for concepts only, so no interface
or executable multiple-inheritance code is implemented here.
*/
