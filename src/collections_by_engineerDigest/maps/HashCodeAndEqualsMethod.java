package collections_by_engineerDigest.maps;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("alice", 90);
        Person p2 = new Person("Bob", 92);
        Person p3 = new Person("alice", 90);
        map.put(p1, "Engineer");// hashcode1---index1
        map.put(p2, "Technician");// hashcode2 ---index2
        map.put(p3, "Manager");// hashcode3--index3

        System.out.println("hashcode size" + map.size());
        System.out.println("value of the p1" + map.get(p1));
        System.out.println("value of the p3" + map.get(p3));
        System.out.println(p1);

        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("shubam", 90);// hashcode1 --index1;
        map1.put("neha", 92);// hashcode2--index2;
        map1.put("shubam", 99);// hashcode1 ---index1--equals()-->replace

    }

}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj==null) {
            return false;
        }
        if (getClass()!=obj.getClass()) {
            return  false;
        }
        Person other =(Person)obj;
        return id == other.getId()&&Objects.equals(name, other.getName());
    }

    @Override
    public int hashCode() {
    return Objects.hash(id,name);
    }


    @Override
    public String toString() {

        return "id" + id + " : " + "name:" + name;
    }

}
