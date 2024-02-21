package com.example.esercizio7;
/*
scrivi una applicazione web Spring Boot con le dipendenze neccessarie che:
crea un mock della base dati usando h2 che ha username:testdb e password:psw1234
crea la tabella students dove ogni studente avrà:
primary key
colonna lastName (not null)
colonna firstName (not null)
colonna email con valori univoci e not null
usa la h2-console con il browser per connettersi al db
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Esercizio7Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio7Application.class, args);
	}

}
