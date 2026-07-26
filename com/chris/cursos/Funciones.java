package com.chris.cursos;

import java.util.ArrayList;

public class Funciones {
    public static void main(String[] args){
        for (int index = 0; index < 5; index++){
        sendEmail();
        }
        //
        sendEmail();
        sendEmailToUsers("oziel@gmail.com");
        sendEmailToUsers("oziel@gmail.com", "Oziel");
        sendEmailToUsers(new String[]{"oziel","perez"});
        var state = sendEmailWithState("ozielp@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));
    }
    //Funciones

        //funciones sin parametro ni retorno
        //definicion de funciones

        public static void sendEmail(){
            System.out.println("se envia el gmail");
        }

        //funciones con parametros
        /*  esto se le llama sobrecarga se utiliza
        el mismo nombre pero se sobrecarga de funciones pero
        con un corportamiento diferente*/
        public static void sendEmailToUsers(String email){
            System.out.println("se envio el email a " + email);
        }
        public static void sendEmailToUsers(String email, String name){
            System.out.println("se envio el email a " + name + " con el correo " + email);
        }

        public static void sendEmailToUsers(String[] emails){
            for (String email : emails){
                System.out.println("se envio el email a " + email);
            }            
        }

        //funciones con retorno
        //la sobre carga de fuciones no funciona la cabiar el tipo de dato
        public static boolean sendEmailWithState(String email){
            if (email.isEmpty()){
                return false;
            }
            System.out.println("se ha envia el gmail a " + email);
            return true;
        }
    //poner nombre claros en los metodos
    //utilizar la sobre carga
    //utlizar metodos para un solo funcion en concreta
}
