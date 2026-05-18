public class BurbujaAvanzado {
    public static void ordenarByName(Persona[] personas){
        int n = personas.length;
        boolean intercambio;
        for(int i = 0;i< n -1;i++){
            intercambio = false;
            for(int j = 0; j < n -1 -i;j++){

                if(personas[j].nombre.compareTo(personas[j + 1].nombre) > 0 ){
                    Persona aux = personas[j];
                    personas[j ] = personas[j +1];
                    personas[j +1] = aux;
                    intercambio = true;


                }
            }
            if(! intercambio)
                break;
        }

    }
    public static void imprimir(Persona[] personas){
        for(Persona personita : personas)
            System.out.println(personita.getNombre());


    }
    

    
    
}
