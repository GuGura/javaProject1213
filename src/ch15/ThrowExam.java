package ch15;

public class ThrowExam {
    static void test(int n){
        if (n==0){
            throw new NullPointerException("nė´ 0ėëë¤.");
        }
    }

    public static void main(String[] args) throws NullPointerException{
        test(0);
    }
}
