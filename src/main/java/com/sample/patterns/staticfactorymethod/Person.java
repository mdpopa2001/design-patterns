package com.sample.patterns.staticfactorymethod;

public class Person {
    private final String firstName;
    private final String lastName;

    private Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /* static factory method */
    public static Person createWithLastNameOnly(String lastName)
    {
        return new Person(null, lastName);
    }

    /* static factory method */
    public static Person createWithFirstNameOnly(String firstName)
    {
        return new Person(firstName, null);
    }

    /* static factory method */
    public static Person create(String firstName, String lastName)
    {
        return new Person(firstName, lastName);
    }


//    //only with firstName;
//    public Person(String firstName)
//    {
//        this(firstName, null);
//    }
//
//    //only with lastName;
//    public Person(String lastName)
//    {
//        this(null, lastName);
//    }
//
//

}
