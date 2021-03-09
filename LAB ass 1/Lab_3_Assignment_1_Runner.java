
package com.mycompany.lab_3_assignment_1;

public class Lab_3_Assignment_1_Runner {
    
    public static void main(String[] args) {
        
        Marks student1 = new Marks();
        Marks student2 = new Marks(66, 79, 92);
        
        System.out.println("The total marks for student 1 are " + student1.sum());
        System.out.println("The total marks for student 2 are " + student2.sum());
    }
    
}
