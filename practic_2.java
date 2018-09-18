package com.company;

class Author
{
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender = g;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String e)
    {
        email = e;
    }

    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        return name + " (" + gender + ") at " + email;
    }
}

public class Main {
    public static void main(String[] args) {
        Author a = new Author("Some name", "somename@mail.com", 'm');
        System.out.println(a.toString());
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
        a.setEmail("somename2@mail.com");
        System.out.println(a.toString());
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
    }
}
