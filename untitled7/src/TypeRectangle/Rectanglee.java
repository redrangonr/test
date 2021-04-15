package TypeRectangle;

public class Rectanglee {
    public String TriangleClassifier(int a, int b, int c) {
        String result ="";
        if ((a + b > c)&&(b + c > a)&&(a + c > b)&&(a>0&&b>0&&c>0)) {
            if (a==b&&a==c&&b==c)  {
               result= "tam giac deu";
            }else if(a == b || a == c|| b==c){
                result="tam giac can";
            }else {
                result ="tam giac thuong";
            }
        }else {
            result ="ko phai tam giac";
        }
        return result;
    }
}