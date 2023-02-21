public class Main {
    public static void main(String[] args) {

        Calcul.printCalc();


        Calcul calc = new Calcul();
        // calc.calc(2, 5, '*');
        //int a = 4;
        //int b = 8;
       // char action = '*';
      //  calc.calc(a,b,action);
        calc.a = 4;
        calc.b = 2;
        calc.action = '/';
        calc.calc();

       Calcul calc1 = new Calcul();
        calc1.calc();

    }
}
