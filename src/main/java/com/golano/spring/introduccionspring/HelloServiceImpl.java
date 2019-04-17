/*
 * Implementación Ejemplo Introducción Spring
 * http://acodigo.blogspot.com/2017/02/spring-tutorial-de-introduccion.html
 * Creación de Clase para Servicio Hello \ implementa de HelloService
 * En esta versión se usan anotaciones
 */
package com.golano.spring.introduccionspring;

import org.springframework.stereotype.Service;

/**
 * 17/04/2019
 * @author gaolanot
 */
@Service ("saludaService")
public class HelloServiceImpl implements HelloService{
    //Implementación método saludar
    @Override
    public void saludar() {
         System.out.println("Ejercicio Spring con Anotaciones")   ;
    }
}
