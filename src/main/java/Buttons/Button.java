/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buttons;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 *
 * This is the common interface for buttons family.
 */

// Interface que define um botão genérico para a interface gráfica
public interface Button {
    
    // Método abstrato que será implementado pelas classes concretas
    // Cada implementação definirá como o botão será renderizado (pintado) na tela
    void paint();
}