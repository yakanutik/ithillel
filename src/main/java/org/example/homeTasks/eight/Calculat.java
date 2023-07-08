package org.example.homeTasks.eight;

public enum Calculat {
    DIVISION{
        @Override
        public int action(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return  a / b;
        }
    },
    EXPON{
        @Override
        public int action(int a, int b) {
            int a1=a;
          for (int i=1; i<b; i++){
              a=a1*a;
            }
          return a;
        }
    };
    public abstract int action (int a, int b);
}
