public class Carro{
//atributos obrigatorios e opcionais
    private int portas;
    private int chassi;
    private int ano;
    private String combustivel;
    private String cor;
    private boolean arCondicionado;

//atributos obrigatorios são declarado entre ( ) no objeto
    public Carro(int portas, int chassi, int ano, String combustivel){
        this.portas = portas;
        this.chassi = chassi;
        this.ano = ano;
        this.combustivel = combustivel;
        setCor(cor);
        setArCondicionado(arCondicionado);
        
    }

//atributos opcionais são declarado no encapsulamento
    public String getCor(){
        return cor;
            }
    
    public boolean getArCondicionado(){
        return arCondicionado;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setArCondicionado(boolean arCondicionado){
        this.arCondicionado = arCondicionado;
    }

//metodo para imprimir    
    public void imprime(){
        if(cor != null){
        if(arCondicionado == true){
        
        System.out.println("O carro tem " + this.portas + " portas, chassi " + this.chassi + ", é do ano "
        + this.ano + ", o combustível é " + this.combustivel + ", sua cor é " + getCor() + 
        " e tem ar condicionado");
        }
        
        else{
            System.out.println("O carro tem " + this.portas + " portas, chassi " + this.chassi + ", é do ano "
        + this.ano + ", o combustível é " + this.combustivel + " e sua cor é " + getCor());
        }
        }
        

        else{
            if(arCondicionado == true){
        
                System.out.println("O carro tem " + this.portas + " portas, chassi " + this.chassi + ", é do ano "
                + this.ano + ", o combustível é " + this.combustivel + " e tem ar condicionado");
                }
                
                else{
                    System.out.println("O carro tem " + this.portas + " portas, chassi " + this.chassi + ", é do ano "
                + this.ano + ", o combustível é " + this.combustivel);
                }
            }    
        
    
    
}
}



