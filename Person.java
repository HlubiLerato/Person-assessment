import java.util.ArrayList;

public class Person {
        private String name;
        private int age;
        private String gender;
        private ArrayList<String> interests;

        public Person(String name, int age, String gender, ArrayList<String> interests) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.interests = interests;
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

        public String getGender() {

            return gender;
        }

        public void setGender(String gender) {

            this.gender = gender;
        }

        public ArrayList<String> getInterests() {

            return interests;
        }

        public void setInterests(ArrayList<String> interests)
        {
            this.interests = interests;
        }

        public static void main(String[] args) {

            ArrayList<String> interests = new ArrayList<>();
            interests.add("hardarse");
            interests.add("agile");
            interests.add("SSD hard drives");

            Person person = new Person("Ryuk", 35, "Male", interests);

            System.out.println("Hello, my name is " + person.getName() + ", my gender is " + person.getGender() + " and I am "+ person.getAge() + " years old "+ ". My interests are being a " + person.getInterests());
        }
    }

