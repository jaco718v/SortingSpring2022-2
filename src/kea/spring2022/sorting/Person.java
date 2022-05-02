package kea.spring2022.sorting;

public class Person implements Sammenlignbar,Comparable {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean sorteresEfter(Sammenlignbar andetObjekt) {
        return this.firstName.compareTo(((Person) andetObjekt).firstName) > 0;
    }

    @Override
    public int compareTo(Object o) {
        return this.firstName.compareTo(((Person)o).firstName);
    }
}



