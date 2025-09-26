package collections_by_engineerDigest.maps.practiceHashes;

import java.lang.ref.WeakReference;

public class Gc {
    public static void main(String[] args) {

        WeakReference<Phone>phoneWeakReference = new WeakReference<>(new Phone("Iphone " , "16 pro Max"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }catch (Exception Ignored){

        }
        System.out.println(phoneWeakReference.get());
    }


}
class Phone{
    private String name;
    private String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
       return "{name : "+
                    name + "model : " + model+"}";
    }

}