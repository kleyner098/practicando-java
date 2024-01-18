public class EjemploArraysFunciones {
    public static void main (String [] args) { 
        int mayor, menor, suma; 
        int [ ] nums = {3,4,8,2}; 
        //Llamada a los métodos 
        suma= sumar (nums); 
        menor=calculoMenor (nums); 
        mayor=calculoMayor (nums);
        System.out.println ("El mayor es "+ mayor); 
        System.out.println ("El menor es "+ menor); 
        System.out.println ("La suma es "+ suma);
    }

    static int [] getNumeros (int n) {
        int [] nums=new int [5];
        for (int i=0 ; i<nums.length;i++){
            nums[i] =n+i+1;
        }
        return nums;
    }
        
    
    static int sumar (int numeros []){
        int suma=0;
        for(int i=0 ; i<numeros.length; i++) { 
            suma+=numeros[i];
        }
        return suma;
    }
        
    static int calculoMayor (int numeros []){ 
        int may=numeros[0]; 
        for(int i=0; i<numeros.length;i++){
            if (numeros[i] >may) {
                may=numeros [i];
            }
        }
        return may;
    }
    
    static int calculoMenor (int numeros []){ 
        int men=numeros [0] ; 
        for (int i=0 ; i<numeros.length; i++) { 
            if (numeros[i] <men) {
                men=numeros [i];
            }
        }
        return men;
    }
        
}

