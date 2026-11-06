class SampleObject {
    SampleObject() {
        System.out.println("SampleObject constructed.");
    }

    void use() {
        System.out.println("SampleObject is being used.");
    }
}

public class Pratical7 {
    public static void main(String[] args) {
        SampleObject object = new SampleObject();
        object.use();

        object = null;
        System.out.println("The reference was removed; the object is eligible for garbage collection.");

        System.out.println("Requesting garbage collection...");
        System.gc();
        System.out.println("GC requested. The JVM may collect the object later, or may not collect it now.");
    }
}
