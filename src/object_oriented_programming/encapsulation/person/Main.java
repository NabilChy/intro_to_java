package object_oriented_programming.encapsulation.person;

public class Main {

    public static void main(String[] args) {
        Person[] personArray = new Person[10];
        Person person1 = new Person();
        personArray[0] = new Person("Andrew",18,  5.2, 197, 'M', "Upper Darby");
        personArray[1] = new Person("Tom",50,  5.5, 210, 'M', "Outer Wall Slum");
        personArray[2] = new Person("Martha",45,  4.2, 180, 'F', "Inner Wall");
        personArray[3] = new Person("Eren",12,  6.7, 250, 'M', "Middle Wall");
        personArray[4] = new Person("Mikasa",13,  6.11, 170, 'F', "Lost City");
        personArray[5] = new Person("Lucy",75,  4.8, 130, 'F', "Magnolia");
        personArray[6] = new Person("Gray",20,  7.9, 270, 'M', "Magnolia");
        personArray[7] = new Person("Piper",32,  9.0, 300, 'F', "Kentucky");
        personArray[8] = new Person("Kiddo",10,  3.5, 80, 'M', "Shire");
        personArray[9] = new Person("Armin",21,  6.0, 110, 'M', "Gondor");

        // Prints out the female members.
        for (int i = 0; i < personArray.length; i++){
            if (personArray[i].gender == 'F'){
                System.out.println(personArray[i]);
            }
        }

        //Sorts the array in ascending order according to age. Returns the sorted array
        Person.sortAscendingByAge(personArray); // Gives Null-pointer-exception when the array is not full

        //Prints the Sorted array;
        System.out.println();
        System.out.println("Sorted");
        for (int i = 0; i < personArray.length; i++){
            System.out.println(personArray[i]);
        }

        //print youngest members information
        System.out.println("Youngest member: \n" + personArray[0]);

        //print eldest member information
        System.out.println("Eldest member: \n" + personArray[9]); //Will not work if array is not full.

        personArray[0].increaseAge();
        System.out.println(personArray[0]);
        System.out.println(personArray[0].getAge());

    }
    public static void name(){
        System.out.println("Here");
    }


}

