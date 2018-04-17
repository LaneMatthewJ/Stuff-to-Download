/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

class Job {
    int salary;
    double otherThings; 
    String jobTitle; 
    
    Job(){
        salary = 100000;
        jobTitle = "ultra cool job that pays really well"; 
    }
    
    Job(int salary){
        this.salary = salary;
    }
    
    int getSalary(){
        return salary; 
    }
    
    void setSalary(int s){
        salary = s;
    }
    
}




class Principal {
    String punishmentType; 
    
    Principal(){                            // construcor that gets called when "new principal" is called
        punishmentType = "paddle";
    }
    
    Principal( String punIshment ){
        punishmentType = punIshment; 
    }
    
    String getPunishment(){                 // not construcor - gets called when we call it
        return punishmentType; 
    }
    
    void setPunishment(String type){
        punishmentType = type; 
    }
 }



class Teacher {
    
        private String subject;
        
        Teacher(){ // construcor that gets called when "new teacher" is called
            System.out.println("Oh hey class, I'm a teacher");
            subject = "math"; 
        }
        
        Teacher(String ultraCoolSubject){
            System.out.println("oh hey class, I'm a teach of "+ ultraCoolSubject); 
            this.subject = ultraCoolSubject; 
        }
        
        String getSubject(){  // not construcor - gets called when we call it
            return subject; 
        }
        
        void setSubject(String sub){
            subject = sub; 
        }
        
}




public class JavaApplication2 {
    
    static void saySomething(String something){
            System.out.println("This is something: " + something );
     }

    public static void main(String[] args) {
         
        String otherThing = "RAD DAD";
        saySomething(otherThing); 
        
        Teacher matt = new Teacher(); 
        
        System.out.println( "WHAT DOES THE TEACHER TEACH? " + matt.getSubject() );

        Teacher theCoop = new Teacher("CS (Way cooler than that Matt guy amirite)");
        
        System.out.println( "WHAT DOES THE TEACHER TEACH? " + theCoop.getSubject() );
        
        
        
    }
}
