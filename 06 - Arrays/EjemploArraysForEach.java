public class EjemploArraysForEach {
    public static void main (String [] args) { 
        int mayor, menor, suma;
        int [ ] nums = {3,4,8,2}; 
        //Llamada a los métodos
        suma=sumar (nums);
        menor=calculoMenor(nums);
        mayor=calculoMayor(nums);
        System.out.println("El mayor es "+ mayor);
        System.out.println("El menor es "+ menor);
        System.out.println("La suma es "+ suma);
    }
    static int sumar (int numeros []){
        int s = 0;
        for(int n: numeros ){ 
            s+=n;
        }
        return s;
    }
    static int calculoMayor (int numeros []){ 
        int may=numeros [0]; 
        for(int n:numeros){ 
            if (n>may) {
                may=n;
            }
        }

        return may;
    }
    static int calculoMenor (int numeros []){ 
        int men=numeros [0];
        for(int n: numeros ){ 
            if (n<men) {
            men=n;
            }
        }
        return men;
    }
    

}