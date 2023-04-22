//Task2
//Обчислення часу конкотенаціі при використанні StringBuffer та StringBuilder
public class Task2Concat {
    public static void main(String[] args)
    {
        TestConcat test=new TestConcat();
        long timeElapsed=test.measureTimeStr();
        long timeElapsedStrBuffer=test.measureTimeStrBuffer();
        long timeElapsedStrBuilder=test.measureTimeStrBuilder();
        System.out.println("Result a+b= "+test.resStr);
        System.out.println("timeStr: " + timeElapsed / 1000000);
        System.out.println("strBuffer.append(a).append(b): "+test.resStrBuffer);
        System.out.println("timeBuffer: " + timeElapsedStrBuffer / 1000000);
        System.out.println("strBuilder.append(a).append(b) "+test.resStrBuilder);
        System.out.println("timeBuilder: " + timeElapsedStrBuilder / 1000000);
    }
}
class TestConcat{
    String a = "first long string test FIRST LONG STRING TEST + ";
    String b = " second long string test123 SECOND LONG STRING TEST123 IN MILLISECONDS:";
    int N=3000000;
    String resStr;
    String resStrBuffer;
    String resStrBuilder;

    public long measureTimeStr(){
        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            resStr = a + b;
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        return timeElapsed;
    }
    public long measureTimeStrBuffer(){
        long startTimeStrBuffer = System.nanoTime();
        for (int i=0;i<N;i++) {
            StringBuffer strBuffer = new StringBuffer();
            resStrBuffer = strBuffer.append(a).append(b).toString();
        }
        long endTimeStrBuffer = System.nanoTime();
        long timeElapsedStrBuffer = endTimeStrBuffer - startTimeStrBuffer;
        return timeElapsedStrBuffer;

    }
    public long measureTimeStrBuilder(){
        long startTimeStrBuilder = System.nanoTime();
        for (int i=0;i<N;i++) {
            StringBuilder strBuilder = new StringBuilder();
            resStrBuilder = strBuilder.append(a).append(b).toString();
        }
        long endTimeStrBuilder = System.nanoTime();
        long timeElapsedStrBuilder = endTimeStrBuilder - startTimeStrBuilder;
        return timeElapsedStrBuilder;
    }
}