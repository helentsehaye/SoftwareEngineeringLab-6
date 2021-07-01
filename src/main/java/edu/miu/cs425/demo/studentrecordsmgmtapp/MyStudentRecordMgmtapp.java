package edu.miu.cs425.demo.studentrecordsmgmtapp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.miu.cs425.demo.studentrecordsmgmtapp.model.Student;

/**
 * Hello world!
 *
 */
public class MyStudentRecordMgmtapp

{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student s1 = new Student(110001,"Dave",LocalDate.of(1951,11,18));
        Student s2 = new Student(110002,"Anna",LocalDate.of(1970,12,07));
        Student s3 = new Student(110003,"Erica",LocalDate.of(1974,01,31));
        Student s4 = new Student(110004,"Carlos",LocalDate.of(2009,8,22));
        Student s5 = new Student(110005,"Bob",LocalDate.of(1990,03,05));
        
        Student[] students = {s1,s2,s3,s4,s5};
        
        printListOfStudents(students);
        
        List<Student> sts = getListOfPlatinumAlumniStudents(students);
        
        System.out.println("*****************************************************************");
        
        sts.forEach(System.out::println);
        
        System.out.println("**************************************************************");
        
        int[] num = {30,70,1,2,7};
         
        printHelloWorld(num);
        
        System.out.println("**************************************************************");
        
        int[] num2 = {1,2,3,4,5};
        
        int[] num3 = {19,9,11,0,12};
        
        findSecondBiggest(num2);
        findSecondBiggest(num3);
        
        		
    }
    private static void printListOfStudents(Student[] students) {
    	Arrays.stream(students).sorted(Comparator.comparing(Student::getName))
    	.forEach(System.out::println);
    	
    }
    
    private static List<Student> getListOfPlatinumAlumniStudents(Student[] students){
    	return Arrays.stream(students)
    			     .filter(x->( LocalDate.now().getYear())-(x.getDateOfAdmission().getYear()) > 30)
    			     .sorted(Comparator.comparing(Student::getDateOfAdmission))
    			     .collect(Collectors.toList());
    	
    }
    public static void  printHelloWorld(int[] num) {
    	for(int i=0; i<num.length;i++) {
    		if(num[i]%5==0 && num[i]%7==0) {
    			System.out.println("Hello World");
    		}
    		if(num[i]%5==0) {
    			System.out.println("World");
    		}
    		if(num[i]%7==0) {
    			System.out.println("Hello");
    		}
    	}
    }
    private static void findSecondBiggest(int[] arr) {
    	
    	int temp;
    	int size;
    	size= arr.length;
    	for(int i=0; i< size;i++) {
    		for(int j=i+1;j<size;j++) {
    			if(arr[i] > arr[j]) {
    				temp = arr[i];
    				arr[i] =arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	System.out.println("The Second largest number is:" + arr[size-2]);
    }
    
}
