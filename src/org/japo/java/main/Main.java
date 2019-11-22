/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {
    

    public static void main(String[] args) {
        //variables
        String comprador = "Jaimito";
        String producto = "Patata";
        String productoIm = "Piruleta";
        int cantidad = 3;
        int patatasComp;
        double dineroComp = 1;
        double cambio;
               
        //constantes
        final double PATATA = 0.30;
        final double PIRULETA = 0.20;
        
        System.out.printf("Secuencia de Patatas%n==============================%n");
        System.out.printf("Persona encargada .....: %s%n", comprador );
        System.out.printf("Artículo encargado ....: %s%n", producto );
        System.out.printf("Cantidad encargada ....: %d Kg%n", cantidad );
        System.out.println("---");
        System.out.printf(Locale.ENGLISH, "Precio encargo ........: %.2f €/Kg%n", PATATA );
        System.out.printf("Dinero suministrado ...: %.2f €%n", dineroComp );
        System.out.println("---");
        System.out.printf("Artículo imprevisto ...: %s%n", productoIm );
        System.out.printf(Locale.ENGLISH, "Precio imprevisto .....: %.2f €%n", PIRULETA );
        System.out.println("---");
        patatasComp = (int)((dineroComp - PIRULETA) / PATATA);
        System.out.printf("Cantidad comprada .....: %d Kg%n", patatasComp );
        cambio = (dineroComp - PIRULETA) % PATATA;
        System.out.printf(Locale.ENGLISH, "Dinero devuelto .......: %.2f €%n", cambio );
        
        
    }
        
        
       
        
        
        
    }


