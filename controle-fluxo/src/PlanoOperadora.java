/*
Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

O sistema terá 03 planos: BASIC, MIDIA , TURBO;

BASIC: 100 minutos de ligação;

MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;

TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
 */

public class PlanoOperadora {
    public static void main(String[] args) {
     
        String plano = "B";

        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
            }
             case "M":{
                System.out.println("WhatsApp e Instagram grátis");
             };
        
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}


//Aqui, o Switch/Case auxiliou de forma complementar sem o uso de break