package fpt;

public class Fraction {
    private int numer;
    private int denom;
    public Fraction(int num,int den){
        this.numer=num;
        this.denom=den;
    }


    void simplify() {
         int gcd = findGCD(numer, denom);

         numer /= gcd;
         denom /= gcd;

    }

         //GCD Function
        int findGCD(int a, int b) {
           int temp;
         while (b != 0) {
           temp = b;
           b = a % b;
           a = temp;
         }
          return a;
      }

    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    Fraction add(Fraction x){
        Fraction result;
        if(x.denom==denom){
            result = new Fraction(x.numer + numer, denom);
        }else {
            int den = denom * x.getDenom();
            int num = numer * x.getNumer();
            num += x.getNumer() * denom;
            result = new Fraction(num, den);
        }
        return result;
    }


    Fraction  subtract(Fraction x){
        Fraction result;
        if(x.denom==denom){
            result=new Fraction(x.numer-numer,denom);
        }else{
            int den = denom * x.getDenom();
            int num = numer * x.getNumer();
            num -= x.getNumer() * denom;
            result = new Fraction(num, den);
        }
        return result;
    }


}
