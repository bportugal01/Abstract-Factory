/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */


// Implementação concreta da interface Button para o sistema MacOS
public class MacOSButton implements Button {

    // Método responsável por renderizar o botão específico do MacOS
    @Override
    public void paint() {
        System.out.println("Você criou o MacOSButton.");
    }
}