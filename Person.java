public class Person implements Cantante{
 private String name;
 private int age;
 private int height;
 private int weight;
 private String eyeColor;
 private String gender;
 public Person() {
  // Nothing to do...
 }
 public Person(String name, int age, String gender){
   this.name = name;
   this.age = age;
   this.gender = gender;
 }
 public String toString() {
    String all = name + " * " + age + " * " + gender  +  " * ";
    return all;
 }

 public void setAge(int age) {
    this.age = age;
 }
 public int getAge() {
     return age;
 }
 public void setGender(String g) {
     gender = g;
 }
 public String getGender() {
     return gender;
 }
 public void setName(String n) {
     name = n;
 }
 public String getName() {
     return name;
 }

@Override
public void cantar() {
	System.out.println("For the kings, for the land, for the mountains!!!");
	
}
}
