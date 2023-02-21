public class Calcul {
    int a;
    int b;
    char action;
    String res;

    public static void printCalc() {
        System.out.println("This is a calculator");

    }

    //public void calc (int a, int b, char cation){
    public void calc() {
        switch (this.action) {
            case '+':
                res = String.valueOf(this.a + this.b);
                break;
            case '-':
                res = String.valueOf(this.a - this.b);
                break;
            case '*':
                res = String.valueOf(this.a * this.b);
                break;
            case '/':
                res = String.valueOf(this.a / this.b);
                break;

        }
        System.out.println(res);

    }
}
