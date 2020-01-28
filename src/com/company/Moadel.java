package com.company;

public class Moadel {
    public void avg(int m,double j[]){

        double sum=0;
        double miangin=0;

        for(int i = 0; i < m ; i++) {
            sum+=j[i];
        }
        miangin=sum/m;

        if(miangin>=10){
            System.out.println("ghaboul shodid \nmiangin="+miangin);
        }
        else{
            System.out.println("mardod shodid \nmiangin="+miangin);
        }
    }
}
