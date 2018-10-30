/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_1;

/**
 *
 * @author Gabriel
 */
public class Libro{
    private String titulo,autor;
    private int numExemplares,numPrestados;
    
    public Libro(){
    }
    
    public Libro(String titulo,String autor,int numExemplares,int numPrestados){
        this.titulo = titulo;
        this.autor = autor;
        this.numExemplares = numExemplares;
        this.numPrestados = numPrestados;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getNumExemplares(){
        return numExemplares;
    }
    
    public int getNumPrestados(){
        return numPrestados;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setNumExemplares(int numExemplares){
        this.numExemplares = numExemplares;
    }
    
    public void setNumPrestados(int numPrestados){
        this.numPrestados = numPrestados;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String datos = "-\tTitulo: " + titulo + "\n-\tAutor: " + autor + "\n-\tNumero de exemplares: " + numExemplares + "\n-\tNumero de exemplares prestados: " + numPrestados;
        return datos;
    }
    
    public boolean prestar(int cantidade){
        if(cantidade > 0 && numExemplares > 0 && numExemplares - cantidade >= 0){
            numExemplares -= cantidade;
            numPrestados += cantidade;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean devolver(int cantidade){
        if(cantidade > 0 && numPrestados > 0 && numPrestados - cantidade >= 0){
            numExemplares += cantidade;
            numPrestados -= cantidade;
            return true;
        }else{
            return false;
        }
    }
    
}
