package school.mjc.stage0.loops.task4;

public class SkippingThird {

    public  void printUntilButThird(int lastPrinted) {
        for(int i = 0;i<=lastPrinted;i+=3){
            if(i==lastPrinted){
                break;
            }
            System.out.println(i);
        }
    }
}
