package com.oops.Oops_06.ExceptionHandling;

public class Main  {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a,b);

            throw new Exception("just to guts");

        }catch( MyException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("This will always execute no matter what");
        }
//        int c = a/b;
//        System.out.println(c);
    }

    static int divide (int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("why b is zero");
        }
        return a/b;
    }
}
