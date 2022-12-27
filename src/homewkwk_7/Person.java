package homewkwk_7;
//Write a class with the name Person. The class needs three fields (instance variables) with the names
//firstName, lastName of type String and age of type int.
public class Person {
    public static void main(String[] args) {   //main method
        Person person =new Person();
        person.setFirstName("");
        person.setlastName("");
        person.setage(10);
        System.out.println("FullName="+person.getFullName());
        System.out.println("teen=" +person.isTeen());
        person.setFirstName("John");
        person.setage(18);
        System.out.println("FullName="+person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setlastName("Smith");
        System.out.println("FullName=" +person.getFullName());
    }
     String FirstName;
     String lastName;
     int age;
    public String getFirstName(){                   //getmethods
        return FirstName;
    }
    public String getlastName(){
        return lastName;
    }
    public int getage(){
        return age;

    }
    public void setFirstName(String FirstName){                       //setmethods
        this.FirstName =FirstName;
    }
    public void setlastName(String lastName){
        this.lastName=lastName;
    }
    public void setage(int age){
        if (age<=0 || age>100){
          this.age=age;


        }else{
            this.age=0;
        }

            }
    public boolean isTeen(){                                                       //true or false,boolean isteen method
       if (getage()>12 && getage()< 20){
         return true;
       }else{
           return false;
       }
    }
    public String getFullName(){                                                                   //getmethod
        if (FirstName.isEmpty() && lastName.isEmpty()){
          return"";
        }
        else if (FirstName.isEmpty()){
            return lastName;
        }
        else if (lastName.isEmpty()){
            return FirstName;
        }
        else{
            return getFirstName() + " " +getlastName();
        }


        }
    }


