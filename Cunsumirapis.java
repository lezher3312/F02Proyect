/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cunsumirapis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author josh
 */
public class Cunsumirapis {

    public static void main(String[] args){
        final String URL_API= "http://localhost:8080/api/v1/candidates";
        try {
            // inicio de la coneccion
            URL url = new URL (URL_API);
            URLConnection conexion = url.openConnection();
            //lectura del contenido de la respuesta
            Reader r=new InputStreamReader (conexion.getInputStream());
            BufferedReader br =new BufferedReader(r);
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.print(linea);
            }
        }catch (IOException e){
            
          System.err.println("Error de I/O;"+ e.getMessage());
        }
                
    }
}
