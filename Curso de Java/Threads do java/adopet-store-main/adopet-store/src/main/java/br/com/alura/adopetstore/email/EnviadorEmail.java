package br.com.alura.adopetstore.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EnviadorEmail {

    @Autowired
    private JavaMailSender emailSender;

    @Async
    public void enviarEmail(String assunto, String destinatario, String textoEmail) {
        try {
//            Código para envio de email real
            var email = new SimpleMailMessage();
            email.setFrom("email@gmail.com");
            email.setSubject(assunto);
            email.setTo(destinatario);
            email.setText(textoEmail);
            emailSender.send(email);
            System.out.println("Enviando email!");
            System.out.println(textoEmail);

            //Simulando demora de 3 segundos para enviar email
            Thread.sleep(3000);

        } catch (Exception e) {

            throw new RuntimeException("Erro ao enviar email!", e);
        }
    }

}
