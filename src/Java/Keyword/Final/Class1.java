package Java.Keyword.Final;

public final class Class1 {
    final static int a = 20;

    public static void main(String [] args){
      //   a = 30;  -->   throw error as final variable con not be changed.
    }
}

// class Class2 extends Class1_SingleKeyword{}    -->   throw error as Class1_SingleKeyword is final. Final class can not be extended

class Class3{
    final int sum(int a, int b){
        return a + b;
    }
}

class Class4 extends Class3{
    /* int sum(int a, int b)    --> final method can not be overridden
        {
          return a + b;
        }
    */
}

