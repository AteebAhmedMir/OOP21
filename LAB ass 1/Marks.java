
package com.mycompany.lab_3_assignment_1;

public class Marks {
    private int subject_1_marks;
    private int subject_2_marks;
    private int subject_3_marks;
    
    Marks(){
        subject_1_marks = 0;
        subject_2_marks = 0;
        subject_3_marks = 0;
    }
    
    Marks(int subject_1_marks, int subject_2_marks,int subject_3_marks){
        this.subject_1_marks = subject_1_marks;
        this.subject_2_marks = subject_2_marks;
        this.subject_3_marks = subject_3_marks;
    }
    
    public int sum(){
        return (subject_1_marks + subject_2_marks + subject_3_marks);
    }
}
