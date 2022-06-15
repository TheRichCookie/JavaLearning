package org.JavaTutorial;

public class Main{


    public static void main(String[] args){

        class phone{
            double version;
            String model;
            phone(double paramversion, String parammodel){
                model = parammodel;
                version = paramversion;
                talk();

            }
            void talk(){
                System.out.println("Your phone model: " + model +"\nVersion: " + version);
            }

        }
        phone phone1 = new phone(1.5, "Android");
        if(phone1.version == 1.1)
            System.out.println("Last Version!");
        else
            System.out.println("Your phone need update!");
        phone phone2 = new phone (2.5, "ios");



    }


}