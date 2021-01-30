package com.deca.jelp.domain.message;

import com.deca.jelp.domain.client.Names;
import com.deca.jelp.domain.otp.Otp;

public class Message{


    public Message(Names names, Otp otp) {
        System.out.println(names + " tu codigo para aceptar la oferta de venta con promesa de recompra de tu joya es " + otp);
    }

    public Message(Otp otp){
        System.out.println("Joyeria Oro PLata: \n " +
                "Para iniciar el proceso de venta " +
                "con promesa de recompra necesitamos la autorizacion de la revision " +
                "de tu joya y aceptación de politica de privacidad y tratamiento de datos " +
                "www.jelp.com/politica, lo podrás hacer compartiendo este codigo con la persona " +
                "que te esta ayudando con el proceso, el codigo es " + otp );
    }
}
