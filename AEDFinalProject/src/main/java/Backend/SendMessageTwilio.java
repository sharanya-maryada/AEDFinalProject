/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

/**
 *
 * @author ap
 */
public class SendMessageTwilio {
    
    public void sendMessage(String message_to_send, String phone_num_to_send) {
        Twilio.init("ACd238fce33bf503acecf098ba2cf3bb18", "309d590fe1868d29468140d651149ec9");
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(phone_num_to_send),
                new com.twilio.type.PhoneNumber("+17473024938"),
                message_to_send)
            .create();

        System.out.println(message.getSid());
    }
}
