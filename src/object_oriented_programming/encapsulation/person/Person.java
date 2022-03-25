package object_oriented_programming.encapsulation.person;

public class Person {
    public String name;
    private int age;
    private double height;
    private double weight;
    public char gender;
    public String address;

    public Person(){

    }

    public Person(String name, int age, double height, double weight, char gender, String address) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }

    public static Person[] sortAscendingByAge(Person[] arr){
        Person[] temp = new Person[1];
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++) {
                if (arr[j].age < arr[i].age) {
                    temp[0] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp[0];
                }
            }
        }
        return arr;
    }

    public void increaseAge(){
        this.age++;
    }

}
