public class App {
    public static void main(String[] args){
        Persona[] personas = listaNombres();
        BurbujaAvanzado.ordenarByName(personas);
        BurbujaAvanzado.imprimir(personas);


    }
    public static Persona[] listaNombres(){
        
        Persona[] personas = new Persona[20];

        
        personas[0] =new Persona("Carlos", 22);
        personas[1]  = new Persona("Ana", 18);
        personas[2]  =new Persona("Luis", 25);
        personas[3]  = new Persona("María", 20);
        personas[4]  = new Persona("Pedro", 19);
        personas[5]  = new Persona("Sofía", 24);
        personas[6]  = new Persona("Javier", 21);
        personas[7]  = new Persona("Lucía", 17);
        personas[8]  = new Persona("Mateo", 23);
        personas[9]  = new Persona("Valentina", 26);
        personas[10]  = new Persona("Diego", 18);
        personas[11]  = new Persona("Camila", 22);
        personas[12]  = new Persona("Andrés", 27);
        personas[13]  = new Persona("Paula", 19);
        personas[14]  = new Persona("Fernando", 24);
        personas[15]  = new Persona("Daniela", 20);
        personas[16]  = new Persona("Ricardo", 28);
        personas[17]  = new Persona("Gabriela", 21);
        personas[18]  = new Persona("Samuel", 23);
        personas[19]  = new Persona("Elena", 18);
        

        return personas;
    }
}
