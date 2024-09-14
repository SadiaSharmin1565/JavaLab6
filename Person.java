package com.mycompany.person;
public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
 
      public String getName(){
              return name;
       }
       public void setName(String name){
              this.name=name;
       }
       public int getAge(){
              return age;
        }
       public void setAge(int age){
              this.age=age;
       }
       public String getGender(){
              return gender;
       }
       public void setGender(String gender){
              this.gender=gender;
       }
       public String getAddress(){
              return address;
        }
       public void setAddress(String address){
              this.address=address;
       }
      

    public static void main(String[] args) {
        Person person1 =new Person();
        person1.setName("Sadia");
        person1.setAge(21);
        person1.setGender("Fe-male");
        person1.setName("Shukrabad dhanmondi32");
        
        Person person2 =new Person();
        person2.setName("Sharmin");
        person2.setAge(22);
        person2.setGender("Fe-male");
        person2.setName("Mirpur 1");
        
        Person person3 =new Person();
        person3.setName("Mafia");
        person3.setAge(20);
        person3.setGender("Fe-male");
        person3.setName("Mohammadpur,dhaka");
        
        
        System.out.println("x :Person1");
        System.out.println("Name :"+person1.getName());
        System.out.println("Age :"+person1.getAge());
        System.out.println("Gender :"+person1.getGender());
        System.out.println("Address :"+person1.getAddress());
        System.out.println();
        
        System.out.println("x :Person2");
        System.out.println("Name :"+person2.getName());
        System.out.println("Age :"+person2.getAge());
        System.out.println("Gender :"+person2.getGender());
        System.out.println("Address :"+person2.getAddress());
        System.out.println();
        
        System.out.println("x :Person3");
        System.out.println("Name :"+person3.getName());
        System.out.println("Age :"+person3.getAge());
        System.out.println("Gender :"+person3.getGender());
        System.out.println("Address :"+person3.getAddress());
        System.out.println();
        
        
        
        
    }
}
