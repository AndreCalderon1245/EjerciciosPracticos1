/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos1;

import java.util.Scanner;
/**
 *
 * @author End User
 */
public class EjerciciosPracticos1 {

  public static int seleccion;
    public static String[][] aCodigo;
    static String[][] aPersonajes; 
    static String sexo;
    public static String[][] Questions;
    public static String[][] Answer;
    public static int Contador;
   
    
     public static void QuestionsQuizz() {
        Questions = new String[10][2];
        Questions[0][0] = "¿Cuál es la sintaxis correcta para generar Hello World en Java?";
        Questions[0][1] = "0";
        Questions[1][0] = "¿Cómo se insertan comentarios de una línea en Java?";
        Questions[1][1] = "1";
        Questions[2][0] = "¿Qué tipo de datos se utiliza para crear una variable que almacene texto?";
        Questions[2][1] = "2";
        Questions[3][0] = "¿Cómo se crea una variable numérica que asigne el valor 5?";
        Questions[3][1] = "0";
        Questions[4][0] = "¿Qué operador se utiliza para comparar dos valores?";
        Questions[4][1] = "1";
        Questions[5][0] = "¿Para declarar un arreglo, la variable se define como tipo?";
        Questions[5][1] = "2";
        Questions[6][0] = "¿Qué instrucción se usa para crear una clase en Java?";
        Questions[6][1] = "0";
        Questions[7][0] = "¿Cuál es la sentencia correcta para crear un objeto llamado myObj de MyClass? ";
        Questions[7][1] = "1";
        Questions[8][0] = "¿Cuál es el operador que se utiliza para multiplicar números?";
        Questions[8][1] = "2";
        Questions[9][0] = "¿Cómo se inicia la sentencia if en Java?";
        Questions[9][1] = "0";
    }

    public static void AnswerQuizz() {
        Answer = new String[10][3];
        Answer[0][0] = "System.out.println( Hello World );";
        Answer[0][1] = "echo( Hello World );";
        Answer[0][2] = "print ( Hello World );";
        Answer[1][0] = "/* This is a comment";
        Answer[1][1] = "// This is a comment";
        Answer[1][2] = "# This is a comment";
        Answer[2][0] = "myString";
        Answer[2][1] = "string";
        Answer[2][2] = "String";
        Answer[3][0] = "int x = 5;";
        Answer[3][1] = "num x = 5";
        Answer[3][2] = "x = 5;";
        Answer[4][0] = "><";
        Answer[4][1] = "==";
        Answer[4][2] = "<>";
        Answer[5][0] = "{}";
        Answer[5][1] = "()";
        Answer[5][2] = "[]";
        Answer[6][0] = "class";
        Answer[6][1] = "MyClass";
        Answer[6][2] = "class()";
        Answer[7][0] = "class MyClass = new myObj();";
        Answer[7][1] = "MyClass myObj = new MyClass();";
        Answer[7][2] = "new myObj = MyClass();";
        Answer[8][0] = "%";
        Answer[8][1] = "X";
        Answer[8][2] = "*";
        Answer[9][0] = "if (x > y)";
        Answer[9][1] = "if x > y;";
        Answer[9][2] = "if x > y then;";
    }

    public static void JAVAQuizzProceso(){
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        
        //entrara un bucle de la longitud de la matriz
        for (int i = 0; i < Questions.length; i++) {
            //imprimira las preguntas con 3 posibles respuestas
            System.out.println();
            System.out.println("Pregunta " + (i + 1));
            System.out.println(Questions[i][0]);
            System.out.println("0.- " + Answer[i][0]);
            System.out.println("1.- " + Answer[i][1]);
            System.out.println("2.- " + Answer[i][2]);
            System.out.println();
            System.out.print("Escribe tu respuesta: ");
            respuesta = entrada.nextLine();
            //si la respuesta es correcta el contador aumentara
            if(Questions[i][1].equals(respuesta)){
                Contador++;
            }
        }
    }
    
