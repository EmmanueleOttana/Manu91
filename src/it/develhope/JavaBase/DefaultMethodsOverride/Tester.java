package it.develhope.JavaBase.DefaultMethodsOverride;

public class Tester {
    public static void main(String[] args) {
        SmartphonePrice producer1 = new SmartphonePrice("Euro", 73.10);
        SmartphonePrice producer2 = new SmartphonePrice("Euro", 96.90);
        SmartphonePrice retail1 = new SmartphonePrice("Euro", 349.99);
        SmartphonePrice retail2 = new SmartphonePrice("Euro", 399.99);

        Smartphone s10 = new Smartphone("Samsumg", "S10", 4500, producer1, retail1);
        Smartphone a5 = new Smartphone("Oppo", "X5", 5000, producer2, retail2);


        System.out.println(s10.toString());
        System.out.println(a5.toString());

        if (s10.equals(a5)) {
            System.out.println("The S10 smartphone is the same as the S5 smartphone");
        } else {
            System.out.println("The S10 smartphone is not the same as the A5 smartphone");
        }
        try {
            a5.clone();
            System.out.println(a5.clone());
            if(a5.equals(a5.clone())){
                System.out.println("The A5 smartphone is the same as the cloned A5 smartphone");
            }else{
                System.out.println("The A5 smartphone is not the same as the cloned A5 smartphone");
            }
        } catch (Exception exception){
            System.out.println("There was an error, you will find the details below");
            exception.printStackTrace();
        }
    }
}