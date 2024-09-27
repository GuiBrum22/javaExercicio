package com.example;



@AllArgsConstructior
@NoArgsConstructitor
@Setter
@Gatter
public class Eletronico extends Produto{
    private double volume;

    public Eletronico(String nome, double preco, double volume){
        super(nome, preco);
        this.volume=volume;
    }
}
