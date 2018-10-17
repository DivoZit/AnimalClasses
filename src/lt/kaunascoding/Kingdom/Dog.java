package lt.kaunascoding.Kingdom;

public class Dog implements Animal {

    private String gyvunas;

    public Dog(String parType, String parName, float parWeight, float parHeight, String parAction) {
        gyvunas = parType;
    }


    @Override
    public float mammal() {
        String result = (gyvunas);
        System.out.println("Dog: " + result);
        return 0;
    }
}
