
public class EjerDepuracionFacil {

    public static void main(String args[]){
        double f=18.5;
        double x=3.0;
        for (int i=0; i<=100;i++){
            if(i%2==0){
                x++;
                for(int j=70;j>0;j--){
                    if(f!=0)
                    f=f+x/2;
                }
            }else{
                x=x-f;
            }
        }


    }
}