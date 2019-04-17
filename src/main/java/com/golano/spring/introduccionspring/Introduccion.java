/*
 * Implementación Ejemplo Introducción Spring
 * http://acodigo.blogspot.com/2017/02/spring-tutorial-de-introduccion.html
 * Creación de Clase con el contenedor y main para prueba
 * En esta versión se usan anotaciones
 */
package com.golano.spring.introduccionspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 17/04/2019
 * @author gaolanot
 */
public class Introduccion {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = 
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        HelloService saluda = ctx.getBean("saludaService",HelloService.class);
        saluda.saludar();
        ctx.close();
    } 
}
