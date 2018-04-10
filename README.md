# Stuff-to-Download
stuff


Installing All the cool stuff:

1. Install JDK: 
   - 9:: http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html

2. Install Xampp: https://www.apachefriends.org/index.html

3. Install MySQL workbench: https://dev.mysql.com/downloads/windows/installer/

4. Install NetBeans: https://netbeans.org/downloads/
   
   
5. Git: https://git-scm.com/download/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


class Principal {
    String punishmentType; 
    
    Principal(){
        punishmentType = "paddle";
    }
    
    Principal( String punIshment ){
        
    }
}



class Teacher {
    
        private String subject;
        
        Teacher(){
            System.out.println("Oh hey class, I'm a teacher");
            subject = "math"; 
        }
        
        Teacher(String ultraCoolSubject){
            System.out.println("oh hey class, I'm a teach of "+ ultraCoolSubject); 
            this.subject = ultraCoolSubject; 
        }
        
        String getSubject(){
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
