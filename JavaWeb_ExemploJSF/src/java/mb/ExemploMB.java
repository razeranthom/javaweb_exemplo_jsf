/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;


/**
 *
 * @author razer
 */
@Named(value = "exemploMB")
@ViewScoped
public class ExemploMB implements Serializable {
    private String texto;
    private int numero;

    public ExemploMB() {
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void processar() {
        this.texto = this.texto.toUpperCase();
        this.numero = this.numero * this.numero;
    }
}
