//Encapsulation in java is a  process wrapping the code and data together  into single unit
//step is achieve
// 1.all the variable is private.
//2.use getter and setter for insert and get the value


public class Main {
    public static void main(String[] args) {
       Test hansraj =new Test();

        hansraj.setterEnglish(30);
        hansraj.setterMath(40);
        System.out.println(hansraj.getterEnglish());
        System.out.println(hansraj.getterMath());


    }
}

class Test{
   private int Math;
    private int English;


    void setterMath(int x){
        if(x>0) {
            Math = x;
        }
    }
    void setterEnglish(int y){
        if(y>0){
        English=y;}
    }

    int getterMath(){
        return Math;
    }
    int getterEnglish(){
        return English;
    }
}