    public static int Contador(){
        return Contador;
    }
    
    
     public static String caracter(char car) {
        //el carater dado lo convierte a int correspondiente a su codigo ascii;
        int numCa = (int) car;
        //ejemplo como parametro paso B entonces su codigo es 66
        //aCodgio[66-65][0] = aCodigo[1][0] = B
        //lo mismo sucede con el otro pero el otro pertenece a clave morse
        return aCodigo[numCa - 65][0] + " " + aCodigo[numCa - 65][1];
    }
    
    public static void bucle(String frase, char carFrase[]){
        //bucle para imprimir el codigo
        for (int i = 0; i < frase.length(); i++) {
            //si ejemplo: carFrase[5] = " "; entonces entrara y dara un enter
            if(String.valueOf(carFrase[i]).equals(" ")){
                System.out.println("");
            //si el if no se cumple imprimira el caracter correspondiente
            } else {
                System.out.println(caracter(carFrase[i]));
            }
        }
    }
    
    public static String Pago(String frase, char carFrase[]){
        //inicialice con uno porque solo me contara los espacios y la primera 
        //palabra no hay espacio asi que al inicializarlo con uno ya me estaria
        //contando una palabra minimo
        int contador = 1;
        int precio = 0;
        //un bucle para obtener el contador de las veces que hay espacios
        //los espacios indican una palabra nueva
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                contador++;
            }
        }
        //cree un if mientras que el contador sea igual o menor a 5 son 10 pesos
        if(contador <= 5){
            precio = 10;
        //mientras el contador sea mayor
        //el contador - 5 y el resultado * 3 y se le sumara 10
        //ejemplo de 8 palabras
        //8 - 5 = 3 * 3 = 9 + 10 = 19 pesos
        } else{
            precio = ((contador - 5) * 3) + 10;
        }
        return "Numero de palabras: " + contador + "\n" + "El total de su cuenta es $" + precio + " pesos";
    }
    
    public static void CodigoMorse (){    
    
        String sFrase;
        aCodigo = new String[26][2];
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";

        // Arreglo con representación del Alfabeto
        // En código Morse

        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
    }
    
     public static void PersonajesSWProceso(String genero){
        sexo = genero;
        for (int i = 0; i < aPersonajes.length; i++) {
            //si el personaje es igual al sexo introducido
            //imprimira los datos
            if(aPersonajes[i][2].equals(sexo)){
                System.out.println(aPersonajes[i][0]);
                System.out.println(aPersonajes[i][1]);
                System.out.println(aPersonajes[i][2]);
                System.out.println();
            }
        }
    }
    
    public static void PersonajesSW (){
        
            aPersonajes = new String[16][3];
            aPersonajes[0][0] = "Luke Skywalker";
            aPersonajes[0][1] = "172";
            aPersonajes[0][2] = "male";
            aPersonajes[1][0] = "R2-D2";
            aPersonajes[1][1] = "96";
            aPersonajes[1][2] = "n/a";
            aPersonajes[2][0] = "C-3PO";
            aPersonajes[2][1] = "167";
            aPersonajes[2][2] = "n/a";
            aPersonajes[3][0] = "Darth Vader";
            aPersonajes[3][1] = "202";
            aPersonajes[3][2] = "male";
            aPersonajes[4][0] = "Leia Organa";
            aPersonajes[4][1] = "150";
            aPersonajes[4][2] = "female";
            aPersonajes[5][0] = "Owen Lars";
            aPersonajes[5][1] = "178";
            aPersonajes[5][2] = "male";
            aPersonajes[6][0] = "Beru Whitesun lars";
            aPersonajes[6][1] = "165";
            aPersonajes[6][2] = "female";
            aPersonajes[7][0] = "R5-D4";
            aPersonajes[7][1] = "97";
            aPersonajes[7][2] = "n/a";
            aPersonajes[8][0] = "Biggs Darklighter";
            aPersonajes[8][1] = "183";
            aPersonajes[8][2] = "male";
            aPersonajes[9][0] = "Obi-Wan Kenobi";
            aPersonajes[9][1] = "182";
            aPersonajes[9][2] = "male";
            aPersonajes[10][0] = "Yoda";
            aPersonajes[10][1] = "66";
            aPersonajes[10][2] = "male";
            aPersonajes[11][0] = "Jek Tono Porkins";
            aPersonajes[11][1] = "180";
            aPersonajes[11][2] = "male";
            aPersonajes[12][0] = "Jabba Desilijic Tiure";
            aPersonajes[12][1] = "175";
            aPersonajes[12][2] = "hermaphrodite";
            aPersonajes[13][0] = "Han Solo";
            aPersonajes[13][1] = "180";
            aPersonajes[13][2] = "male";
            aPersonajes[14][0] = "Chewbacca";
            aPersonajes[14][1] = "228";
            aPersonajes[14][2] = "male";
            aPersonajes[15][0] = "Anakin Skywalker";
            aPersonajes[15][1] = "188";
            aPersonajes[15][2] = "male";
        
    }
    
    public static void While (){
    
    int suma = 0;
    int i = 0;
     
     while (i <= 10){
         
         suma+=i;
         i++;   
         
     }
     
     System.out.println(suma);
        PersonajesSW();
    }
    
    public static void Encabezado(){
    
        System.out.println("=====================================================");  
        System.out.println("    UNIVERSIDAD AUTÓNOMA DEL ESTADO DE CAMPECHE");
        System.out.println("====================================================="); 
        System.out.println(" FACULTAD DE INGENIERÍA EN SISTEMAS COMPUTACIONALES"); 
        
        }
    
    
    // Cuerpo
    
    public static void Cuerpo(){
    
        System.out.println("====================================================="); 
        System.out.println(" CLASE DE LENGUAJE DE PROGRAMACIÓN 1RO A. CICLOS FOR"); 
        System.out.println("====================================================="); 
    }
    
    // Pie
    
    public static void Pie(){
    
        System.out.println("=====================================================");
        System.out.println("                                             ACM.2021"); 
    
    }
    
    public static void Seleccion(int opcion){
        
        Scanner input = new Scanner(System.in);   
            switch (opcion) {
            case 1:
                System.out.println("===================[PERSONAJES DE STAR WARS]===================="); 
                System.out.println("Introduzca un género");
                System.out.println("male, female, n/a, hermaphrodite");
                String genero = input.nextLine();
                //matriz de los personajes
                PersonajesSW();
                //bucle donde se imprimiran los personajes correspondientes
                PersonajesSWProceso(genero);
                break;
            case 2:
                While();
                break;
            case 3:
                System.out.println("===================[CÓDIGO MORSE]===================="); 
                System.out.println("Introduce una frase: ");
                String frase = input.nextLine().toUpperCase();
                char carFrase[] = frase.toCharArray();
                CodigoMorse();
                bucle(frase, carFrase);
                System.out.println(Pago(frase, carFrase));
                break;
            case 4:
                System.out.print("==================[QUIZZ DE JAVA]==================="); 
                QuestionsQuizz();
                AnswerQuizz();
                JAVAQuizzProceso();
                System.out.println();
                System.out.println("Obtuviste un " + Contador + "0 de Calificacion");
                break;
            default:    
            System.out.println("Favor de escribir un número que este dentro de la lista:");   
                break;    
            }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Encabezado();
        Cuerpo();
        Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione un programa: \nPersonajes de Star Wars --------> 1 \nWhile --------------------------> 2 \nCodigo Morse -------------------> 3 \nQuizz sobre JAVA ---------------> 4");  
            seleccion = sc.nextInt();
            Seleccion(seleccion);
         Pie();    
     
        
    }
    
}
