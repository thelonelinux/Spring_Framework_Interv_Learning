package org.example;

public class Student {

    String name;

    public Student() {
        //This constructor is required else property set by setter method needs this to first create the bean
        //and then set the string in bean in xml file.
        //If you remove this they were giving errors.
    }

    public Student( String name ) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println( "Hello - I am  a student" );
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
