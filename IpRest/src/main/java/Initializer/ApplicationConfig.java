/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import service.Club;

/**
 *
 * @author Annelore pc
 */
@Configuration
@ComponentScan("Personcontroller")
@EnableWebMvc  
public class ApplicationConfig { 
    @Bean
     public Club service() {
         return new Club("Memory");
     }
}