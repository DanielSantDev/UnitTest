import java.util.Scanner;

public class Calculadora {

        private int A = 0;
        private int B = 0;
        private int Result;

        public int getResult() {
                return Result;
        }

        public void setResult(int result) {
                Result = result;
        }

        public int getA() {
                return A;
        }

        public void setA(int a) {
                this.A = a;
        }

        public int getB() {
                return B;
        }

        public void setB(int b) {
                this.B = b;
        }

        public int SOMA(){
                return Result = A + B;
        }

        public int MULTIPLICA(){
                return Result = A * B;
        }

        public int SUBTRAI(){
                return Result = A - B;
        }

        public int DIVIDE(){
                return Result = A / B;
        }
}