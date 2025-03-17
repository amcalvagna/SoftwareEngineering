package Importi;

/*
 * uscire dal folder Importi e compilare con 
 * > javac Importi/CalcolaImporti.java 
 * eseguire con 
 * > java Importi/CalcolaImporti
 * oppure 
 * > java Importi.CalcolaImporti 
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CalcolaImporti {  // classe Java vers 0.2

    private final List<String> importi = new ArrayList<>();
        private float totale, massimo;
    
        public float calcola(String p, String n) throws IOException {
            // conta il numero di linea man mano che leggi.
            LineNumberReader f = new LineNumberReader(new FileReader(new File(p, n)));

            // /* Metodi alternativi per scrivere e leggere
            FileWriter  F = new FileWriter(p+"test.txt", false);
            Random rnd = new Random();

            F.append(n.charAt(rnd.nextInt(n.length())));  
            F.append(n.charAt(rnd.nextInt(n.length())));
            F.append(n.charAt(rnd.nextInt(n.length())));

            F.write(n+"\n");    
            F.write(n+"\n");    
            F.write(p);
            F.write("ciao\n");
            
            
            BufferedWriter myFile = new BufferedWriter(F);  
            myFile.write(n+"\n");
            myFile.append(n.charAt(rnd.nextInt(n.length())));  //scrivo in coda al file
            myFile.newLine(); // codificato correttamente per la piattaforma locale
            myFile.close();
            
            
            
            Scanner sc = new Scanner(new File(p+n)); // open file leackage... 
            while (sc.hasNextFloat()) { 
                    float val = sc.nextFloat(); 
                    System.out.println(val); 
                    importi.add(Float.valueOf(val).toString());
                }
                
            F.close();       
                
            String riga;
            while (true) {
                riga = f.readLine();
                System.out.println(f.getLineNumber()); 
                if (null == riga) break;
                if (!importi.contains(riga))
                    importi.add(riga);
            }
            f.close();
    // calcola totale
            totale = 0;
            for (int i = 0; i < importi.size(); i++) 
                totale += Float.parseFloat(importi.get(i)); 
    // calcola massimo
            massimo = Float.parseFloat(importi.get(0));
            for (int i = 1; i < importi.size(); i++)
                if (massimo < Float.parseFloat(importi.get(i)))
                    massimo = Float.parseFloat(importi.get(i));
            return totale;
        }

        public static void main(String[] args) {
            try {
                System.out.println("totale: " + new CalcolaImporti().calcola("Importi/", "importi.txt"));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }    

    }