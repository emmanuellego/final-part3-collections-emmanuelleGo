/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section1;

import java.util.Comparator;

/**
 *
 * @author ejgo
 */
public class StudentGradeComparator implements Comparator<Student>{

    public int compare(Student o1, Student o2) {
        return o1.getGrade().compareTo(o2.getGrade());
    }
    
}
