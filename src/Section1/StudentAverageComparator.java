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
public class StudentAverageComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverage().compareTo(o2.getAverage());
    }
    
}
