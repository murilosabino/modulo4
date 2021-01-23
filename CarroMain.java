public class CarroMain {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro(4, 25463, 2010, "gasolina");
            
        carro1.imprime();
        
        Carro carro2 = new Carro(4, 36548, 2019, "flex");
        carro2.setArCondicionado(true);
        carro2.setCor("vermelho");
        carro2.imprime();
    

    
    }
   }

