
package Aula09_21;

public class Exemplo8 {
   public static void main(String[] args) {
        int [][] matparimpar= new int [2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matparimpar[i][j]=(int)(Math.random()*10);
                System.out.println(matparimpar[i][j]+" ");
            }
        }
        System.out.println("valores mudados");
        int flag=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if (flag==0){
                matparimpar[i][j]+=3;
                flag=1;
                }else{
                matparimpar[i][j]+=2;
                flag=0;
                }
                System.out.println(matparimpar[i][j]+" ");
            }
            flag=0;
        }    
    } 
}
